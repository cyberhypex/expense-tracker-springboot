package com.expensetracker.expense_tracker.Service;

import com.expensetracker.expense_tracker.Entity.Expense;
import com.expensetracker.expense_tracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

  public String add(String description, Integer amount) {
        Expense exp=new Expense();
        exp.setDescription(description);
        exp.setCredited(true);
        exp.setAmount(amount);

        expenseRepository.save(exp);
        return "Amount Credited for :"+description+":"+amount;

    }

   public String deduct(String description, Integer amount) {
        Expense exp=new Expense();
        exp.setDescription(description);
        exp.setAmount(amount);
        exp.setDebited(true);

        expenseRepository.save(exp);
        return "Amount debited for :"+description+":"+amount;
    }

    List<Expense> track(String username) {
        return null;
    }

}

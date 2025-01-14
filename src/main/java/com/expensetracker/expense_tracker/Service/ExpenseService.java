package com.expensetracker.expense_tracker.Service;

import com.expensetracker.expense_tracker.Entity.Expense;

import java.util.List;

public interface ExpenseService {

    Expense add(String description, Integer amount);
    Expense deduct(String description,Integer amount);

    List<Expense> track(String username);

}

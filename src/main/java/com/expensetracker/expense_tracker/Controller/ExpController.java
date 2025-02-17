package com.expensetracker.expense_tracker.Controller;


import com.expensetracker.expense_tracker.Entity.Expense;
import com.expensetracker.expense_tracker.Service.ExpenseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpController {

    private  final  ExpenseService expenseService;

    public ExpController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }


    @PostMapping("/credit/{description}/{amount}")
    public String credit(@PathVariable String description,
                         @PathVariable Integer amount
                         ){
        expenseService.add(description,amount);
        return "Money Credited with amount:"+ amount+" "+"against:"+description;
    }

    @PostMapping("/debit/{description}/{amount}")
    public String debit(@PathVariable String description,
                        @PathVariable Integer amount
                        ){
        expenseService.deduct(description,amount);
        return "Money debited for :"+description+" with amount :"+amount;
    }

    @GetMapping("/getAllCredited")
    public List<Expense> getAllCredited(){
        return expenseService.getAllCredited();

    }


    @GetMapping("/getAllDebited")
    public List<Expense> getAllDebited(){
        return expenseService.findByIsDebitedTrue();
    }

    @GetMapping("/sumOfCredited")
    public Double getSumOfCreditedExpenses() {
        return expenseService.getSumOfCreditedExpenses();
    }


    @GetMapping("/sumOfDebited")
    public Double getSumOfDebitedExpenses(){
        return expenseService.getSumOfDebitedExpenses();
    }
}

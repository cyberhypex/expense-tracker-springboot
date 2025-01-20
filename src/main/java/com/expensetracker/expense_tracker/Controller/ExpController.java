package com.expensetracker.expense_tracker.Controller;


import com.expensetracker.expense_tracker.Service.ExpenseService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

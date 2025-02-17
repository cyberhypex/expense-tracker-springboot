package com.expensetracker.expense_tracker.repository;

import com.expensetracker.expense_tracker.Entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
    @Query("SELECT SUM(e.amount) FROM Expense e WHERE e.isCredited = true")
    Double sumOfCreditedExpenses();

    @Query("SELECT SUM(e.amount) FROM Expense e WHERE e.isDebited=true")
    Double sumofDebitedExpenses();

    List<Expense> findByIsCreditedTrue();

    List<Expense> findByIsDebitedTrue();



}

package com.expensetracker.expense_tracker.repository;

import com.expensetracker.expense_tracker.Entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {

}

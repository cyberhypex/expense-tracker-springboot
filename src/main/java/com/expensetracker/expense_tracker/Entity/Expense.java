package com.expensetracker.expense_tracker.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String description;

    private String username;

    private Integer amount;

    private Boolean isCredited=false;

    private Boolean isDebited=false;


}

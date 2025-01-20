package com.expensetracker.expense_tracker.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;


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


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getCredited() {
        return isCredited;
    }

    public void setCredited(Boolean credited) {
        isCredited = credited;
    }

    public Boolean getDebited() {
        return isDebited;
    }

    public void setDebited(Boolean debited) {
        isDebited = debited;
    }
}

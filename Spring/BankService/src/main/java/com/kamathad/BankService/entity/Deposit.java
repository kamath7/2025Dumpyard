package com.kamathad.BankService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Deposit {

    private Long id;
    private double amount;
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name="account_id")
    private Account account;

    public Deposit(double amount, LocalDateTime timestamp, Account account) {
        this.amount = amount;
        this.timestamp = timestamp;
        this.account = account;
    }

    public Deposit() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

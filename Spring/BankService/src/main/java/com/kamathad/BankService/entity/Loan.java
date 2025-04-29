package com.kamathad.BankService.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    private LocalDateTime localDateTime;

    @ManyToOne
    @JoinColumn(name="account_id")
    private Account account;

    public Loan() {
    }

    public Loan(double amount, LocalDateTime localDateTime, Account account) {
        this.amount = amount;
        this.localDateTime = localDateTime;
        this.account = account;
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

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", amount=" + amount +
                ", localDateTime=" + localDateTime +
                ", account=" + account +
                '}';
    }
}

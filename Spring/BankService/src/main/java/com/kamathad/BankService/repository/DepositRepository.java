package com.kamathad.BankService.repository;

import com.kamathad.BankService.entity.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositRepository extends JpaRepository<Deposit, Long> {
}

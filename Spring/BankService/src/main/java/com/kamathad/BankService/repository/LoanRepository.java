package com.kamathad.BankService.repository;

import com.kamathad.BankService.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}

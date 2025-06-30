package com.kamathad.BankService.repository;

import com.kamathad.BankService.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}

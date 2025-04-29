package com.kamathad.BankService.repository;

import com.kamathad.BankService.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}

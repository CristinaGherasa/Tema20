package com.fasttrack.tema20.Tema20;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByType(TransactionType type);
    List<Transaction> findByAmountGreaterThanEqual(double minAmount);
    List<Transaction> findByAmountLessThanEqual(double maxAmount);
    List<Transaction> findByTypeAndAmountGreaterThanEqual(TransactionType type, double minAmount);
    List<Transaction> findByTypeAndAmountLessThanEqual(TransactionType type, double maxAmount);
    List<Transaction> findByAmountBetween(double minAmount, double maxAmount);
    List<Transaction> findByTypeAndAmountBetween(TransactionType type, double minAmount, double maxAmount);
}

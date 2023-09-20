package com.fasttrack.tema20.Tema20;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/{id}")
    public Transaction getTransactionById(@PathVariable Long id) {
        return transactionService.getTransactionById(id);
    }

    @PostMapping
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return transactionService.addTransaction(transaction);
    }

    @PutMapping("/{id}")
    public Transaction replaceTransaction(@PathVariable Long id, @RequestBody Transaction transaction) {
        return transactionService.replaceTransaction(id, transaction);
    }

    @PatchMapping("/{id}")
    public Transaction updateTransaction(@PathVariable Long id, @RequestBody Transaction transaction) {
        return transactionService.updateTransaction(id, transaction);
    }

    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        transactionService.deleteTransaction(id);
    }

    @GetMapping("/reports/type")
    public Map<TransactionType, Double> getTypeToSumMap() {
        return transactionService.getTypeToSumMap();
    }

    @GetMapping("/reports/product")
    public Map<String, Double> getProductToSumMap() {
        return transactionService.getProductToSumMap();
    }
}

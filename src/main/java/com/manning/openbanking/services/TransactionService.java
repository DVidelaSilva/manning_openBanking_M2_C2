package com.manning.openbanking.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manning.openbanking.entities.Transaction;
import com.manning.openbanking.repositories.MerchantDetailsRepository;
import com.manning.openbanking.repositories.TransactionApiClient;
import com.manning.openbanking.repositories.TransactionRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class TransactionService {

    private final TransactionApiClient transactionApiClient;
    private final MerchantDetailsRepository merchantDetailsRepository;
    
    public TransactionService(
        final TransactionApiClient transactionApiClient,
        final MerchantDetailsRepository merchantDetailsRepository) {
        this.transactionApiClient = transactionApiClient;
        this.merchantDetailsRepository = merchantDetailsRepository;
}



    @CircuitBreaker(name = "transactionService", fallbackMethod = "foundNone")
    public List<Transaction> findAllByAccountNumber(Integer accountNumber){
        var transactions = transactionApiClient.findByAccountNumber(accountNumber);
        transactions.forEach(transaction -> {
            merchantDetailsRepository
                .findMerchantLogo(transaction.getMerchantName())
                .ifPresent(logo -> transaction.setMerchantLogo(logo)
                );
        });
        return transactions;
    }


    private List<Transaction> foundNone(Integer accountNumber, Throwable throwable){
        return Collections.emptyList();
    }

}

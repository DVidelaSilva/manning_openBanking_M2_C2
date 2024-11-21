package com.manning.openbanking.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manning.openbanking.entities.Transaction;


public interface MerchantDetailsRepository {

    Optional<String> findMerchantLogo(String merchantName);

}


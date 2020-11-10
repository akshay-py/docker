package com.sapiens.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sapiens.model.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long>{

}
package com.roma.service;

import com.roma.service.dto.TransactionDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Transaction.
 */
public interface TransactionService {

    /**
     * Save a transaction.
     *
     * @param transactionDTO the entity to save
     * @return the persisted entity
     */
    TransactionDTO save(TransactionDTO transactionDTO);

    /**
     * Get all the transactions.
     *
     * @return the list of entities
     */
    List<TransactionDTO> findAll();


    /**
     * Get the "id" transaction.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<TransactionDTO> findOne(Long id);

    /**
     * Delete the "id" transaction.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}

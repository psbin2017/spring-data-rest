package com.repositories.rest.repository;

import com.repositories.rest.domain.Cart;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CartRepository
 */
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
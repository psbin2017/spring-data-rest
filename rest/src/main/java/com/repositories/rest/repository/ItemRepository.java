package com.repositories.rest.repository;

import com.repositories.rest.domain.Item;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ItemRepository
 */
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
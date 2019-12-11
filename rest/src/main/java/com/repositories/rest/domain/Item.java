package com.repositories.rest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Item
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter(value = AccessLevel.PRIVATE)
@Getter
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private long payment;

    @ManyToOne
    @JoinColumn(name = "CART_ID")
    private Cart cart;

}
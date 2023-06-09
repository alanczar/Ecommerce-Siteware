package com.testeSiteWare.ecommerce.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

public abstract  class Promotions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Product name is required.")
    @Basic(optional = false)
    private String name;

    public abstract double calculatePrice(int quantity, double unitPrice);

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}

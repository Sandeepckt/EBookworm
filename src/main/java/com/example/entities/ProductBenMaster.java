package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProductBenMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodBenId;
    
    @ManyToOne
    @JoinColumn(name = "prodBenBenId")
    private BeneficiaryMaster beneficiary;
    
    @ManyToOne
    @JoinColumn(name = "prodBenProductId")
    private ProductMaster product;
    
    private double prodBenPercentage;
    
    // Getter and setter methods
}
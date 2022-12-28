package com.anouerdev.resto.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
@DiscriminatorValue(value = "entree")
public class Entree extends Met {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id ;
    
}

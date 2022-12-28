package com.anouerdev.resto.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;
@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class Met {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id ;

    @Column (nullable = false)
    private String nom ;

    private float prix ;


    @ManyToMany
   private Collection<Ticket> tickets;

    
}

package com.anouerdev.resto.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero ;

    @Column(nullable = false)
    private int nbcouvert ;

    private String types ;

    private Float supplement ;

    @OneToMany(targetEntity = Ticket.class)
    @JoinColumn(name = "table_id")
    private Collection<Ticket> tickets;
    
}

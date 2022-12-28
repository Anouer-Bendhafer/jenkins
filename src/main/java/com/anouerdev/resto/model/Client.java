package com.anouerdev.resto.model;

import java.util.Collection;
import java.util.Date;

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
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private Date dateDenaissance;

    private String courriel;

    private String telephone;

    @OneToMany(targetEntity = Ticket.class)
    @JoinColumn(name = "client_id")
    private Collection<Ticket> tickets;

}

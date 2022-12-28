package com.anouerdev.resto.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero;

    @Column(nullable = false)
    private Date dateTime;

    private int nbCouvert;

    private Float addition;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Tables tables ;

    @ManyToMany
    @JoinTable(name = "ticket_met", joinColumns = @JoinColumn(name = "ticket_id",referencedColumnName="id"),inverseJoinColumns = @JoinColumn(name="met_id",referencedColumnName="id"))
    private Collection<Met> mets ;

}

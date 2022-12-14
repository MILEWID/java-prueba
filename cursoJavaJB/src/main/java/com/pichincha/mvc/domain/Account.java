/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pichincha.mvc.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pichincha.mvc.service.util.StateEnum;
import com.pichincha.mvc.service.util.TypeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;

/**
 *
 * @author Jessi Trabajo
 */
@Entity 
@Table(name = "cuenta")
public class Account{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String numAcc;
     @Column 
     private TypeEnum  type;
      @Column 
      @JsonFormat(pattern="yyyy-MM-dd")
     private Date  dateOppened;
     @Column
     @Enumerated(EnumType.STRING)
     private StateEnum  state;
     
    @ManyToOne
    @JoinColumn(name="idClient", nullable=false)
   private Client  client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumAcc() {
        return numAcc;
    }

    public void setNumAcc(String numAcc) {
        this.numAcc = numAcc;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Date getDateOppened() {
        return dateOppened;
    }

    public void setDateOppened(Date dateOppened) {
        this.dateOppened = dateOppened;
    }

    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }


     
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pichincha.mvc.domain;

import com.pichincha.mvc.service.util.StateEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;

/**
 *
 * @author Jessi Trabajo
 */
@MappedSuperclass
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPeople;
    @Column(name = "numero_identificacion")
    private String  numIden;
    @Column
    private String name;
    @Column
    private String lastname;
    @Column
    private String location;
    @Column
    private String cellphone;
    @Column
    private String yea;
    @Column
    @Enumerated(EnumType.STRING)
    private StateEnum  state;

    public Long getIdPeople() {
        return idPeople;
    }

    public void setIdPeople(Long idPeople) {
        this.idPeople = idPeople;
    }

  

    public String getNumIden() {
        return numIden;
    }

    public void setNumIden(String numIden) {
        this.numIden = numIden;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getYea() {
        return yea;
    }

    public void setYea(String yea) {
        this.yea = yea;
    }

    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }
    
    
}

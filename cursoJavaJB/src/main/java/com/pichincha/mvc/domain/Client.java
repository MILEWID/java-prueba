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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Set;

/**
 *
 * @author Jessi Trabajo
 */

@Entity
@Table(name = "cliente")
public class Client extends People {
        
    @Column
    @NotBlank(message = "codClient  is required")
    @Size(min = 5, max = 10)
    private String codClient;
    @Column
    @NotBlank(message = "user  is required")
    private String username;
    @Column
    @NotBlank(message = "password is required")
    @Size(min = 4, max = 12)
    private String pass;
    
  @OneToMany(mappedBy="client")
    private Set<Account> account;

    public Set<Account> getAccount() {
        return account;
    }

    public void setAccount(Set<Account> account) {
        this.account = account;
    }

  
  
    public String getCodClient() {
        return codClient;
    }

    public void setCodClient(String codClient) {
        this.codClient = codClient;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

  


        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pichincha.mvc.repository;

import com.pichincha.mvc.domain.Client;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jessi Trabajo
 */

 @Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
    @Query(value ="SELECT * FROM cliente",nativeQuery = true)
    Optional<ArrayList> getAllClients();
     @Query("SELECT c FROM Client c")
    Optional<ArrayList> getAllClientsJPQL();
     @Query("SELECT c FROM Client c WHERE c.state = ?1")
      Optional<ArrayList> getClientsByState();
}

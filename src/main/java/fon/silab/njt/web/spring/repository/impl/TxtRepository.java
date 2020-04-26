/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.web.spring.repository.impl;

import fon.silab.njt.web.spring.repository.Repository;

/**
 *
 * @author KORISNIK
 */
@org.springframework.stereotype.Repository(value = "txt")
public class TxtRepository implements Repository{

    public TxtRepository() {
        System.out.println("constructor TxtRepository...");
    }
  
    @Override
    public void save(String message) {
        System.out.println(message);
    }
    
}

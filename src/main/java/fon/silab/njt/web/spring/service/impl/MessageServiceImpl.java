/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.web.spring.service.impl;

import fon.silab.njt.web.spring.repository.Repository;
import fon.silab.njt.web.spring.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author KORISNIK
 */
@Service(value = "messageService")
public class MessageServiceImpl implements MessageService{
//    @Autowired
//    @Qualifier(value = "txt")
//    private Repository repository;
    
//    @Autowired
//    public MessageServiceImpl(@Qualifier(value = "xml") Repository repository) {
//        this.repository = repository;
//    }
    
    @Autowired
    private Repository xml;
    
    @Override
    public void save(String message) {
        xml.save(message);
    }
    
}

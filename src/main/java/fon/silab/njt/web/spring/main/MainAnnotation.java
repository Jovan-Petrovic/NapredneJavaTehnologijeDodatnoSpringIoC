/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.web.spring.main;

import fon.silab.njt.web.spring.main.config.MyApplicationConfig;
import fon.silab.njt.web.spring.repository.Repository;
import fon.silab.njt.web.spring.service.MessageService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author KORISNIK
 */
@Component
public class MainAnnotation {
    
    public static void main(String[] args) {
        // ucitati spring IoC container
        BeanFactory container = new AnnotationConfigApplicationContext(MyApplicationConfig.class);
        MainAnnotation main = container.getBean(MainAnnotation.class);
        // Main main = new Main();       
        main.saveServiceMessage(container, "Ovo je moja poruka");
        
    }

    private void saveMessage(BeanFactory container, String message) {
        //repository
        Repository txtRepository = container.getBean("txt", Repository.class);
        // sacuvaj poruku
        txtRepository.save(message);
        
        Repository xmlRepository = container.getBean("xml", Repository.class);
        xmlRepository.save(message);
    }

    private void saveServiceMessage(BeanFactory container, String message) {
        MessageService messageService = container.getBean("messageService", MessageService.class);
        messageService.save(message);
    }
}

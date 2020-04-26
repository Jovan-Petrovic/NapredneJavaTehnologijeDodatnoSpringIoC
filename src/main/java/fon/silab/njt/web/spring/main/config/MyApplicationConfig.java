/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.web.spring.main.config;

import fon.silab.njt.web.spring.main.Main;
import fon.silab.njt.web.spring.repository.Repository;
import fon.silab.njt.web.spring.repository.impl.TxtRepository;
import fon.silab.njt.web.spring.repository.impl.XmlRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**TxtReposit
 *
 * @author KORISNIK
 */
@ComponentScan(basePackages = {
    "fon.silab.njt.web.spring.repository",
    "fon.silab.njt.web.spring.main",
    "fon.silab.njt.web.spring.service"
})
public class MyApplicationConfig {

    public MyApplicationConfig() {
        System.out.println("constructor MyApplicationConfig...");
    }
    
 /*   @Bean(name = "txt")
    public Repository getTxtRepository() {
        System.out.println("method getTxtRepository");
        return new TxtRepository();
    }
    
    @Bean(name = "xml")
    public Repository getXmlRepository() {
        System.out.println("method getXmlRepository");
        return new XmlRepository();
    }
    
    @Bean(name = "main")
    public Main getMain() {
        return new Main();
    }*/
}

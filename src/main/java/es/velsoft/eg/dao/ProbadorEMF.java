/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.velsoft.eg.dao;

import java.util.Map;
import javax.persistence.EntityManager;

/**
 *
 * @author SGEN0290
 */
public class ProbadorEMF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        EntityManager session = EntityManagerHelper.getEMF().createEntityManager();
     
        
        Map<String, Object> mapa = session.getEntityManagerFactory().getProperties();
        /*
        System.out.println("\n\nPROPIEDADES DEL EMF");
        mapa.entrySet().forEach((m) -> {
            String clave = m.getKey();
            Object o = m.getValue();
            System.out.println(clave +" -> " + o.toString());
        });
        */
        String valor = (String)mapa.get(new String("hibernate.ejb.persistenceUnitName"));
        if ("eg_JPA_MYSQL".equals(valor)) {
            System.out.println("Estamos con MySQL");    
        } else if ("eg_JPA_SQLSERVER".equals(valor)) {
                        System.out.println("Estamos con SQLServer");    
        } else System.out.println("Estamos mal, muy mal");

    }
    
}

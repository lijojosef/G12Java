
package com.lijo.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//      Alien a = new Alien();
//      a.setAid(12);
//      a.setAname("Aji");
//      a.setTech("SQL");
//      
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu2");
    	EntityManager em = emf.createEntityManager();
    	
    	Alien a = em.find(Alien.class, 2);
    	em.getTransaction().begin();
    	em.persist(a);
    	em.getTransaction().commit();
    	System.out.println(a);
    	
    }
}

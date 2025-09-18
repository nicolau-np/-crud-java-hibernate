/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.np.novo.projecto.hibernate;

import com.np.novo.projecto.hibernate.models.Pessoa;
import com.np.novo.projecto.hibernate.telas.pessoa.create;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author HP
 */
public class NovoProjectoHibernate {

    public static void main(String[] args) {
        /*Pessoa pessoa = new Pessoa();
        pessoa.setEmail("marina@hotmail.com");
        pessoa.setNome("Marina Pelo");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();

        System.out.println("Pronto!");
        em.close();
        emf.close();*/
        
        /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        
        Pessoa pessoa = em.find(Pessoa.class, 4);
        
        System.out.println(pessoa);
        em.close();
        emf.close();*/
        
        
        /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        
        Pessoa pessoa = em.find(Pessoa.class, 4);
        em.getTransaction().begin();
        em.remove(pessoa);
        em.getTransaction().commit();
        
        System.out.println(pessoa);
        em.close();
        emf.close();*/
        
        new create().setVisible(true);
    }
}

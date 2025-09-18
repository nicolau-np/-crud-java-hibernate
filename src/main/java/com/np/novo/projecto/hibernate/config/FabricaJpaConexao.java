/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.np.novo.projecto.hibernate.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author HP
 */
public class FabricaJpaConexao {

    private static EntityManager entityManager;

    public static void conectar() {
        try {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
            entityManager = entityManagerFactory.createEntityManager();
            System.out.println("Conexao realizada com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    public static void setEntityManager(EntityManager entityManager) {
        FabricaJpaConexao.entityManager = entityManager;
    }
}

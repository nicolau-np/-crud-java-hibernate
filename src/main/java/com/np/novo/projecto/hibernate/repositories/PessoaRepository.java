/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.np.novo.projecto.hibernate.repositories;

import com.np.novo.projecto.hibernate.config.FabricaJpaConexao;
import com.np.novo.projecto.hibernate.models.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author HP
 */
public class PessoaRepository {

    private EntityManager entityManager;

    public PessoaRepository() {
        entityManager = FabricaJpaConexao.getEntityManager();
    }

    public void store(Pessoa pessoa) {
        entityManager.getTransaction().begin();
        entityManager.persist(pessoa);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void update(Pessoa pessoa) {
        entityManager.getTransaction().begin();
        entityManager.merge(pessoa);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void delete(Integer id) {
        Pessoa pessoa = findById(id);
        if (pessoa != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(pessoa);
            entityManager.getTransaction().commit();
            entityManager.close();
        }

    }

    public Pessoa findById(Integer id) {
        Pessoa pessoa = entityManager.find(Pessoa.class, id);

        return pessoa;
    }
    
    public List<Pessoa> findAll(){
        Query query = entityManager.createQuery("SELECT p FROM Pessoa p");
        
        return query.getResultList();
    }
}

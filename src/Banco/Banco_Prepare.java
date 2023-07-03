/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author lucas
 */
public class Banco_Prepare {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PreparativoexPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction etx = em.getTransaction();
    
    public void Inserir(Object o){
       etx.begin();
        em.persist(o);
        etx.commit();
        em.close();   
    }
    public void Remover (Object o){
        etx.begin();
        em.remove(o);
        etx.commit();
        em.close();
    }
    public void Update(Object o){
        etx.begin();
        em.merge(o);
        etx.commit();
        em.close();
    }
    public List listar(Object o){
        Query query = em.createQuery("SELECT o FROM "+o.getClass().getSimpleName()+" o");
        return query.getResultList();
    }
  
    
}

package com.dao;

import models.ClientEntity;
import org.hibernate.jpa.HibernatePersistenceProvider;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ClientDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionAutomobile");
    EntityManager em = emf.createEntityManager();

    public ClientEntity get(int id) {
        return em.find(ClientEntity.class, id);
    }



    public List<ClientEntity> get() {
        return em.createQuery("select u from ClientEntity u", ClientEntity.class)
                .getResultList();
    }



}

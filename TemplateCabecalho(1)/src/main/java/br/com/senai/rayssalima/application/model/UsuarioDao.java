package br.com.senai.rayssalima.application.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;



public class UsuarioDao {

    private EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("usuarios");
    private EntityManager em = factory.createEntityManager();

    public Usuario getUsuario(String nomeUsuario, String senha) {

      try {
        Usuario usuario = (Usuario) em
         .createQuery(
             "SELECT u from Usuario u where u.nomeUsuario = :name and u.senha = :senha")
         .setParameter("name", nomeUsuario)
         .setParameter("senha", senha).getSingleResult();

        return usuario;
      } catch (NoResultException e) {
            return null;
      }
    }

}
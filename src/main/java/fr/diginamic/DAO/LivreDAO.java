package fr.diginamic.DAO;


import fr.diginamic.entity.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LivreDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("sqlExpress");
    EntityManager em = emf.createEntityManager();

    public Livre findById(int id){
        return em.find(Livre.class, id);
    }
}

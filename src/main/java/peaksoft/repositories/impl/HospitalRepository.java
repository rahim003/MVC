package peaksoft.repositories.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import peaksoft.models.Hospital;
import peaksoft.repositories.HospitalRepo;

import java.util.List;

/**
 * @author krasa kurbanov
 * @created 15/02/2023 - 11:17
 **/
@Repository
public class HospitalRepository implements HospitalRepo {

    @PersistenceContext
    private final EntityManager entityManager;

    public HospitalRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public void saveHospital(Hospital hospital) {
        entityManager.getTransaction().begin();
        entityManager.persist(hospital);
        entityManager.getTransaction().commit();
        entityManager.close();
    }


    @Override
    public List<Hospital> findAll() {
        entityManager.getTransaction().begin();
        final List<Hospital> hospitals = entityManager.createQuery("select h from Hospital h",
                Hospital.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return hospitals;
    }
}

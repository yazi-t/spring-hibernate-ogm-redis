package test.redis.dao.impl;

import org.springframework.stereotype.Repository;
import test.redis.dao.VehicleDao;
import test.redis.model.Vehicle;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import java.util.List;

/**
 * Hibernate OGM REDIS
 *
 * Created by yasitha on 5/9/17.
 */
@Repository("vehicleDao")
public class VehicleDaoImpl implements VehicleDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Vehicle vehicle) {
        em.persist(vehicle);
    }

    @Override
    public Vehicle getById(String id) {
        long startTime = System.currentTimeMillis();
        Vehicle v = em.find(Vehicle.class, id);
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken: " + timeTaken + "ms");
        return v;
    }

    @Override
    public List<Vehicle> getAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Vehicle> query = cb.createQuery(Vehicle.class);
        return em.createQuery(query).getResultList();
    }
}

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
 * <p>This application demonstrates usage of hibernate OGM MongoDB provider
 * with spring MVC. Application consists of simple key-lookup based entity
 * search functionality. This demo uses standard JPA annotations and methods to
 * query data store.</p>
 *
 * <p>Repository implementation for vehicle model</p>
 *
 * @author Yasitha Thilakaratne
 * Date: 04/29/2017
 *
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

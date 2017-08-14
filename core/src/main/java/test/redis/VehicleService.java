package test.redis;

import test.redis.model.Vehicle;

import java.util.List;

/**
 * <p>This application demonstrates usage of hibernate OGM MongoDB provider
 * with spring MVC. Application consists of simple key-lookup based entity
 * search functionality. This demo uses standard JPA annotations and methods to
 * query data store.</p>
 *
 * <p>Service interface for vehicle Model. Implements business logic.</p>
 *
 * @author Yasitha Thilakaratne
 * Date: 04/29/2017
 *
 */
public interface VehicleService {

    /**
     * Saves vehicle in redis and put @id regNo as key
     * @param vehicle object to persist
     */
    void save(Vehicle vehicle);

    /**
     * Retrieves object by key
     * @param id regNo of vehicle
     * @return vehicle object
     */
    Vehicle getById(String id);

    /**
     * Rather that key-lookup returns all entities.
     * @return list of vehicles
     */
    List<Vehicle> getAll();
}

package test.redis.dao;

import test.redis.model.Vehicle;

import java.util.List;

/**
 * Hibernate OGM REDIS
 *
 * Created by yasitha on 5/9/17.
 */
public interface VehicleDao {

    void save(Vehicle vehicle);

    Vehicle getById(String id);

    List<Vehicle> getAll();
}

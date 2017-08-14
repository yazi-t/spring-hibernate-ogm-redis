package test.redis.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.redis.VehicleService;
import test.redis.dao.VehicleDao;
import test.redis.model.Vehicle;

import java.util.Date;
import java.util.List;

/**
 * <p>This application demonstrates usage of hibernate OGM MongoDB provider
 * with spring MVC. Application consists of simple key-lookup based entity
 * search functionality. This demo uses standard JPA annotations and methods to
 * query data store.</p>
 *
 * <p>Service implementation for vehicle Model. Implements business logic.</p>
 *
 * @author Yasitha Thilakaratne
 * Date: 04/29/2017
 *
 */
@Transactional
@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDao vehicleDao;

    @Override
    public void save(Vehicle vehicle) {
        vehicle.setRecordDate(new Date());
        vehicleDao.save(vehicle);
    }

    @Override
    public Vehicle getById(String id) {
        return vehicleDao.getById(id);
    }

    @Override
    public List<Vehicle> getAll() {
        return vehicleDao.getAll();
    }
}

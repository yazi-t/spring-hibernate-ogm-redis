package test.redis.model;

/**
 * <p>This application demonstrates usage of hibernate OGM MongoDB provider
 * with spring MVC. Application consists of simple key-lookup based entity
 * search functionality. This demo uses standard JPA annotations and methods to
 * query data store.</p>
 *
 * <p>Vehicle types. Since this is demo application using as enum constants.</p>
 *
 * @author Yasitha Thilakaratne
 * Date: 04/29/2017
 *
 */
public enum  Type {
    CAR,
    BUS,
    VAN,
    SUV
}

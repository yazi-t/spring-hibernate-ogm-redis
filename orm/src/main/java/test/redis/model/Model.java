package test.redis.model;

/**
 * <p>This application demonstrates usage of hibernate OGM MongoDB provider
 * with spring MVC. Application consists of simple key-lookup based entity
 * search functionality. This demo uses standard JPA annotations and methods to
 * query data store.</p>
 *
 * <p>Vehicle models. Since this is demo application using as enum constants.</p>
 *
 * @author Yasitha Thilakaratne
 * Date: 04/29/2017
 *
 */
public enum Model {
    TOYOTA_COROLLA,
    HONDA_CIVIC,
    NISSAN_GTR,
    MAZDA_RX8,
    PORCHE_CARERA_911,
    FERRARI_LA_DERRARI
}

# spring-hibernate-ogm-redis
Hibernate OGM redis project with Spring MVC integration

This sample project has been developed with hibernate OGM Mongodb provider and Spring MVC framework.

## Installing

    Build project using mvn clean install.
    Run inside Java EE or servlet container.

## Deployment

    JDK Version: Java 8 is required as mandetory for hibernate OGM version used.
    Server: Apache Tomcat has been used for testing
    Build tool: Maven
    Datastore: Redis 3.2.8 64 bit

## Authors

    Yasitha Thilakaratne (Initial Author)
    
## Screens

### Redis CLI
![Redis CLI](/screens/sreen01_cli.png?raw=true "Redis CLI")

## Code
### Persistance.xml
```
<?xml version="1.0"?>
<persistence xmlns="http://java.sun.com/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
             version="2.0">

    <persistence-unit name="redis-sample" transaction-type="RESOURCE_LOCAL">
        <!-- Use Hibernate OGM provider: configuration will be transparent -->
        <provider>org.hibernate.ogm.jpa.HibernateOgmPersistence</provider>

        <class>test.redis.model.Vehicle</class>

        <properties>
            <property name="hibernate.ogm.datastore.provider" value="redis_experimental" />
            <property name="hibernate.ogm.datastore.create_database" value="true"/>
            <property name="hibernate.ogm.datastore.database" value="0"/>
        </properties>
    </persistence-unit>
</persistence>
```
### Model Class
```
@Entity
public class Vehicle {


    @Id
    @Column(name = "reg_no")
    private String reNo;

    @Column(name = "type")
    @Enumerated
    private Type type;
    //
 }
 ```
 ### DAO Class
 ```
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
```
### Spring configureations
```
<bean id="entityManagerFactory" class="org.springframework.orm.jpa.LocalEntityManagerFactoryBean">
        <property name="persistenceUnitName" value="redis-sample" />
    </bean>

    <bean class="org.springframework.orm.jpa.JpaTransactionManager" id="transactionManager">
        <property name="entityManagerFactory" ref="entityManagerFactory" />
    </bean>

    <tx:annotation-driven transaction-manager="transactionManager"/>

    <bean class="org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor" />
```

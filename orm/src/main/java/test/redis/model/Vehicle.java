package test.redis.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yasitha on 5/9/17.
 */
@Entity
public class Vehicle {


    @Id
    @Column(name = "reg_no")
    private String reNo;

    @Column(name = "type")
    @Enumerated
    private Type type;

    @Column(name = "modal")
    @Enumerated(EnumType.STRING)
    private Model model;

    @Column(name = "manufacturing_year")
    private int manufacturingYear;

    @Column(name = "chessy_no")
    private String chassisNo;

    @Column(name = "engine_capacity")
    private double engineCapacity;

    @Column(name = "record_date")
    private Date recordDate;

    public Vehicle(String reNo, Type type, Model model, int manufacturingYear, String chassisNo, double engineCapacity, Date recordDate) {
        this.reNo = reNo;
        this.type = type;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.chassisNo = chassisNo;
        this.engineCapacity = engineCapacity;
        this.recordDate = recordDate;
    }

    public Vehicle() {
    }

    public String getReNo() {
        return reNo;
    }

    public void setReNo(String reNo) {
        this.reNo = reNo;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }
}

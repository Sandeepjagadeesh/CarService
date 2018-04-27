/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 *
 * @author Sathwick
 */

@Entity
@Table
@NamedQueries({@NamedQuery(name="Cars.getCars",query="SELECT e FROM Cars e")})
public class Cars implements Serializable{
    
    @Id
    @Column
    private String carID;
    @Column
    private String make;
    @Column
    private String model;
    @Column
    private String year;
    @Column
    private String color;
    @Column
    private String type;
    @Column
    private String price;

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Cars(String carID, String make, String model, String year, String color, String type, String price) {
        this.carID = carID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.type = type;
        this.price = price;
    }
    
    public Cars(){}

    public Cars(String make, String model, String year, String color, String type, String price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.type = type;
        this.price = price;
    }
    
    
    
    
}

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
import javax.persistence.Table;


/**
 *
 * @author Sathwick
 */

@Entity
@Table
public class Cars implements Serializable{
    
    @Id
    @Column
    private String CarID;
    @Column
    private String Make;
    @Column
    private String Model;
    @Column
    private String ModelYear;
    @Column
    private String Color;
    @Column
    private String Type;
    @Column
    private String LicPlate;
    @Column
    private String Price;

    public String getCarID() {
        return CarID;
    }

    public void setCarID(String CarID) {
        this.CarID = CarID;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getModelYear() {
        return ModelYear;
    }

    public void setModelYear(String ModelYear) {
        this.ModelYear = ModelYear;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getLicPlate() {
        return LicPlate;
    }

    public void setLicPlate(String LicPlate) {
        this.LicPlate = LicPlate;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public Cars(String CarID, String Make, String Model, String ModelYear, String Color, String Type, String LicPlate, String Price) {
        this.CarID = CarID;
        this.Make = Make;
        this.Model = Model;
        this.ModelYear = ModelYear;
        this.Color = Color;
        this.Type = Type;
        this.LicPlate = LicPlate;
        this.Price = Price;
    }
    
    public Cars(){}
    
    
}

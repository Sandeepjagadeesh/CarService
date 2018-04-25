/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

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
public class Services {
    
    @Id
    @Column
    private String ServiceID;
    @Column
    private String ServiceType;
    @Column
    private String Price;

    public String getServiceID() {
        return ServiceID;
    }

    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public Services(String ServiceID, String ServiceType, String Price) {
        this.ServiceID = ServiceID;
        this.ServiceType = ServiceType;
        this.Price = Price;
    }
    
    public Services(){}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

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
@NamedQueries({@NamedQuery(name="Services.getAll",query="SELECT e FROM Services e")})
public class Services implements Serializable {
    
    @Id
    @Column
    private String serviceID;
    @Column
    private String serviceType;
    @Column
    private String price;

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Services(String serviceID, String serviceType, String price) {
        this.serviceID = serviceID;
        this.serviceType = serviceType;
        this.price = price;
    }
    
    public Services(){}
    
}

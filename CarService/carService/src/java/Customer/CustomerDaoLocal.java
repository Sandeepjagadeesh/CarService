/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sathwick
 */

@Local
public interface CustomerDaoLocal {

    Customer getCustomer(String loginID);

    List<Customer> getAllCustomer();
    
}

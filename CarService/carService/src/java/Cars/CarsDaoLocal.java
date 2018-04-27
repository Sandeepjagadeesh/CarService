/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sathwick
 */
@Local
public interface CarsDaoLocal {

    List<Cars> getAllCars();

    void addCars(Cars cars);
    
    
    
}

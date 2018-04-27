/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Sathwick
 */


@Stateless
public class CarsDao implements CarsDaoLocal {
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Cars> getAllCars() {
        return em.createNamedQuery("Cars.getCars").getResultList();
    }

    @Override
    public void addCars(Cars cars) {
        em.persist(cars);
    }
    
    
    
}

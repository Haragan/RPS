/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.GOST;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fours
 */
@Stateless
public class GOSTFacade extends AbstractFacade<GOST> implements GOSTFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication3-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GOSTFacade() {
        super(GOST.class);
    }
    
}

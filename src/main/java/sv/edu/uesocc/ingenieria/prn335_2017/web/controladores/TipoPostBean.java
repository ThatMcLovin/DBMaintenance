/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.controladores;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.GenericFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.TipoPostFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPost;

/**
 *
 * @author jacque
 */
@Named(value = "tipoPostBean")
@Dependent
public class TipoPostBean extends BeanGenerico<TipoPost> implements Serializable {

    /**
     * Creates a new instance of TipoPostBean
     */
    public TipoPostBean() {
    }
    
    @EJB
    TipoPostFacadeLocal tipoPostF;
    TipoPost Tipopost;
    List salida;

    public List getSalida() {
        return salida;
    }

    public void setSalida(List salida) {
        this.salida = salida;
    }
    
    @Override
    protected GenericFacadeLocal<TipoPost> getFacadeLocal() {
         return tipoPostF;
    }

    @Override
    public TipoPost getEntity() {
        return Tipopost;
    }
    
    public void llenarTipoPost(){
         
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sv.edu.uesocc.ingenieria.prn335_2017_P2_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        Query c = em.createNamedQuery("Usuario.noUtilizados");
        salida = c.getResultList();
        
        if(salida == null){
        salida = Collections.EMPTY_LIST;
        }
    }

    
    @PostConstruct
    public void init(){
     llenarTipoPost();
    }
    
    
    
    
}

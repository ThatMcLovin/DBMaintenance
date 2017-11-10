/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.controladores;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.AbstractInterface;
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
    
    @Override
    protected AbstractInterface<TipoPost> getFacadeLocal() {
         return tipoPostF;
    }

    @Override
    public TipoPost getEntity() {
        return Tipopost;
    }
    
    
    
    
    
    
}

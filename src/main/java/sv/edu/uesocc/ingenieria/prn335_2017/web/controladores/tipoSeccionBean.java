/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.view.ViewScoped;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.AbstractInterface;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.TipoSeccionFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoSeccion;

/**
 *
 * @author jacque
 */
@Named(value = "tipoSeccionBean")
@ViewScoped
public class tipoSeccionBean extends BeanGenerico<TipoSeccion> implements Serializable {

    /**
     * Creates a new instance of tipoSeccionBean
     */
    public tipoSeccionBean() {
    }
    @EJB
    TipoSeccionFacadeLocal tipoSeccionF;
    TipoSeccion tipoSeccion;
    List<TipoSeccion> filtroCat= new ArrayList<>();

    @Override
    protected AbstractInterface<TipoSeccion> getFacadeLocal() {
        return tipoSeccionF;
    }

    @Override
    public TipoSeccion getEntity() {
        return tipoSeccion;
    }
    
}

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
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.MetaFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Meta;

/**
 *
 * @author jacque
 */
@Named(value = "metaBean")
@ViewScoped
public class MetaBean extends BeanGenerico<Meta> implements Serializable {

    /**
     * Creates a new instance of MetaBean
     */
    public MetaBean() {
    }
    @EJB
    MetaFacadeLocal metaF;
    Meta meta;
    List<Meta> filtroCat = new ArrayList<>();

    @Override
    protected AbstractInterface<Meta> getFacadeLocal() {
        return metaF;
    }

    @Override
    public Meta getEntity() {
        return meta;
    }

}

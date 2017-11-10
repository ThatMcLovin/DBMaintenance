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
import javax.faces.view.ViewScoped;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.GenericFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.PostFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Post;

/**
 *
 * @author jacque
 */
@Named(value = "postBean")
@ViewScoped
public class postBean extends BeanGenerico<Post> implements Serializable {

    /**
     * Creates a new instance of postBean
     */
    public postBean() {
    }
    @EJB
    PostFacadeLocal postF;
    Post post;
    List<Post> filtroCat = new ArrayList<>();

    @Override
    protected GenericFacadeLocal<Post> getFacadeLocal() {
        return postF;
    }

    @Override
    public Post getEntity() {
        return post;
    }

}

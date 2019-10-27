package es.velsoft.eg.beans;

import es.velsoft.eg.dao.EntityManagerHelper;
import es.velsoft.eg.modelo.Libros;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Alejandro
 */
@ManagedBean
@ViewScoped
public class IndexBean implements Serializable {

    private static final long serialVersionUID = 7143779796955040248L;
    
    private List<Libros> libros = new ArrayList();

    
    @PostConstruct
    public void init() {
        EntityManager sesion = EntityManagerHelper.getEmf().createEntityManager();
        Query q = sesion.createNamedQuery("Libros.findAll");

        libros = q.getResultList();    
    }

    public List<Libros> getLibros() {
        return libros;
    }
    
}

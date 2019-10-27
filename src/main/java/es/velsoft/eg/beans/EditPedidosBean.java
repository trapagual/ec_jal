package es.velsoft.eg.beans;

import es.velsoft.eg.dao.EntityManagerHelper;
import es.velsoft.eg.modelo.Libros;
import es.velsoft.eg.modelo.Pedidos;
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
public class EditPedidosBean implements Serializable {

    private static final long serialVersionUID = 7143779796955040248L;
    
    private List<Pedidos> pedidos = new ArrayList();

    
    @PostConstruct
    public void init() {
        EntityManager sesion = EntityManagerHelper.getEmf().createEntityManager();
        Query q = sesion.createNamedQuery("Libros.findAll");

        pedidos = q.getResultList();    
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }


    
}


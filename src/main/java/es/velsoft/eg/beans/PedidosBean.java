package es.velsoft.eg.beans;

import es.velsoft.eg.dao.EntityManagerHelper;
import es.velsoft.eg.modelo.LazyPedidosDataModel;
import es.velsoft.eg.modelo.Pedidos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.primefaces.model.LazyDataModel;

/**
 *
 * @author Alejandro
 */
@ManagedBean
@ViewScoped
public class PedidosBean implements Serializable {

    private static final long serialVersionUID = 7143779796955040248L;
    
    private List<Pedidos> pedidos;
    private List<Pedidos> filtrados;
    
    private LazyDataModel<Pedidos> lazyModel;

    private Pedidos selectedPedido;
    
    public PedidosBean() {
        this.filtrados = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }
    EntityManager sesion;
    
    @PostConstruct
    public void init() {
        sesion = EntityManagerHelper.getEMF().createEntityManager();
        Query q = sesion.createNamedQuery("Pedidos.findAll");

        this.pedidos = q.getResultList();
        lazyModel = new LazyPedidosDataModel(this.pedidos);
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public List<Pedidos> getFiltrados() {
        return filtrados;
    }

    public void setFiltrados(List<Pedidos> filtrados) {
        this.filtrados = filtrados;
    }

    public LazyDataModel<Pedidos> getLazyModel() {
        return lazyModel;
    }

    public Pedidos getSelectedPedido() {
        return selectedPedido;
    }

    public void setSelectedPedido(Pedidos selectedPedido) {
        this.selectedPedido = selectedPedido;
    }

    
}

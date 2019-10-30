package es.velsoft.eg.beans;

import es.velsoft.eg.dao.TablasAuxDao;
import es.velsoft.eg.modelo.TablasAux;
import es.velsoft.eg.modelo.VTablasAuxiliares;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Alejandro
 */
@ManagedBean
@ViewScoped
public class TablasAuxBean implements Serializable {

    private static final long serialVersionUID = 7143779796955040248L;
    private static final Logger LOG = Logger.getLogger(TablasAuxBean.class.getName());

    private List<VTablasAuxiliares> tablas;

    private VTablasAuxiliares tablaSelected;

    private TablasAuxDao taDao;

    private TablasAux datosTA;

    public TablasAuxBean() {
        this.tablas = new ArrayList<>();
    }

    @PostConstruct
    public void init() {

        /*
            Rellenamos la lista para el selector al arrancar, se al pedimos al DAO
         */
        taDao = new TablasAuxDao();

        tablas = taDao.getListaTablasAux();

    }

    public List<VTablasAuxiliares> getTablas() {
        return tablas;
    }

    public VTablasAuxiliares getTablaSelected() {
        return tablaSelected;
    }

    public void setTablaSelected(VTablasAuxiliares tablaSelected) {
        this.tablaSelected = tablaSelected;
    }

    public void handleSelect(ValueChangeEvent event) {
        tablaSelected = (VTablasAuxiliares)  event.getNewValue();
        FacesContext.getCurrentInstance()
                .addMessage("msgSelectorTA", new FacesMessage(FacesMessage.SEVERITY_INFO, "Seleccionada", tablaSelected.getNombre()));

        LOG.log(Level.FINE,"Tabla Seleccionada: %s", tablaSelected.toString());
    }
}



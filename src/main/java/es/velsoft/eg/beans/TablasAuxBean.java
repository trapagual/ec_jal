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
import javax.faces.model.SelectItem;

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
    
    private List<SelectItem> selectItems;

    private String tablaSelected;

    private TablasAuxDao taDao;

    
    private TablasAux datosTA;

    public TablasAuxBean() {
        SelectItem s;
        this.tablas = new ArrayList<>();
        for (VTablasAuxiliares t : tablas) {
            s = new SelectItem(t.getId(), t.getNombre());
            selectItems.add(s);
        }
        this.tablaSelected = null;
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

    public String getTablaSelected() {
        return tablaSelected;
    }

    public void setTablaSelected(String tablaSelected) {
        this.tablaSelected = tablaSelected;
    }

    public List<SelectItem> getSelectItems() {
        return selectItems;
    }

    public void setSelectItems(List<SelectItem> selectItems) {
        this.selectItems = selectItems;
    }

    public void handleSelect() {
        
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Successful",  "Seleccionado: " + tablaSelected) );
        LOG.log(Level.FINE,"Tabla Seleccionada: %s", tablaSelected);
    }
}



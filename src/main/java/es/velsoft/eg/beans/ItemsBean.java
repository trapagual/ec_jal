package es.velsoft.eg.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Alejandro
 */
@ManagedBean
@ViewScoped
public class ItemsBean implements Serializable {

    private List<String> items = new ArrayList<>();
    private String selectedItem;

    @PostConstruct
    public void postInit() {
        items.add("Watch");
        items.add("Bottle");
        items.add("Book");
        items.add("Radio");
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }
    
    public void onChange() {
        System.out.println("En onChange. Valor nuevo es: " + selectedItem);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Successful",  "Seleccionado: " + selectedItem) );
    }
    
    
    
}

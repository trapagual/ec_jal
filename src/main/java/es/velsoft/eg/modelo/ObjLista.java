package es.velsoft.eg.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Alejandro
 * 
 * Objeto generico con id entero y descripcion cadena
 * para rellenar listas, combos, selectores...
 * avg oct19
 */

public class ObjLista implements Serializable {
    
    
    private int id;
    private String descripcion;

    public ObjLista() {
    }

    public ObjLista(int id, String desc) {
        this.id = id;
        this.descripcion = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.descripcion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ObjLista other = (ObjLista) obj;
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ObjLista{" + "id=" + id + ", desc=" + descripcion + '}';
    }
    
    
    
    
           
    
}

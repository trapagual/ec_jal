package es.velsoft.eg.modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Alejandro
 */
public class TablasAux implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String nombreTabla;
    private int id;
    private String descripcion;

    public TablasAux() {
    }

    public TablasAux(int nombre, String descripcion) {
        this.id = nombre;
        this.descripcion = descripcion;
    }

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
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
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.descripcion);
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
        final TablasAux other = (TablasAux) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}

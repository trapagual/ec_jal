/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.velsoft.eg.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alejandro
 */
@Entity
@Table(name = "vTablasAuxiliares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VTablasAuxiliares.findAll", query = "SELECT v FROM VTablasAuxiliares v"),
    @NamedQuery(name = "VTablasAuxiliares.findById", query = "SELECT v FROM VTablasAuxiliares v WHERE v.id = :id"),
    @NamedQuery(name = "VTablasAuxiliares.findByNombre", query = "SELECT v FROM VTablasAuxiliares v WHERE v.nombre = :nombre"),
    @NamedQuery(name = "VTablasAuxiliares.findByColumnas", query = "SELECT v FROM VTablasAuxiliares v WHERE v.columnas = :columnas")})
public class VTablasAuxiliares implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Columnas")
    private Integer columnas;

    public VTablasAuxiliares() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getColumnas() {
        return columnas;
    }

    public void setColumnas(Integer columnas) {
        this.columnas = columnas;
    }
    
}

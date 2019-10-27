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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alejandro
 */
@Entity
@Table(name = "direcciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direcciones.findAll", query = "SELECT d FROM Direcciones d")
    , @NamedQuery(name = "Direcciones.findById", query = "SELECT d FROM Direcciones d WHERE d.id = :id")
    , @NamedQuery(name = "Direcciones.findByIdTipoVia", query = "SELECT d FROM Direcciones d WHERE d.idTipoVia = :idTipoVia")
    , @NamedQuery(name = "Direcciones.findByDireccion", query = "SELECT d FROM Direcciones d WHERE d.direccion = :direccion")
    , @NamedQuery(name = "Direcciones.findByNumero", query = "SELECT d FROM Direcciones d WHERE d.numero = :numero")
    , @NamedQuery(name = "Direcciones.findByEscalera", query = "SELECT d FROM Direcciones d WHERE d.escalera = :escalera")
    , @NamedQuery(name = "Direcciones.findByPuerta", query = "SELECT d FROM Direcciones d WHERE d.puerta = :puerta")
    , @NamedQuery(name = "Direcciones.findByPiso", query = "SELECT d FROM Direcciones d WHERE d.piso = :piso")
    , @NamedQuery(name = "Direcciones.findByIdMunicipio", query = "SELECT d FROM Direcciones d WHERE d.idMunicipio = :idMunicipio")
    , @NamedQuery(name = "Direcciones.findByIdProvincia", query = "SELECT d FROM Direcciones d WHERE d.idProvincia = :idProvincia")
    , @NamedQuery(name = "Direcciones.findByIdPais", query = "SELECT d FROM Direcciones d WHERE d.idPais = :idPais")
    , @NamedQuery(name = "Direcciones.findByCodPostal", query = "SELECT d FROM Direcciones d WHERE d.codPostal = :codPostal")
    , @NamedQuery(name = "Direcciones.findByLatitud", query = "SELECT d FROM Direcciones d WHERE d.latitud = :latitud")
    , @NamedQuery(name = "Direcciones.findByLongitud", query = "SELECT d FROM Direcciones d WHERE d.longitud = :longitud")})
public class Direcciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_tipo_via")
    private Integer idTipoVia;
    @Size(max = 100)
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "numero")
    private Integer numero;
    @Size(max = 10)
    @Column(name = "escalera")
    private String escalera;
    @Size(max = 10)
    @Column(name = "puerta")
    private String puerta;
    @Size(max = 10)
    @Column(name = "piso")
    private String piso;
    @Column(name = "id_municipio")
    private Integer idMunicipio;
    @Column(name = "id_provincia")
    private Integer idProvincia;
    @Column(name = "id_pais")
    private Integer idPais;
    @Size(max = 10)
    @Column(name = "cod_postal")
    private String codPostal;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "latitud")
    private Double latitud;
    @Column(name = "longitud")
    private Double longitud;

    public Direcciones() {
    }

    public Direcciones(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdTipoVia() {
        return idTipoVia;
    }

    public void setIdTipoVia(Integer idTipoVia) {
        this.idTipoVia = idTipoVia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getEscalera() {
        return escalera;
    }

    public void setEscalera(String escalera) {
        this.escalera = escalera;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direcciones)) {
            return false;
        }
        Direcciones other = (Direcciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.trapasoft.webbookauthor.modelo.Direcciones[ id=" + id + " ]";
    }
    
}

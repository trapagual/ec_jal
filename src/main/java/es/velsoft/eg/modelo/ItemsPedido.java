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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SGEN0290
 */
@Entity
@Table(name = "itemspedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Itemspedido.findAll", query = "SELECT i FROM Itemspedido i")
    , @NamedQuery(name = "Itemspedido.findById", query = "SELECT i FROM Itemspedido i WHERE i.id = :id")
    , @NamedQuery(name = "Itemspedido.findByIdProducto", query = "SELECT i FROM Itemspedido i WHERE i.idProducto = :idProducto")
    , @NamedQuery(name = "Itemspedido.findByNombreProducto", query = "SELECT i FROM Itemspedido i WHERE i.nombreProducto = :nombreProducto")
    , @NamedQuery(name = "Itemspedido.findByDescProducto", query = "SELECT i FROM Itemspedido i WHERE i.descProducto = :descProducto")
    , @NamedQuery(name = "Itemspedido.findByCantidad", query = "SELECT i FROM Itemspedido i WHERE i.cantidad = :cantidad")
    , @NamedQuery(name = "Itemspedido.findByPrecioUnitario", query = "SELECT i FROM Itemspedido i WHERE i.precioUnitario = :precioUnitario")
    , @NamedQuery(name = "Itemspedido.findByDescuento", query = "SELECT i FROM Itemspedido i WHERE i.descuento = :descuento")})
public class ItemsPedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "idProducto")
    private Integer idProducto;
    @Size(max = 128)
    @Column(name = "nombreProducto")
    private String nombreProducto;
    @Size(max = 256)
    @Column(name = "descProducto")
    private String descProducto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private Float cantidad;
    @Column(name = "precioUnitario")
    private Float precioUnitario;
    @Column(name = "descuento")
    private Float descuento;
    @JoinColumn(name = "idPedido", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pedidos idPedido;

    public ItemsPedido() {
    }

    public ItemsPedido(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    public Pedidos getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedidos idPedido) {
        this.idPedido = idPedido;
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
        if (!(object instanceof ItemsPedido)) {
            return false;
        }
        ItemsPedido other = (ItemsPedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.trapasoft.webbookauthor.modelo.Itemspedido[ id=" + id + " ]";
    }
    
}

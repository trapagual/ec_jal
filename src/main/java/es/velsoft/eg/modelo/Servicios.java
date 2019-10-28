/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.velsoft.eg.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SGEN0290
 */
@Entity
@Table(name = "servicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicios.findAll", query = "SELECT s FROM Servicios s")})
public class Servicios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_pedido")
    private Integer idPedido;
    @Column(name = "id_servicio_anterior")
    private Integer idServicioAnterior;
    @Column(name = "id_tipo_svc_pedido")
    private Integer idTipoSvcPedido;
    @Column(name = "id_direccion")
    private Integer idDireccion;
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "fecha_servicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaServicio;
    @Column(name = "id_remolque")
    private Integer idRemolque;
    @Column(name = "id_tractora")
    private Integer idTractora;
    @Column(name = "id_conductor")
    private Integer idConductor;
    @Column(name = "id_tironero")
    private Integer idTironero;
    @Column(name = "id_transportista")
    private Integer idTransportista;
    @Column(name = "id_tipo_servicio")
    private Integer idTipoServicio;
    @Column(name = "transnet")
    private Boolean transnet;
    @Column(name = "transnet_cliente")
    private Boolean transnetCliente;
    @Size(max = 100)
    @Column(name = "subcontratado")
    private String subcontratado;
    @Column(name = "id_tipo_carga")
    private Integer idTipoCarga;
    @Column(name = "temperatura")
    private Long temperatura;
    @Column(name = "termografia")
    private Boolean termografia;
    @Column(name = "adr")
    private Boolean adr;
    @Column(name = "principal_transbordo")
    private Boolean principalTransbordo;
    @Column(name = "tit_tarj_trans_tractor")
    private Integer titTarjTransTractor;
    @Column(name = "id_condctr_agencia")
    private Integer idCondctrAgencia;
    @Column(name = "verif_condctr_agencia")
    private Boolean verifCondctrAgencia;
    @Column(name = "cargador")
    private Boolean cargador;
    @Column(name = "condctr_manual")
    private Boolean condctrManual;
    @Column(name = "id_forma_pago")
    private Integer idFormaPago;
    @Column(name = "precio_km_pagar")
    private Long precioKmPagar;
    @Column(name = "pago_porcentaje")
    private Long pagoPorcentaje;
    @Column(name = "cobro_en_destino")
    private Boolean cobroEnDestino;
    @Column(name = "palets")
    private Integer palets;
    @Column(name = "euro_palets")
    private Integer euroPalets;
    @Column(name = "euro_cheps")
    private Integer euroCheps;
    @Column(name = "carros")
    private Integer carros;
    @Column(name = "exist_intrcmbio_palets")
    private Boolean existIntrcmbioPalets;
    @Column(name = "kgs_carga")
    private Long kgsCarga;
    @Column(name = "autorizar_autopst")
    private Boolean autorizarAutopst;
    @Column(name = "kms_nac")
    private Long kmsNac;
    @Column(name = "cost_kms_nac")
    private Long costKmsNac;
    @Column(name = "kms_int")
    private Long kmsInt;
    @Column(name = "cost_kms_int")
    private Long costKmsInt;
    @Column(name = "kms_autopst_nac")
    private Long kmsAutopstNac;
    @Column(name = "cost_kms_autopst_nac")
    private Long costKmsAutopstNac;
    @Column(name = "kms_autopst_int")
    private Long kmsAutopstInt;
    @Column(name = "cost_kms_autopst_int")
    private Long costKmsAutopstInt;
    @Column(name = "id_grupo")
    private Integer idGrupo;
    @Column(name = "id_estado")
    private Integer idEstado;
    @Column(name = "cantidades_ajustadas")
    private Boolean cantidadesAjustadas;
    @Lob
    @Size(max = 65535)
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "id_proveedor")
    private Integer idProveedor;

    public Servicios() {
    }

    public Servicios(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdServicioAnterior() {
        return idServicioAnterior;
    }

    public void setIdServicioAnterior(Integer idServicioAnterior) {
        this.idServicioAnterior = idServicioAnterior;
    }

    public Integer getIdTipoSvcPedido() {
        return idTipoSvcPedido;
    }

    public void setIdTipoSvcPedido(Integer idTipoSvcPedido) {
        this.idTipoSvcPedido = idTipoSvcPedido;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaServicio() {
        return fechaServicio;
    }

    public void setFechaServicio(Date fechaServicio) {
        this.fechaServicio = fechaServicio;
    }

    public Integer getIdRemolque() {
        return idRemolque;
    }

    public void setIdRemolque(Integer idRemolque) {
        this.idRemolque = idRemolque;
    }

    public Integer getIdTractora() {
        return idTractora;
    }

    public void setIdTractora(Integer idTractora) {
        this.idTractora = idTractora;
    }

    public Integer getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(Integer idConductor) {
        this.idConductor = idConductor;
    }

    public Integer getIdTironero() {
        return idTironero;
    }

    public void setIdTironero(Integer idTironero) {
        this.idTironero = idTironero;
    }

    public Integer getIdTransportista() {
        return idTransportista;
    }

    public void setIdTransportista(Integer idTransportista) {
        this.idTransportista = idTransportista;
    }

    public Integer getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(Integer idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public Boolean getTransnet() {
        return transnet;
    }

    public void setTransnet(Boolean transnet) {
        this.transnet = transnet;
    }

    public Boolean getTransnetCliente() {
        return transnetCliente;
    }

    public void setTransnetCliente(Boolean transnetCliente) {
        this.transnetCliente = transnetCliente;
    }

    public String getSubcontratado() {
        return subcontratado;
    }

    public void setSubcontratado(String subcontratado) {
        this.subcontratado = subcontratado;
    }

    public Integer getIdTipoCarga() {
        return idTipoCarga;
    }

    public void setIdTipoCarga(Integer idTipoCarga) {
        this.idTipoCarga = idTipoCarga;
    }

    public Long getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Long temperatura) {
        this.temperatura = temperatura;
    }

    public Boolean getTermografia() {
        return termografia;
    }

    public void setTermografia(Boolean termografia) {
        this.termografia = termografia;
    }

    public Boolean getAdr() {
        return adr;
    }

    public void setAdr(Boolean adr) {
        this.adr = adr;
    }

    public Boolean getPrincipalTransbordo() {
        return principalTransbordo;
    }

    public void setPrincipalTransbordo(Boolean principalTransbordo) {
        this.principalTransbordo = principalTransbordo;
    }

    public Integer getTitTarjTransTractor() {
        return titTarjTransTractor;
    }

    public void setTitTarjTransTractor(Integer titTarjTransTractor) {
        this.titTarjTransTractor = titTarjTransTractor;
    }

    public Integer getIdCondctrAgencia() {
        return idCondctrAgencia;
    }

    public void setIdCondctrAgencia(Integer idCondctrAgencia) {
        this.idCondctrAgencia = idCondctrAgencia;
    }

    public Boolean getVerifCondctrAgencia() {
        return verifCondctrAgencia;
    }

    public void setVerifCondctrAgencia(Boolean verifCondctrAgencia) {
        this.verifCondctrAgencia = verifCondctrAgencia;
    }

    public Boolean getCargador() {
        return cargador;
    }

    public void setCargador(Boolean cargador) {
        this.cargador = cargador;
    }

    public Boolean getCondctrManual() {
        return condctrManual;
    }

    public void setCondctrManual(Boolean condctrManual) {
        this.condctrManual = condctrManual;
    }

    public Integer getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(Integer idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public Long getPrecioKmPagar() {
        return precioKmPagar;
    }

    public void setPrecioKmPagar(Long precioKmPagar) {
        this.precioKmPagar = precioKmPagar;
    }

    public Long getPagoPorcentaje() {
        return pagoPorcentaje;
    }

    public void setPagoPorcentaje(Long pagoPorcentaje) {
        this.pagoPorcentaje = pagoPorcentaje;
    }

    public Boolean getCobroEnDestino() {
        return cobroEnDestino;
    }

    public void setCobroEnDestino(Boolean cobroEnDestino) {
        this.cobroEnDestino = cobroEnDestino;
    }

    public Integer getPalets() {
        return palets;
    }

    public void setPalets(Integer palets) {
        this.palets = palets;
    }

    public Integer getEuroPalets() {
        return euroPalets;
    }

    public void setEuroPalets(Integer euroPalets) {
        this.euroPalets = euroPalets;
    }

    public Integer getEuroCheps() {
        return euroCheps;
    }

    public void setEuroCheps(Integer euroCheps) {
        this.euroCheps = euroCheps;
    }

    public Integer getCarros() {
        return carros;
    }

    public void setCarros(Integer carros) {
        this.carros = carros;
    }

    public Boolean getExistIntrcmbioPalets() {
        return existIntrcmbioPalets;
    }

    public void setExistIntrcmbioPalets(Boolean existIntrcmbioPalets) {
        this.existIntrcmbioPalets = existIntrcmbioPalets;
    }

    public Long getKgsCarga() {
        return kgsCarga;
    }

    public void setKgsCarga(Long kgsCarga) {
        this.kgsCarga = kgsCarga;
    }

    public Boolean getAutorizarAutopst() {
        return autorizarAutopst;
    }

    public void setAutorizarAutopst(Boolean autorizarAutopst) {
        this.autorizarAutopst = autorizarAutopst;
    }

    public Long getKmsNac() {
        return kmsNac;
    }

    public void setKmsNac(Long kmsNac) {
        this.kmsNac = kmsNac;
    }

    public Long getCostKmsNac() {
        return costKmsNac;
    }

    public void setCostKmsNac(Long costKmsNac) {
        this.costKmsNac = costKmsNac;
    }

    public Long getKmsInt() {
        return kmsInt;
    }

    public void setKmsInt(Long kmsInt) {
        this.kmsInt = kmsInt;
    }

    public Long getCostKmsInt() {
        return costKmsInt;
    }

    public void setCostKmsInt(Long costKmsInt) {
        this.costKmsInt = costKmsInt;
    }

    public Long getKmsAutopstNac() {
        return kmsAutopstNac;
    }

    public void setKmsAutopstNac(Long kmsAutopstNac) {
        this.kmsAutopstNac = kmsAutopstNac;
    }

    public Long getCostKmsAutopstNac() {
        return costKmsAutopstNac;
    }

    public void setCostKmsAutopstNac(Long costKmsAutopstNac) {
        this.costKmsAutopstNac = costKmsAutopstNac;
    }

    public Long getKmsAutopstInt() {
        return kmsAutopstInt;
    }

    public void setKmsAutopstInt(Long kmsAutopstInt) {
        this.kmsAutopstInt = kmsAutopstInt;
    }

    public Long getCostKmsAutopstInt() {
        return costKmsAutopstInt;
    }

    public void setCostKmsAutopstInt(Long costKmsAutopstInt) {
        this.costKmsAutopstInt = costKmsAutopstInt;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Boolean getCantidadesAjustadas() {
        return cantidadesAjustadas;
    }

    public void setCantidadesAjustadas(Boolean cantidadesAjustadas) {
        this.cantidadesAjustadas = cantidadesAjustadas;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
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
        if (!(object instanceof Servicios)) {
            return false;
        }
        Servicios other = (Servicios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.velsoft.eg.modelo.Servicios[ id=" + id + " ]";
    }
    
}

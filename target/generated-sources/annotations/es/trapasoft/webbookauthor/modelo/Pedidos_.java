package es.trapasoft.webbookauthor.modelo;

import es.velsoft.eg.modelo.Pedidos;
import es.velsoft.eg.modelo.Agentes;
import es.velsoft.eg.modelo.Servicios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-27T12:33:09")
@StaticMetamodel(Pedidos.class)
public class Pedidos_ { 

    public static volatile SingularAttribute<Pedidos, Long> totAmortRemolques;
    public static volatile SingularAttribute<Pedidos, Long> totSeguroTractoras;
    public static volatile SingularAttribute<Pedidos, Integer> idTipoVehiculo;
    public static volatile SingularAttribute<Pedidos, Long> totKmsVuelta;
    public static volatile SingularAttribute<Pedidos, Long> totSeguroRemolques;
    public static volatile SingularAttribute<Pedidos, Long> costKmsAutopstInt;
    public static volatile SingularAttribute<Pedidos, Integer> idExpediente;
    public static volatile SingularAttribute<Pedidos, Long> kmsAutopstNac;
    public static volatile SingularAttribute<Pedidos, Long> totKmsNac;
    public static volatile SingularAttribute<Pedidos, Long> costKmsNac;
    public static volatile SingularAttribute<Pedidos, Long> precioLitroGasoil;
    public static volatile SingularAttribute<Pedidos, Long> totalIngresos;
    public static volatile SingularAttribute<Pedidos, Integer> idCliente;
    public static volatile SingularAttribute<Pedidos, Boolean> excedido;
    public static volatile SingularAttribute<Pedidos, String> refCliente;
    public static volatile SingularAttribute<Pedidos, String> clienteFinal;
    public static volatile SingularAttribute<Pedidos, Date> fechaFinServicio;
    public static volatile SingularAttribute<Pedidos, Long> totMntmntoRuedas;
    public static volatile SingularAttribute<Pedidos, Integer> id;
    public static volatile SingularAttribute<Pedidos, Long> totalGastos;
    public static volatile SingularAttribute<Pedidos, Agentes> agente;
    public static volatile SingularAttribute<Pedidos, Integer> idHojaCarga;
    public static volatile SingularAttribute<Pedidos, Date> fechaAlta;
    public static volatile SingularAttribute<Pedidos, Long> costKmsAutopstNac;
    public static volatile SingularAttribute<Pedidos, Long> totKmsIda;
    public static volatile SingularAttribute<Pedidos, Long> totNominaCondctrInter;
    public static volatile SingularAttribute<Pedidos, Integer> idAgente;
    public static volatile SingularAttribute<Pedidos, Long> kmsAutopstInt;
    public static volatile SingularAttribute<Pedidos, Long> gasoilTractora;
    public static volatile SingularAttribute<Pedidos, Boolean> adr;
    public static volatile SingularAttribute<Pedidos, Integer> idTipoCarga;
    public static volatile ListAttribute<Pedidos, Servicios> servicios;
    public static volatile SingularAttribute<Pedidos, Long> totSeguroMercancias;
    public static volatile SingularAttribute<Pedidos, Long> totNominaCondctrNac;
    public static volatile SingularAttribute<Pedidos, Integer> idEstado;
    public static volatile SingularAttribute<Pedidos, Long> costKmsInt;
    public static volatile SingularAttribute<Pedidos, Date> fechaIniServicio;
    public static volatile SingularAttribute<Pedidos, Long> gasoilRemolque;
    public static volatile SingularAttribute<Pedidos, String> observaciones;
    public static volatile SingularAttribute<Pedidos, Long> totKms;
    public static volatile SingularAttribute<Pedidos, Integer> idContrato;
    public static volatile SingularAttribute<Pedidos, Long> totAmortTractoras;
    public static volatile SingularAttribute<Pedidos, Integer> idRuta;
    public static volatile SingularAttribute<Pedidos, Long> totDietasKms;
    public static volatile SingularAttribute<Pedidos, Long> totKmsInt;
    public static volatile SingularAttribute<Pedidos, Integer> idGrupo;

}
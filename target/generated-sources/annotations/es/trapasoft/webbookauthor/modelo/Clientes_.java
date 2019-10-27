package es.trapasoft.webbookauthor.modelo;

import es.velsoft.eg.modelo.Clientes;
import es.velsoft.eg.modelo.Pedidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-27T12:33:09")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> apellido2;
    public static volatile SingularAttribute<Clientes, String> apellido1;
    public static volatile SingularAttribute<Clientes, String> ciudad;
    public static volatile SingularAttribute<Clientes, String> direccion;
    public static volatile SingularAttribute<Clientes, Integer> id;
    public static volatile ListAttribute<Clientes, Pedidos> pedidosList;
    public static volatile SingularAttribute<Clientes, String> telefono;
    public static volatile SingularAttribute<Clientes, String> nombre;
    public static volatile SingularAttribute<Clientes, String> codPostal;
    public static volatile SingularAttribute<Clientes, String> email;
    public static volatile SingularAttribute<Clientes, String> pais;
    public static volatile SingularAttribute<Clientes, String> identificador;

}
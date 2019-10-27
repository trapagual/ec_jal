package es.trapasoft.webbookauthor.modelo;

import es.velsoft.eg.modelo.ItemsPedido;
import es.velsoft.eg.modelo.Pedidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-27T12:33:09")
@StaticMetamodel(ItemsPedido.class)
public class ItemsPedido_ { 

    public static volatile SingularAttribute<ItemsPedido, Float> precioUnitario;
    public static volatile SingularAttribute<ItemsPedido, Float> descuento;
    public static volatile SingularAttribute<ItemsPedido, Integer> id;
    public static volatile SingularAttribute<ItemsPedido, Integer> idProducto;
    public static volatile SingularAttribute<ItemsPedido, String> descProducto;
    public static volatile SingularAttribute<ItemsPedido, Float> cantidad;
    public static volatile SingularAttribute<ItemsPedido, Pedidos> idPedido;
    public static volatile SingularAttribute<ItemsPedido, String> nombreProducto;

}
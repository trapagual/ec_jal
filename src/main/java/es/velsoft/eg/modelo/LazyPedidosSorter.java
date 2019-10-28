/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.velsoft.eg.modelo;

import java.util.Comparator;
import org.primefaces.model.SortOrder;

/**
 *
 * @author SGEN0290
 */
public class LazyPedidosSorter implements Comparator<Pedidos> {
 
    private String sortField;
     
    private SortOrder sortOrder;
     
    public LazyPedidosSorter(String sortField, SortOrder sortOrder) {
        this.sortField = sortField;
        this.sortOrder = sortOrder;
    }
 
    public int compare(Pedidos car1, Pedidos car2) {
        try {
            Object value1 = Pedidos.class.getField(this.sortField).get(car1);
            Object value2 = Pedidos.class.getField(this.sortField).get(car2);
 
            int value = ((Comparable)value1).compareTo(value2);
             
            return SortOrder.ASCENDING.equals(sortOrder) ? value : -1 * value;
        }
        catch(Exception e) {
            throw new RuntimeException();
        }
    }
    
}

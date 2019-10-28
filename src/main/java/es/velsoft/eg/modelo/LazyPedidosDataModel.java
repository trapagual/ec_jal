/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.velsoft.eg.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

/**
 *
 * @author SGEN0290
 */
public class LazyPedidosDataModel extends LazyDataModel<Pedidos> {
    private List<Pedidos> datasource;

    public LazyPedidosDataModel(List<Pedidos> datasource) {
        this.datasource = datasource;
    }
    
    @Override
    public Pedidos getRowData(String rowKey) {
        for(Pedidos pedido : datasource) {
            if(pedido.getId().equals(rowKey))
                return pedido;
        }
 
        return null;
    }    
    
    @Override
    public Object getRowKey(Pedidos pedido) {
        return pedido.getId();
    }    
    
    @Override
    public List<Pedidos> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String,Object> filters) {
        List<Pedidos> data = new ArrayList<Pedidos>();
 
        //filter
        for(Pedidos car : datasource) {
            boolean match = true;
 
            if (filters != null) {
                for (Iterator<String> it = filters.keySet().iterator(); it.hasNext();) {
                    try {
                        String filterProperty = it.next();
                        Object filterValue = filters.get(filterProperty);
                        String fieldValue = String.valueOf(car.getClass().getField(filterProperty).get(car));
 
                        if(filterValue == null || fieldValue.startsWith(filterValue.toString())) {
                            match = true;
                    }
                    else {
                            match = false;
                            break;
                        }
                    } catch(Exception e) {
                        match = false;
                    }
                }
            }
 
            if(match) {
                data.add(car);
            }
        }
 
        //sort
        if(sortField != null) {
            Collections.sort(data, new LazyPedidosSorter(sortField, sortOrder));
        }
 
        //rowCount
        int dataSize = data.size();
        this.setRowCount(dataSize);
 
        //paginate
        if(dataSize > pageSize) {
            try {
                return data.subList(first, first + pageSize);
            }
            catch(IndexOutOfBoundsException e) {
                return data.subList(first, first + (dataSize % pageSize));
            }
        }
        else {
            return data;
        }
    }    
}

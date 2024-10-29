package com.tuempresa.sistema_ventas.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "pedidos")
public class Pedido {

    @Id
    private String id;
    private String clienteId;
    private List<String> productosIds;
    private double total;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public List<String> getProductosIds() {
        return productosIds;
    }

    public void setProductosIds(List<String> productosIds) {
        this.productosIds = productosIds;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

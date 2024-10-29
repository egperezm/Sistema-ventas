package com.tuempresa.sistema_ventas.controladores;

import com.tuempresa.sistema_ventas.modelos.Pedido;
import com.tuempresa.sistema_ventas.repositorios.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoControlador {

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @GetMapping
    public List<Pedido> getAllPedidos() {
        return pedidoRepositorio.findAll();
    }

    @PostMapping
    public Pedido createPedido(@RequestBody Pedido pedido) {
        return pedidoRepositorio.save(pedido);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getPedidoById(@PathVariable String id) {
        Pedido pedido = pedidoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido no encontrado"));
        return ResponseEntity.ok(pedido);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> updatePedido(@PathVariable String id, @RequestBody Pedido pedidoDetalles) {
        Pedido pedido = pedidoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido no encontrado"));
        pedido.setClienteId(pedidoDetalles.getClienteId());
        pedido.setProductosIds(pedidoDetalles.getProductosIds());
        pedido.setTotal(pedidoDetalles.getTotal());
        return ResponseEntity.ok(pedidoRepositorio.save(pedido));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePedido(@PathVariable String id) {
        Pedido pedido = pedidoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido no encontrado"));
        pedidoRepositorio.delete(pedido);
        return ResponseEntity.noContent().build();
    }
}

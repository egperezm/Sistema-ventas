package com.tuempresa.sistema_ventas.controladores;

import com.tuempresa.sistema_ventas.modelos.Producto;
import com.tuempresa.sistema_ventas.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoControlador {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoRepositorio.findAll();
    }

    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return productoRepositorio.save(producto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> getProductoById(@PathVariable String id) {
        Producto producto = productoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        return ResponseEntity.ok(producto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> updateProducto(@PathVariable String id, @RequestBody Producto productoDetalles) {
        Producto producto = productoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        producto.setNombre(productoDetalles.getNombre());
        producto.setCategoria(productoDetalles.getCategoria());
        producto.setPrecio(productoDetalles.getPrecio());
        producto.setStock(productoDetalles.getStock());
        return ResponseEntity.ok(productoRepositorio.save(producto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducto(@PathVariable String id) {
        Producto producto = productoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        productoRepositorio.delete(producto);
        return ResponseEntity.noContent().build();
    }
}

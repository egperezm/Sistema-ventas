package com.tuempresa.sistema_ventas.repositorios;

import com.tuempresa.sistema_ventas.modelos.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepositorio extends MongoRepository<Producto, String> {
}

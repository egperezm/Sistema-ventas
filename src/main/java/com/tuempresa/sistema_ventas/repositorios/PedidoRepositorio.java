package com.tuempresa.sistema_ventas.repositorios;

import com.tuempresa.sistema_ventas.modelos.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRepositorio extends MongoRepository<Pedido, String> {
}

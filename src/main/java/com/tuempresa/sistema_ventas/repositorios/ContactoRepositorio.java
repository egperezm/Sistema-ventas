package com.tuempresa.sistema_ventas.repositorios;

import com.tuempresa.sistema_ventas.modelos.Contacto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactoRepositorio extends MongoRepository<Contacto, String> {
}

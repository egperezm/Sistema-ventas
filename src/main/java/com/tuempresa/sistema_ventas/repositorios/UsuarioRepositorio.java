package com.tuempresa.sistema_ventas.repositorios;

import com.tuempresa.sistema_ventas.modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepositorio extends MongoRepository<Usuario, String> {
}

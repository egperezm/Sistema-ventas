package com.tuempresa.sistema_ventas.repositorios;

import com.tuempresa.sistema_ventas.modelos.Empresa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpresaRepositorio extends MongoRepository<Empresa, String> {
}

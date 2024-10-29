package com.tuempresa.sistema_ventas.controladores;

import com.tuempresa.sistema_ventas.modelos.Empresa;
import com.tuempresa.sistema_ventas.repositorios.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaControlador {

    @Autowired
    private EmpresaRepositorio empresaRepositorio;

    @GetMapping
    public List<Empresa> getAllEmpresas() {
        return empresaRepositorio.findAll();
    }

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return empresaRepositorio.save(empresa);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> getEmpresaById(@PathVariable String id) {
        Empresa empresa = empresaRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Empresa no encontrada"));
        return ResponseEntity.ok(empresa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empresa> updateEmpresa(@PathVariable String id, @RequestBody Empresa empresaDetalles) {
        Empresa empresa = empresaRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Empresa no encontrada"));
        empresa.setNombre(empresaDetalles.getNombre());
        empresa.setDireccion(empresaDetalles.getDireccion());
        empresa.setTelefono(empresaDetalles.getTelefono());
        return ResponseEntity.ok(empresaRepositorio.save(empresa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpresa(@PathVariable String id) {
        Empresa empresa = empresaRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Empresa no encontrada"));
        empresaRepositorio.delete(empresa);
        return ResponseEntity.noContent().build();
    }
}

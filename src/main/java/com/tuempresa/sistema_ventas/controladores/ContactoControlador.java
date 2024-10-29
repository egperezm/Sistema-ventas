package com.tuempresa.sistema_ventas.controladores;

import com.tuempresa.sistema_ventas.modelos.Contacto;
import com.tuempresa.sistema_ventas.repositorios.ContactoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contactos")
public class ContactoControlador {

    @Autowired
    private ContactoRepositorio contactoRepositorio;

    @GetMapping
    public List<Contacto> getAllContactos() {
        return contactoRepositorio.findAll();
    }

    @PostMapping
    public Contacto createContacto(@RequestBody Contacto contacto) {
        return contactoRepositorio.save(contacto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contacto> getContactoById(@PathVariable String id) {
        Contacto contacto = contactoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Contacto no encontrado"));
        return ResponseEntity.ok(contacto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contacto> updateContacto(@PathVariable String id, @RequestBody Contacto contactoDetalles) {
        Contacto contacto = contactoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Contacto no encontrado"));
        contacto.setNombre(contactoDetalles.getNombre());
        contacto.setEmail(contactoDetalles.getEmail());
        contacto.setTelefono(contactoDetalles.getTelefono());
        return ResponseEntity.ok(contactoRepositorio.save(contacto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContacto(@PathVariable String id) {
        Contacto contacto = contactoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Contacto no encontrado"));
        contactoRepositorio.delete(contacto);
        return ResponseEntity.noContent().build();
    }
}

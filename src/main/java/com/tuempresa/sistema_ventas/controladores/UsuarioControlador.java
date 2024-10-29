package com.tuempresa.sistema_ventas.controladores;

import com.tuempresa.sistema_ventas.modelos.Usuario;
import com.tuempresa.sistema_ventas.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioControlador {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable String id) {
        Usuario usuario = usuarioRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        return ResponseEntity.ok(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable String id, @RequestBody Usuario usuarioDetalles) {
        Usuario usuario = usuarioRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        usuario.setNombre(usuarioDetalles.getNombre());
        usuario.setEmail(usuarioDetalles.getEmail());
        usuario.setPassword(usuarioDetalles.getPassword());
        usuario.setRol(usuarioDetalles.getRol());
        return ResponseEntity.ok(usuarioRepositorio.save(usuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable String id) {
        Usuario usuario = usuarioRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        usuarioRepositorio.delete(usuario);
        return ResponseEntity.noContent().build();
    }
}

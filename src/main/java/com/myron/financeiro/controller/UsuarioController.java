package com.myron.financeiro.controller;

import com.myron.financeiro.dto.UsuarioDTO;
import com.myron.financeiro.entity.Usuario;
import com.myron.financeiro.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController (UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Usuario> criar (@RequestBody @Valid UsuarioDTO dto) {
        return ResponseEntity.ok (service.salvar(dto));
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listar (@PathVariable Long id) {
        return ResponseEntity.ok (service.listarTodos());
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Usuario> buscar (@PathVariable Long id) {
        return ResponseEntity.ok (service.buscarPorId(id));
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Usuario> atualizar (@PathVariable Long id,

        @RequestBody @Valid UsuarioDTO dto) {
        return ResponseEntity.ok (service.atualizar(id, dto));
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Void> deletar (@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

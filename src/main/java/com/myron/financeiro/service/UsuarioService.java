package com.myron.financeiro.service;

import com.myron.financeiro.dto.UsuarioDTO;
import com.myron.financeiro.entity.Usuario;
import com.myron.financeiro.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService (UsuarioRepository repository) {
        this.repository = repository;
    }

    public List <Usuario> listarTodos() {
        return repository.findAll();
    }

    public Usuario buscarPorId (Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public Usuario salvar (UsuarioDTO dto) {

        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());

        return repository.save (usuario);
    }

    public Usuario atualizar (Long id, UsuarioDTO dto) {
        Usuario usuario = buscarPorId(id);

        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());

        return repository.save(usuario);
    }

    public void deletar (Long id) {
        repository.deleteById(id);
    }
}

package com.antpatterns.easybase.business;

import com.antpatterns.easybase.model.UsuarioRequest;
import com.antpatterns.easybase.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioBusiness {

    final private UsuarioRepository repository;

    @Autowired
    public UsuarioBusiness(final UsuarioRepository repository) {
        this.repository = repository;
    }

    public void criar(UsuarioRequest request) {
        repository.save(request.toUsuario());
    }

}

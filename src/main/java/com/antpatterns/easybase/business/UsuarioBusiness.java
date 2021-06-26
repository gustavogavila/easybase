package com.antpatterns.easybase.business;

import br.com.mv.equery.port.PageFilter;
import com.antpatterns.easybase.model.UsuarioRequest;
import com.antpatterns.easybase.model.UsuarioResponse;
import com.antpatterns.easybase.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Map;

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

  public Page<UsuarioResponse> get(Map<PageFilter, String> params, Pageable pageable) {
    return repository.buscarTodos(params, pageable);
  }
}

package com.antpatterns.easybase.repositorio;

import br.com.mv.equery.port.PageFilter;
import com.antpatterns.easybase.model.UsuarioResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Map;

public interface UsuarioCustomRepository {

  public Page<UsuarioResponse> buscarTodos(Map<PageFilter, String> params, Pageable pageable);

}

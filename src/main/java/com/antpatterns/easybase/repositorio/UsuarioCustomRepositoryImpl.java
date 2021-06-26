package com.antpatterns.easybase.repositorio;

import br.com.mv.equery.adapter.specification.AbstractCriteriaSpecification;
import br.com.mv.equery.port.PageFilter;
import com.antpatterns.easybase.model.Usuario;
import com.antpatterns.easybase.model.UsuarioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import java.util.Map;

public class UsuarioCustomRepositoryImpl implements UsuarioCustomRepository{

  @Autowired
  private EntityManager entityManager;

  @Override
  public Page<UsuarioResponse> buscarTodos(Map<PageFilter, String> params, Pageable pageable) {
    final AbstractCriteriaSpecification specification = defaultCriteria();

    return null;
  }

  private AbstractCriteriaSpecification defaultCriteria() {
    return AbstractCriteriaSpecification.init(entityManager)
            .initWithClazzs(Usuario.class, UsuarioResponse.class, null);
  }

}

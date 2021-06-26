package com.antpatterns.easybase.repositorio;

import br.com.mv.equery.adapter.specification.AbstractCriteriaSpecification;
import br.com.mv.equery.port.PageFilter;
import com.antpatterns.easybase.model.Usuario;
import com.antpatterns.easybase.model.UsuarioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CompoundSelection;
import java.util.Map;

public class UsuarioCustomRepositoryImpl implements UsuarioCustomRepository {

  @Autowired
  private EntityManager entityManager;
  private final UsuarioCustomFilter customFilter;

  public UsuarioCustomRepositoryImpl() {
    this.customFilter = UsuarioCustomFilter.init();
  }

  @Override
  public Page<UsuarioResponse> buscarTodos(Map<PageFilter, String> params, Pageable pageable) {
    final AbstractCriteriaSpecification specification = defaultCriteria();
    customFilter.builderQuery(params, specification);
    CompoundSelection<UsuarioResponse> compound = resumeCompound(specification);
    return specification.select(compound, pageable);
  }

  private CompoundSelection<UsuarioResponse> resumeCompound(AbstractCriteriaSpecification specification) {
    return specification.builder().construct(UsuarioResponse.class, specification.root().get("id"), specification.root().get("nome"), specification.root().get("sobrenome"), specification.root().get("email")
    );
  }

  private AbstractCriteriaSpecification defaultCriteria() {
    return AbstractCriteriaSpecification.init(entityManager).initWithClazzs(Usuario.class, UsuarioResponse.class, null);
  }

}

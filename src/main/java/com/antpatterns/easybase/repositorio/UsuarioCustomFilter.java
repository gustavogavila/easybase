package com.antpatterns.easybase.repositorio;

import br.com.mv.equery.adapter.filter.RepositoryFilterSpecSimple;
import br.com.mv.equery.model.RepositoryFilterBuilder;
import br.com.mv.equery.types.SearchOperation;
import com.antpatterns.easybase.enums.CustomPageFilter;

import java.util.HashMap;

public class UsuarioCustomFilter extends RepositoryFilterSpecSimple {

  private final String NOME = "nome";
  private final String SOBRENOME = "sobrenome";
  private final String EMAIL = "email";
  private final String BAIRRO = "bairro.nome";

  public UsuarioCustomFilter() {
    super(new HashMap<>());
  }

  public static UsuarioCustomFilter init() {
    UsuarioCustomFilter usuarioCustomFilter = new UsuarioCustomFilter();
    usuarioCustomFilter.build();
    return usuarioCustomFilter;
  }

  private void build() {
    super.getRules().put(NOME, (filters) -> RepositoryFilterBuilder.init(NOME, super.fetch(filters, CustomPageFilter.nome)).withOperation(SearchOperation.MATCH));
    super.getRules().put(SOBRENOME, (filters) -> RepositoryFilterBuilder.init(SOBRENOME, super.fetch(filters, CustomPageFilter.sobrenome)).withOperation(SearchOperation.MATCH));
    super.getRules().put(EMAIL, (filters) -> RepositoryFilterBuilder.init(EMAIL, super.fetch(filters, CustomPageFilter.email)).withOperation(SearchOperation.EQUAL));
    super.getRules().put(BAIRRO, (filters) -> RepositoryFilterBuilder.init(BAIRRO,
      super.fetch(filters, CustomPageFilter.email)).withOperation(SearchOperation.EQUAL));
  }
}

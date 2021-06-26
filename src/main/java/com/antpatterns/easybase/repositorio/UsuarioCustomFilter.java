package com.antpatterns.easybase.repositorio;

import br.com.mv.equery.adapter.filter.RepositoryFilterSpecSimple;
import br.com.mv.equery.model.RepositoryFilterBuilder;
import br.com.mv.equery.port.CheckFilter;
import br.com.mv.equery.port.PageFilter;
import br.com.mv.equery.port.SearchCriteria;
import br.com.mv.equery.types.SearchOperation;
import com.antpatterns.easybase.enums.CustomPageFilter;
import com.antpatterns.easybase.model.Usuario;

import java.util.HashMap;
import java.util.Map;

public class UsuarioCustomFilter extends RepositoryFilterSpecSimple {

    private final String NOME = "nome";
    private final String SOBRENOME = "sobrenome";
    private final String EMAIL = "email";

    public UsuarioCustomFilter() {
        super(new HashMap<>());
    }

    public static UsuarioCustomFilter init() {
        UsuarioCustomFilter usuarioCustomFilter = new UsuarioCustomFilter();
        usuarioCustomFilter.build();
        return usuarioCustomFilter;
    }

    private void build() {
        super.getRules().put(NOME, (filters) -> RepositoryFilterBuilder
                .init(NOME, super.fetch(filters, CustomPageFilter.nome))
                .withOperation(SearchOperation.MATCH));
    }

}

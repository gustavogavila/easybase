package com.antpatterns.easybase.repositorio;

import com.antpatterns.easybase.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String>, UsuarioCustomRepository {
}

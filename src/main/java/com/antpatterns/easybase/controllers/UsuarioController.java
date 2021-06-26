package com.antpatterns.easybase.controllers;

import br.com.mv.equery.port.PageFilter;
import com.antpatterns.easybase.business.UsuarioBusiness;
import com.antpatterns.easybase.model.UsuarioRequest;
import com.antpatterns.easybase.model.UsuarioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

  @Autowired
  private UsuarioBusiness usuarioBusiness;

  @PostMapping
  public void criar(@Valid @RequestBody UsuarioRequest usuario) {
    usuarioBusiness.criar(usuario);
  }

  @GetMapping
  public ResponseEntity<Iterable<UsuarioResponse>> get(Map<PageFilter, String> params, Pageable pageable) {
    return ResponseEntity.ok(usuarioBusiness.get(params, pageable));
  }
}

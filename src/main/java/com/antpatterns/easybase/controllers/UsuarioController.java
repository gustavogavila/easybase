package com.antpatterns.easybase.controllers;

import com.antpatterns.easybase.business.UsuarioBusiness;
import com.antpatterns.easybase.model.Usuario;
import com.antpatterns.easybase.model.UsuarioRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

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
  public ResponseEntity<Iterable<Usuario>> get() {
    return ResponseEntity.ok(usuarioBusiness.get());
  }

}

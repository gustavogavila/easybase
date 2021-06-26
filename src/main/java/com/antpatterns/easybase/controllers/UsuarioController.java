package com.antpatterns.easybase.controllers;

import com.antpatterns.easybase.business.UsuarioBusiness;
import com.antpatterns.easybase.model.UsuarioRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

  @Autowired
  private UsuarioBusiness usuarioBusiness;

  @PostMapping
  public void criar(@Valid @RequestBody UsuarioRequest usuario) {
    usuarioBusiness.criar(usuario);
  }
}

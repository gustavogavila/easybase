package com.antpatterns.easybase.model;

import javax.validation.constraints.NotBlank;

public class UsuarioRequest {

  @NotBlank
  private String nome;

  @NotBlank
  private String sobrenome;

  @NotBlank
  private String email;

  public String getNome() {
    return nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public String getEmail() {
    return email;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}

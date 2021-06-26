package com.antpatterns.easybase.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UsuarioRequest {

  @NotBlank
  private String nome;

  @NotBlank
  private String sobrenome;

  @NotBlank
  private String email;

  @NotBlank
  @Size(min = 6)
  private String senha;

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

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public Usuario toUsuario() {
    final Usuario usuario = new Usuario();
    return usuario;
  }

}

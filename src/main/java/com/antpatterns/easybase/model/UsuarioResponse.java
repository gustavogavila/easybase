package com.antpatterns.easybase.model;

import java.time.Instant;

public class UsuarioResponse {

  private String nome;
  private String sobrenome;
  private String email;
  private Instant criadoEm;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Instant getCriadoEm() {
    return criadoEm;
  }

  public void setCriadoEm(Instant criadoEm) {
    this.criadoEm = criadoEm;
  }
}

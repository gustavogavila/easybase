package com.antpatterns.easybase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.PastOrPresent;
import java.time.Instant;

@Entity
public class Usuario {

    @Id
    private Integer id;

    @Column
    private String nome;

    @Column
    private String sobrenome;

    @Column
    private String email;

    @Column
    private String senha;

    @Column
    @PastOrPresent
    private Instant criadoEm;

}

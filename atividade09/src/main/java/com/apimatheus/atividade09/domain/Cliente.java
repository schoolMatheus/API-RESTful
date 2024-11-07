package com.apimatheus.atividade09.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
    //Variáveis
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email; 
    private String contato;

    //Construtor
    public Cliente() {}

    public Cliente(Long id, String nome, String email, String contato) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.contato = contato;
    }

    //GET
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getContato() {
        return contato;
    }

    //SET
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    //Métodos

}

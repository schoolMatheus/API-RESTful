package com.apimatheus.atividade09.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
   //Variáveis
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nome;
   private Double preco;
   
   //Construtor
   public Produto() {}

   public Produto(Long id, String nome, Double preco) {
   this.id = id;
   this.nome = nome;
       this.preco = preco;
   }

   //GET
   public Long getId() {
       return id;
   }

   public String getNome() {
       return nome;
   }

   public Double getPreco() {
       return preco;
   }

   //SET
   public void setId(Long id) {
       this.id = id;
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public void setPreco(Double preco) {
       this.preco = preco;
   }
   
   //Métodos

}

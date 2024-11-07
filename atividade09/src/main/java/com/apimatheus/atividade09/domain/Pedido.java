package com.apimatheus.atividade09.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {
    //Variáveis
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long id_Cliente;

    
    private List<Long> id_Produtos;
    
    //Construtor
    public Pedido() {}

    public Pedido(Long id, Long id_Cliente, List<Long> id_Produtos) {
        this.id = id;
        this.id_Cliente = id_Cliente;
        this.id_Produtos = id_Produtos;
    }

    //GET
    public Long getId() {
        return id;
    }

    public Long getIdCliente() {
        return id_Cliente;
    }

    public List<Long> getIdsProdutos() {
        return id_Produtos;
    }

    //SET
    public void setId(Long id) {
        this.id = id;
    }

    public void setIdCliente(Long idCliente) {
        this.id_Cliente = idCliente;
    }

    public void setIdsProdutos(List<Long> idsProdutos) {
        this.id_Produtos = idsProdutos;
    }    

    //Métodos

}

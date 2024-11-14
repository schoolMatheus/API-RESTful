package com.apimatheus.atividade09.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Pedido {
    //Variáveis
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long id_Cliente;

    
    private List<Long> id_Produtos;
    
    //Construtor

    //GET

    //SET  

    //Métodos

}

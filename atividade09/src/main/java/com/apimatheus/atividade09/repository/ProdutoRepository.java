package com.apimatheus.atividade09.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apimatheus.atividade09.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    Optional<Produto> findByNome(String nome);
}

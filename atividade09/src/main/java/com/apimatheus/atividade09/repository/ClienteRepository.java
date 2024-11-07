package com.apimatheus.atividade09.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apimatheus.atividade09.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    Optional<Cliente> findByNome(String nome);
}

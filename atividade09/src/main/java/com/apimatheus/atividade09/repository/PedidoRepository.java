package com.apimatheus.atividade09.repository;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apimatheus.atividade09.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    // List<Pedido> findByid_Cliente(Long id_Cliente);

    // List<Pedido> findByid_ProdutosIn(List<Long> id_Produtos);
}

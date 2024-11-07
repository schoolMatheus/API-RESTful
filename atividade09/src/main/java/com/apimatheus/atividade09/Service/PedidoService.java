package com.apimatheus.atividade09.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apimatheus.atividade09.domain.Pedido;
import com.apimatheus.atividade09.repository.PedidoRepository;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
    
    public Pedido buscarPedidoPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }
    // public List<Pedido> buscarClientePorId(Long id) {
    //     return pedidoRepository.findByid_Cliente(id);
    // }
    // public List<Pedido> buscarProdutoPorId(List<Long> id) {
    //     return pedidoRepository.findByid_ProdutosIn(id);
    // }

    public void deletarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}

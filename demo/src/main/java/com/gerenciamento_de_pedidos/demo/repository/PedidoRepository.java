package com.gerenciamento_de_pedidos.demo.repository;

import com.gerenciamento_de_pedidos.demo.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
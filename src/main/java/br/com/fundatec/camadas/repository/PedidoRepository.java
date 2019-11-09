package br.com.fundatec.camadas.repository;

import br.com.fundatec.camadas.model.Pedido;

import java.util.List;

public class PedidoRepository {

    public Pedido incluir(Pedido pedido) {
        BancoDados.getPedidos().add(pedido);
        return pedido;
    }

    public List<Pedido> listar() {
        return BancoDados.getPedidos();
    }
}

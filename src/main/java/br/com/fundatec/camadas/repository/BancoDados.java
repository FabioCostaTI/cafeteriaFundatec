package br.com.fundatec.camadas.repository;

import br.com.fundatec.camadas.model.Pedido;
import br.com.fundatec.camadas.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class BancoDados {

    private static List<Produto> produtos;
    private static List<Pedido> pedidos;

    public static List<Produto> getProdutos() {
        if(produtos == null) {
            inicializarBancoDados();
        }
        return produtos;
    }

    public static List<Pedido> getPedidos() {
        if(pedidos == null) {
            pedidos = new ArrayList<>();
        }
        return pedidos;
    }

    public static void inicializarBancoDados() {
        produtos = new ArrayList<>();
        produtos.add(new Produto(1L, "Pao de Queijo", 4.00D));
        produtos.add(new Produto(2L,"Cafe com Leite", 2.50D));
        produtos.add(new Produto(3L,"Bono Doce de Leite", 3.00D));
    }
}

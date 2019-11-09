package br.com.fundatec.camadas.presentation;

import br.com.fundatec.camadas.model.Pedido;
import br.com.fundatec.camadas.model.Produto;
import br.com.fundatec.camadas.service.PedidoService;
import br.com.fundatec.camadas.service.ProdutoService;

import java.util.List;
import java.util.Scanner;

public class CafeteriaInterface {

    private Scanner scanner = new Scanner(System.in);
    private ProdutoService produtoService = new ProdutoService();
    private PedidoService pedidoService = new PedidoService();

    public void mostrarTelaInicial() {
        System.out.println();
        System.out.println("****************** Cantina Fundatec ******************");
        System.out.println();
    }

    public void criarPedido() {
        Long idProduto;
        Integer quantidade;
        idProduto = selecionarPedido();
        quantidade = selecionarQuantidade();
        Pedido pedido = pedidoService.incluir(idProduto, quantidade);
        mostrarValorTotal(pedido);
    }

    private void mostrarValorTotal(Pedido pedido) {
        System.out.println("*************** Valor Total ****************");
        System.out.println("R$ " + pedido.getValorTotal());
        System.out.println("Pressione Qualquer Tecla Para Finalizar");
    }

    private Integer selecionarQuantidade() {
        Integer quantidade;
        System.out.println("****************** Quantidade ******************");
        quantidade = scanner.nextInt();
        return quantidade;
    }

    private Long selecionarPedido() {
        Long idProduto;
        System.out.println("****************** Escolha o Produto ******************");
        System.out.println();
        for (Produto produto : produtoService.listar()) {
            System.out.println(produto.getId() + " - " + produto.getNome() + " - R$ " + produto.getValor());
        }
        idProduto = scanner.nextLong();
        return idProduto;
    }

    public void mostrarPedidos() {
        List<Pedido> listaPedido = pedidoService.listar();
        System.out.println();
        System.out.println();
        System.out.println("*************** Pedidos ****************");
        for (Pedido pedido : listaPedido) {
            System.out.println(pedido.getNomeProduto() + " - " + pedido.getQuantidade() + " - R$ " + pedido.getValorTotal());
        }
    }
}

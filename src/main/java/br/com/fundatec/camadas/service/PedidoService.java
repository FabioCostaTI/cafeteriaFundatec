package br.com.fundatec.camadas.service;

import br.com.fundatec.camadas.model.Pedido;
import br.com.fundatec.camadas.model.Produto;
import br.com.fundatec.camadas.repository.PedidoRepository;

import java.util.List;

public class PedidoService {

    private ProdutoService produtoService = new ProdutoService();
    private PedidoRepository pedidoRepository = new PedidoRepository();

    public Pedido incluir(Long idProduto, Integer quantidade) {
        Produto produto = produtoService.consultar(idProduto);
        Double valorTotal = quantidade * produto.getValor();
        Pedido pedido = new Pedido(produto.getNome(), quantidade, valorTotal);
        return pedidoRepository.incluir(pedido);
    }

    public List<Pedido> listar() {
        return pedidoRepository.listar();
    }

    public void setProdutoService(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    public void setPedidoRepository(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }
}

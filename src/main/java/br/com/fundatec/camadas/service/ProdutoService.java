package br.com.fundatec.camadas.service;

import br.com.fundatec.camadas.model.Produto;
import br.com.fundatec.camadas.repository.ProdutoRepository;

import java.util.List;

public class ProdutoService {

    private ProdutoRepository produtoRepository = new ProdutoRepository();

    public List<Produto> listar() {
        return produtoRepository.listar();
    }

    public Produto consultar(Long id) {
        List<Produto> listaProdutos = produtoRepository.listar();
        for (Produto produto : listaProdutos) {
            if (produto.getId().equals(id)) {
                return produto;
            }
        }
        throw new RuntimeException("Produto não encontrado para o id " + id);
    }
}

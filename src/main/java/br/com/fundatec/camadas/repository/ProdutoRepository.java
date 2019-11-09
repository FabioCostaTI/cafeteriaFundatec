package br.com.fundatec.camadas.repository;

import br.com.fundatec.camadas.model.Produto;

import java.util.List;

public class ProdutoRepository {

    public List<Produto> listar() {
        return BancoDados.getProdutos();
    }
}

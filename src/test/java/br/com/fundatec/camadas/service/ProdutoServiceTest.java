package br.com.fundatec.camadas.service;

import br.com.fundatec.camadas.model.Produto;
import br.com.fundatec.camadas.repository.ProdutoRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit;
import java.util.Arrays;
import java.util.List;

public class ProdutoServiceTest {

    ProdutoRepository produtoRepository;
    ProdutoService produtoService;

    @Before

    public void setUp() throws Exception {
        produtoService = new ProdutoService();
        produtoRepository = Mockito.mock((ProdutoRepository.class));
        produtoService.setProdutoRepository(produtoRepository);

    }

    @Test

    public void deveConsultarUmProduto() {
        Produto leite = new Produto(2L,"Leite desnatado", 2D);
        Produto filtro = new Produto(3L, "Filtro de café", 4D);
        Produto pao = new Produto(4L,"Pão de forma", 4D);

        List<Produto> listaProduto = Arrays.asList(leite, filtro, pao);

        Mockito.when(produtoRepository.listar().thenReturn(listaProduto));
        Produto resultado = produtoService.consultar(3L);
        Assert.assertEquals(pao, resultado);

    }
}

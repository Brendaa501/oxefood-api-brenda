package br.com.ifpe.oxefood.modelo.produto;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefood.modelo.cliente.Cliente;



@Service
public class ProdutoService {
    @Transactional
   public void update(Long id, Produto produtoAlterado) {

      Produto produto = repository.findById(id).get();
     produto.setCategoria(produtoAlterado.getCategoria());
      produto.setTitulo(produtoAlterado.getTitulo());
      produto.setCodigoProduto(produtoAlterado.getCodigoProduto());
      produto.setDescricao(produtoAlterado.getDescricao());
      produto.setValorUnitario(produtoAlterado.getValorUnitario());
      produto.setTempoEntregaMin(produtoAlterado.getTempoEntregaMin());
       produto.setTempoEntregaMax(produtoAlterado.getTempoEntregaMax());
	    
      repository.save(produto);
  }

    @Autowired
    private ProdutoRepository repository;

    @Transactional
    public Produto save(Produto produto){
        produto.setHabilitado(Boolean.TRUE);
        return repository.save(produto);
    }

    
   @Transactional
   public void delete(Long id) {

       Produto produto = repository.findById(id).get();
       produto.setHabilitado(Boolean.FALSE);

       repository.save(produto);
   }

    public List<Produto> listarTodos() {
  
        return repository.findAll();
    }

    public Produto obterPorID(Long id) {

        return repository.findById(id).get();
    }

}


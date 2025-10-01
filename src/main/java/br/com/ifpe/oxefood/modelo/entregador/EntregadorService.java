package br.com.ifpe.oxefood.modelo.entregador;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import br.com.ifpe.oxefood.modelo.entregador.Entregador;



@Service
public class EntregadorService {
     @Transactional
   public void update(Long id, Entregador entregadorAlterado) {

      Entregador entregador = repository.findById(id).get();
      entregador.setNome(entregadorAlterado.getNome());
      entregador.setDataNascimento(entregadorAlterado.getDataNascimento());
      entregador.setCpf(entregadorAlterado.getCpf());
      entregador.setFoneCelular(entregadorAlterado.getFoneCelular());
      entregador.setFoneFixo(entregadorAlterado.getFoneFixo());
      entregador.setRg(entregadorAlterado.getRg());
      entregador.setQtdEntregas(entregadorAlterado.getQtdEntregas());
      entregador.setValorFrete(entregadorAlterado.getValorFrete());
      entregador.setRua(entregadorAlterado.getRua());
      entregador.setNumero(entregadorAlterado.getNumero());
      entregador.setBairro(entregadorAlterado.getBairro());
      entregador.setCidade(entregadorAlterado.getCidade());
      entregador.setUf(entregadorAlterado.getUf());
      entregador.setComplemento(entregadorAlterado.getComplemento());

	    
      repository.save(entregador);
  }

    
    @Autowired // injetar uma depedencia auto / inicializar um atributo de uma classe
   private EntregadorRepository repository;

   @Transactional // criar um bloco transacional 
   public Entregador save(Entregador entregador) {

       entregador.setHabilitado(Boolean.TRUE);
       return repository.save(entregador);
   }

    @Transactional
   public void delete(Long id) {

       Entregador entregador = repository.findById(id).get();
       entregador.setHabilitado(Boolean.FALSE);

       repository.save(entregador);
   }

  public List<Entregador> listarTodos() {
  
        return repository.findAll();
    }

    public Entregador obterPorID(Long id) {

        return repository.findById(id).get();
    }





}


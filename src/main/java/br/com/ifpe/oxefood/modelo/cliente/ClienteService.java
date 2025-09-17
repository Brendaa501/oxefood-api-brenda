package br.com.ifpe.oxefood.modelo.cliente;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

   @Autowired //guardar uma instacia de um atributo ´para que que ele possa ser inicializado
   private ClienteRepository repository;

   @Transactional //bloco transacional é quando vc usa varias funcoes de banco em um bloco de codigo ai vc usa isso para ou funcionar tudo ou nao funcionar nada, pra nao permitir inconsistencia
   public Cliente save(Cliente cliente) {

       cliente.setHabilitado(Boolean.TRUE);
       return repository.save(cliente);//salva o cliente no banco
   }

    
}

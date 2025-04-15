package br.com.api.af_eletronica.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.af_eletronica.models.Cliente;

@Repository
public interface ClienteRepositorio extends CrudRepository<Cliente, Long> {

}

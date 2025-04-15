package br.com.api.af_eletronica.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.af_eletronica.models.Aparelho;

@Repository
public interface AparelhoRepositorio extends CrudRepository<Aparelho, Long>{

}

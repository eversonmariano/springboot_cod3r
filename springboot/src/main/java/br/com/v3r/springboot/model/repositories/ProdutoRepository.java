package br.com.v3r.springboot.model.repositories;

import br.com.v3r.springboot.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository
        extends CrudRepository<Produto, Integer> {



}

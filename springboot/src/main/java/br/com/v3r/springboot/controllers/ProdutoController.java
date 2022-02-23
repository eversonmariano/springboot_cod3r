package br.com.v3r.springboot.controllers;

import br.com.v3r.springboot.model.entities.Produto;
import br.com.v3r.springboot.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto
    novoProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

}

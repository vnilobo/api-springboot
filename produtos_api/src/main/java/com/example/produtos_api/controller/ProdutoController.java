package com.example.produtos_api.controller;

import com.example.produtos_api.ProdutosApiApplication;
import com.example.produtos_api.model.Produto;
import com.example.produtos_api.repository.ProdutosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutosRepository produtosRepository;

    public ProdutoController(ProdutosRepository produtosRepository){
        this.produtosRepository = produtosRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido: "+produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtosRepository.save(produto);

        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable("id") String id){
        return produtosRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") String id){
        produtosRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Produto produto){
        produto.setId(id);
        produtosRepository.save(produto);
    }
}

package com.example.produtos_api.controller;

import com.example.produtos_api.ProdutosApiApplication;
import com.example.produtos_api.model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Produtos")

public class ProdutoController {

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido: "+produto);
        return produto;
    }
}

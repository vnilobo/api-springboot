package com.example.produtos_api.repository;

import com.example.produtos_api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface ProdutosRepository extends JpaRepository<Produto, String> {
}

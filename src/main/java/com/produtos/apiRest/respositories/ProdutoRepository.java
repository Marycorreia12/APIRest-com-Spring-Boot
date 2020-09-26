package com.produtos.apiRest.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apiRest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}

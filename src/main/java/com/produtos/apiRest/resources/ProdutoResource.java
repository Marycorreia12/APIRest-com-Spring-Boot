package com.produtos.apiRest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apiRest.models.Produto;
import com.produtos.apiRest.respositories.ProdutoRepository;

@RestController
@RequestMapping(value = "/api")
public class ProdutoResource {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping(value = "/produtos")
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping(value = "/produtos/{id}")
	public Optional<Produto> listaProdutoUnico(@PathVariable Long id){
		return  produtoRepository.findById(id);
	}
	
	
	@PostMapping
	public Produto criarProduto(@RequestBody Produto produto){
		return produtoRepository.save(produto);
	}

}

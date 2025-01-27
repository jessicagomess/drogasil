package com.generation.drogasil.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity 
@Table(name = "tb_produtos") 
public class Produto {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id; 

	@NotBlank(message = "O atributo nome é obrigatório")
	private String nome; 
	
	@NotBlank(message = "O atributo descrição é obrigatório")
	private String descricao; 
	
	@NotBlank(message = "O atributo estoque é obrigatório")
	private String estoque; 
	
	@NotNull(message = "O atributo preço é obrigatório")	
	private Double preco;

	@ManyToOne 
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEstoque() {
		return this.estoque;
	}

	public void setEstoque(String estoque) {
		this.estoque = estoque;
	}

	public Double getPreco() {
		return this.preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}

package com.farmacia.project.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_produto")
public class Produto {

		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank
		@Size(min=0)
		private String nome;
		
		@NotBlank
		@Size(min=0)
		private String descricao;
		
		@NotBlank
		@Size(min=0)
		private String quantidade;
		
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		@NotNull
		@Positive
		private BigDecimal valor;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(String quantidade) {
			this.quantidade = quantidade;
		}

		public BigDecimal getValor() {
			return valor;
		}

		public void setValor(BigDecimal valor) {
			this.valor = valor;
		}
				
}

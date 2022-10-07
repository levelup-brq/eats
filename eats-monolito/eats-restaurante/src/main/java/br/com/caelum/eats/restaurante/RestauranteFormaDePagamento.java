package br.com.caelum.eats.restaurante;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import br.com.caelum.eats.administrativo.FormaDePagamento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class RestauranteFormaDePagamento {

	

	@EmbeddedId
	private RestauranteFormaDePagamentoId id;

	@ManyToOne
	@MapsId("restauranteId")
	private Restaurante restaurante;

	@ManyToOne
	@MapsId("formaDePagamentoId")
	private FormaDePagamento formaDePagamento;
	
	
	
	public RestauranteFormaDePagamento() {
	}

	public RestauranteFormaDePagamento(RestauranteFormaDePagamentoId id2, Restaurante restaurante2,
			FormaDePagamento formaDePagamento2) {
		
		this.formaDePagamento = formaDePagamento2;
		this.id = id2;
		this.restaurante = restaurante2;
		
	}

	@Embeddable
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	static class RestauranteFormaDePagamentoId implements Serializable {
		public RestauranteFormaDePagamentoId(Long idRestaurante, Long id) {
			this.formaDePagamentoId = id;
			this.restauranteId = idRestaurante;
		}

		private static final long serialVersionUID = 1L;

		@Column(name = "restaurante_id")
		private Long restauranteId;

		@Column(name = "forma_de_pagamento_id")
		private Long formaDePagamentoId;
	}
}

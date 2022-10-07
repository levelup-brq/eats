package br.com.caelum.eats.pedido;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class MediaAvaliacoesDto {

	public MediaAvaliacoesDto(Long restauranteId2, Double media2) {
		this.media = media2;
		this.restauranteId = restauranteId2;
	}
	private Long restauranteId;
	private Double media;

}

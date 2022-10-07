package br.com.caelum.eats.distancia;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class RestauranteComDistanciaDto {
	
	private Long restauranteId;

	private BigDecimal distancia;

	public RestauranteComDistanciaDto(Long restauranteId2, BigDecimal distancia2) {
		this.restauranteId = restauranteId2;
		this.distancia = distancia2;
	}

	public Long getRestauranteId() {
		return restauranteId;
	}

	public void setRestauranteId(Long restauranteId) {
		this.restauranteId = restauranteId;
	}

	public BigDecimal getDistancia() {
		return distancia;
	}

	public void setDistancia(BigDecimal distancia) {
		this.distancia = distancia;
	}

	

}

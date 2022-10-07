package br.com.caelum.eats.restaurante;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class Cardapio {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@OneToOne(optional=false)
	private Restaurante restaurante;

	@OneToMany(mappedBy="cardapio")
	private List<CategoriaDoCardapio> categorias = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public List<CategoriaDoCardapio> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<CategoriaDoCardapio> categorias) {
		this.categorias = categorias;
	}
	
	

}

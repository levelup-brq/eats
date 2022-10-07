package br.com.caelum.eats.distancia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String cep;

	@Column(nullable = false)
	private Long tipoDeCozinhaId;
	
	

	public Restaurante() {
	}



	public Restaurante(Long id, String cep, Long tipoDeCozinhaId) {
		this.id = id;
		this.cep = cep;
		this.tipoDeCozinhaId = tipoDeCozinhaId;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	public Long getTipoDeCozinhaId() {
		return tipoDeCozinhaId;
	}



	public void setTipoDeCozinhaId(Long tipoDeCozinhaId) {
		this.tipoDeCozinhaId = tipoDeCozinhaId;
	}

	
}

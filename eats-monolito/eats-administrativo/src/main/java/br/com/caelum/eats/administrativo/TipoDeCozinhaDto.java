package br.com.caelum.eats.administrativo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoDeCozinhaDto {

	private Long id;
	private String nome;

	public TipoDeCozinhaDto(TipoDeCozinha tipo) {
		this(tipo.getId(), tipo.getNome());
	}
	
	

	public TipoDeCozinhaDto() {
	}



	public TipoDeCozinhaDto(Long id2, String nome2) {
		// TODO Auto-generated constructor stub
	}

	public TipoDeCozinha toTipoDeCozinha() {
		return new TipoDeCozinha(id, nome);
	}

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
	
	
}

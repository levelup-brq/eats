package br.com.caelum.eats.pedido;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import br.com.caelum.eats.restaurante.ItemDoCardapio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class ItemDoPedido {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@NotNull @Positive
	private Integer quantidade;

	private String observacao;
	
	@ManyToOne(optional=false)
	private Pedido pedido;

	@ManyToOne(optional=false)
	private ItemDoCardapio itemDoCardapio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public ItemDoCardapio getItemDoCardapio() {
		return itemDoCardapio;
	}

	public void setItemDoCardapio(ItemDoCardapio itemDoCardapio) {
		this.itemDoCardapio = itemDoCardapio;
	}

	
	
}

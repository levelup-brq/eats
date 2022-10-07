package br.com.caelum.eats.pedido;

import br.com.caelum.eats.restaurante.ItemDoCardapioDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class ItemDoPedidoDto {

	private Long id;
	private Integer quantidade;
	private String observacao;
	private ItemDoCardapioDto itemDoCardapio;

	public ItemDoPedidoDto(ItemDoPedido item) {
		this(item.getId(), item.getQuantidade(), item.getObservacao(), new ItemDoCardapioDto(item.getItemDoCardapio()));
	}
	
	

	public ItemDoPedidoDto(Long id2, Integer quantidade2, String observacao2, ItemDoCardapioDto itemDoCardapioDto) {
		
		this.id = id2;
		this.itemDoCardapio = itemDoCardapioDto;
		this.observacao = observacao2;
		this.quantidade = quantidade2;
	}



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

	public ItemDoCardapioDto getItemDoCardapio() {
		return itemDoCardapio;
	}

	public void setItemDoCardapio(ItemDoCardapioDto itemDoCardapio) {
		this.itemDoCardapio = itemDoCardapio;
	}
	
	

}

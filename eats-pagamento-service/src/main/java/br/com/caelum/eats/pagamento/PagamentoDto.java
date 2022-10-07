package br.com.caelum.eats.pagamento;

import java.math.BigDecimal;

import br.com.caelum.eats.pagamento.Pagamento.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class PagamentoDto {

	private Long id;
	private BigDecimal valor;
	private String nome;
	private String numero;
	private String expiracao;
	private String codigo;
	private Pagamento.Status status;
	private Long formaDePagamentoId;
	private Long pedidoId;

	PagamentoDto(Pagamento p) {
		this(p.getId(), p.getValor(), p.getNome(), p.getNumero(), p.getExpiracao(), p.getCodigo(), p.getStatus(), p.getFormaDePagamentoId(), p.getPedidoId());
	}

	public PagamentoDto(Long id2, BigDecimal valor2, String nome2, String numero2, String expiracao2, String codigo2,
			Status status2, Long formaDePagamentoId2, Long pedidoId2) {
		
		this.codigo = codigo2;
		this.expiracao = expiracao2;
		this.formaDePagamentoId = formaDePagamentoId2;
		this.id = id2;
		this.nome = nome2;
		this.numero = numero2;
		this.pedidoId = pedidoId2;
		this.status = status2;
		this.valor = valor2;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getExpiracao() {
		return expiracao;
	}

	public void setExpiracao(String expiracao) {
		this.expiracao = expiracao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Pagamento.Status getStatus() {
		return status;
	}

	public void setStatus(Pagamento.Status status) {
		this.status = status;
	}

	public Long getFormaDePagamentoId() {
		return formaDePagamentoId;
	}

	public void setFormaDePagamentoId(Long formaDePagamentoId) {
		this.formaDePagamentoId = formaDePagamentoId;
	}

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}
	
	

}

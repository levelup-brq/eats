package br.com.caelum.eats.pagamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caelum.eats.pagamento.client.PedidoCliente;


@Service
public class ClienteRestDoPedido {
    
    @Autowired
    private PedidoCliente pedidoCliente;

   
    void notificaPagamentoDoPedido(Long pedidoId) {
    	PedidoMudancaDeStatusRequest pedidoMudanca = new PedidoMudancaDeStatusRequest();
        pedidoMudanca.setStatus("PAGO");
        
        pedidoCliente.pagamentoPedido(pedidoId, pedidoMudanca);
    }
}

/*@Getter
@AllArgsConstructor
public
class PedidoMudancaDeStatusRequest {
	
    public PedidoMudancaDeStatusRequest(String upperCase) {
		this.status = upperCase;
	}

	private String status;
}*/



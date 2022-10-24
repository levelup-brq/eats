package br.com.caelum.eats.pagamento;

import lombok.AllArgsConstructor;
import lombok.Getter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.caelum.eats.pagamento.client.PedidoCliente;

import java.util.Map;

@Service
public class ClienteRestDoPedido {

    // @Value("${configuracao.monolito.url}")
    // private String monolitoUrl;

    // @Autowired
    // private RestTemplate restTemplate;

    @Autowired
    private PedidoCliente pedidoCliente;

    void notificaPagamentoDoPedido(Long pedidoId) {
        //String endpoint = this.monolitoUrl.concat(String.format("/pedidos/%d/status", pedidoId));

        //ResponseEntity<?> response = restTemplate.exchange(endpoint, HttpMethod.PUT, new HttpEntity<>(new PedidoMudancaDeStatusRequest("pago".toUpperCase())), Map.class);

        //this.restTemplate.put(endpoint, new PedidoMudancaDeStatusRequest("pago".toUpperCase()));

        // if (!HttpStatus.valueOf(response.getStatusCodeValue()).is2xxSuccessful()) {
        //     throw new RuntimeException("problema ao tentar mudar o status do pedido: " + pedidoId);
        // }

        PedidoMudancaDeStatusRequest pedidoMudanca = new PedidoMudancaDeStatusRequest();
        pedidoMudanca.setStatus("PAGO");

        pedidoCliente.pagamentoPedido(pedidoId, pedidoMudanca);
    }
}

/* 
@Getter
@AllArgsConstructor
class PedidoMudancaDeStatusRequest {
    private String status;
}
*/



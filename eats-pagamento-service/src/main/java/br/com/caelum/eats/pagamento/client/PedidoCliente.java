package br.com.caelum.eats.pagamento.client;

 import org.springframework.cloud.openfeign.FeignClient;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;

 import br.com.caelum.eats.pagamento.PedidoMudancaDeStatusRequest;

 @FeignClient("monolito")
 public interface PedidoCliente {

   @RequestMapping(method = RequestMethod.PUT, value="/pedidos/{id}/status")
 	public Object pagamentoPedido(@PathVariable Long id, PedidoMudancaDeStatusRequest mudanca);

 }
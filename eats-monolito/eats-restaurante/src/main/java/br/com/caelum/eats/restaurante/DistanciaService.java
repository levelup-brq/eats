package br.com.caelum.eats.restaurante;

 import org.springframework.cloud.openfeign.FeignClient;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;

 @FeignClient("localizacao")
 public interface DistanciaService {

   @RequestMapping(method = RequestMethod.POST, value="/restaurantes")
   void adicionarDistancia(Distancia distancia);

   @RequestMapping(method = RequestMethod.POST, value="/restaurantes/{id}")
   void editarDistancia(@PathVariable Long id, Distancia distancia);
 }
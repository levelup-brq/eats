package br.com.caelum.eats.restaurante;

public class Distancia {

  private Long id;
  private String cep;
  private Long tipoCozinhaId;

  public Distancia(Long id, String cep, Long tipoCozinhaId) {
    this.id = id;
    this.cep = cep;
    this.tipoCozinhaId = tipoCozinhaId;
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
  
  public Long getTipoCozinhaId() {
    return tipoCozinhaId;
  }
  public void setTipoCozinhaId(Long tipoCozinhaId) {
    this.tipoCozinhaId = tipoCozinhaId;
  }

}

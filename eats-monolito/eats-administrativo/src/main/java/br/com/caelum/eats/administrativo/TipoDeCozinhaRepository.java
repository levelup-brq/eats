package br.com.caelum.eats.administrativo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDeCozinhaRepository extends JpaRepository<TipoDeCozinha, Long> {

	List<TipoDeCozinha> findAllByOrderByNomeAsc();

}

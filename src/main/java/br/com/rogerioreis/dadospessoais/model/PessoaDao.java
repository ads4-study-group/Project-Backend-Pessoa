package br.com.rogerioreis.dadospessoais.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // esta notação faz a classe se comportar como DAO (persistência no banco de dados)
public interface PessoaDao extends JpaRepository<Pessoa, Long> {
	
}

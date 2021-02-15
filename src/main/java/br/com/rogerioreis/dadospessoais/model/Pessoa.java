package br.com.rogerioreis.dadospessoais.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data // esta notação informa que os getters, setters, toString e EqualsHash serão automáticos
@Entity // esta notação informa que esta classe será uma entidade no banco de dados
public class Pessoa {
	
	@Id // informa que este campo é um id
	@GeneratedValue (strategy = GenerationType.IDENTITY) // aqui é definido a estratégia da geração de id
	private Long id;
	private String nome;
	private Integer idade;
	private char sexo;
	
}

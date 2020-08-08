package br.com.escola.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

	private String logradouro;
	
	private String numero;
	
	@Column(length = 8)
	private String cep;
	
	private String complemento;
	
	@Column(length = 2)
	private String uf;
	
	private String cidade;
	
	private String bairro;
}

package br.com.escola.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.br.CPF;

import br.com.escola.model.enumeration.Sexo;
import br.com.escola.model.enumeration.Turno;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity<T> implements Serializable{
	
	private static final long serialVersionUID = -4146621608609091714L;

	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
    
	private String nome;
	
	private BigDecimal salario;
	
	@CPF
	@Column(length = 14, nullable = false, unique = true )
	private String cpf;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@Enumerated(EnumType.STRING)
	private Turno turno;
	
	@Embedded
	private Endereco endereco;
	
	@Embedded
	private Contato contato;
}

package br.com.escola.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contato {

	@Email
	private String email;
	
	@Column(length = 11)
	private String telefone;
	
	@Column(length = 11)
	private String whatssap;
}

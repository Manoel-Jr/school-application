package br.com.escola.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cozinheiro")
public class Conzinheiro extends BaseEntity<Long>{

	private static final long serialVersionUID = -1146234996763186860L;
	
	private Boolean isCertificado;
	
	public boolean hasCertificado() {
		return isCertificado != null ? true : false;
	}
}

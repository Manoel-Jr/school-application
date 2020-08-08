package br.com.escola.model.enumeration;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Sexo {

	MASCULINO(1),
	FEMININO(2);
	
	private Integer id;
	
	public static Sexo carregarPorId(Integer id) {
		for (Sexo sexo : Sexo.values()) {
			if(sexo.getId().equals(id)) {
				return sexo;
			}
		}
		return null;
	}
	
}

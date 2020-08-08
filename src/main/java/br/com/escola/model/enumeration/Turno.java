package br.com.escola.model.enumeration;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Turno {

	MANHÃ(1),
	TARDE(2),
	NOITE(3);
	
  private Integer id;
  
  
  public static Turno carregarPorId(Integer id) {
	  for(Turno turno : Turno.values()) {
		if(turno.getId().equals(id)) {
			return turno;
		}
	}
	  return null;
  }
}

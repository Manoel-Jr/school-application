package br.com.escola.model.enumeration;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Disciplina {

	PORTUGUES(1,"Português"),
	MATEMATICA(2,"Matematica"),
	GEOGRAFIA(3, "Geografia"),
	HISTORIA(4,"Historia"),
	ED_FISICA(5,"Educação Fisica"),
	ARTES(6,"Artes"),
	CIENCIAS(7,"Ciências"),
	QUIMICA(8,"Quimica"),
	FILOSOFIA(9,"Filosofia"),
	SOCIOLOGIA(10,"Sociologia"),
	INGLES(11,"Inglês");
	
	private Integer id;
	private String descricao;
	
	public static Disciplina carregarPorId(Integer id) {
		for (Disciplina disciplina : Disciplina.values()) {
			if(disciplina.getId().equals(id)){
				return disciplina;
			}
		}
		return null;
	}
}

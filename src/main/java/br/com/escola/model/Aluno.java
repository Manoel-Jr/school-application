package br.com.escola.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.escola.model.enumeration.Disciplina;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "aluno")
public class Aluno extends BaseEntity<Long>{

	private static final long serialVersionUID = 7275986317036584079L;
	
	@Column(unique = true)
	private Long matricula;
	
	private List<Disciplina> disciplinas;
	
	@ManyToOne
	@JoinColumn(name = "codigo_professor")
	private Professor professor;
	
	
	private Double nota;
}

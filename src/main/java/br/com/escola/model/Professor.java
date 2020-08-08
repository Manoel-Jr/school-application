package br.com.escola.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import br.com.escola.model.enumeration.Disciplina;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "professor")
public class Professor extends BaseEntity<Long> implements Serializable{
	
	private static final long serialVersionUID = 5955621710579607693L;
    
	@Enumerated(EnumType.STRING)
	private List<Disciplina> disciplinas;
}

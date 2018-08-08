package br.com.faculdade.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.faculdade.entidades.Aluno;
import br.com.faculdade.entidades.Disciplina;

public class DisciplinasDAO {
	public final static Map<Long,Disciplina> DISCIPLINAS = new HashMap<>();
	static{
		geraIdAdiciona(new Disciplina(1,"Matemática"));
		geraIdAdiciona(new Disciplina(2,"Biologia"));
		geraIdAdiciona(new Disciplina(3,"Fisica"));
		
	}
	public static void geraIdAdiciona(Disciplina disciplina){
		long id = DISCIPLINAS.size()+1;
		disciplina.setId(id);
		DISCIPLINAS.put(id, disciplina);
	}
	public void adiciona(Disciplina disciplina){
		geraIdAdiciona(disciplina);
	}
}

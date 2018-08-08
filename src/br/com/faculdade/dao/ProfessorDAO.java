package br.com.faculdade.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.faculdade.entidades.Disciplina;
import br.com.faculdade.entidades.Professor;

public class ProfessorDAO {
	public final static Map<Long,Professor> PROFESSOR = new HashMap<>();
	static{
		geraIdAdiciona(new Professor(1,"Mario"));
		geraIdAdiciona(new Professor(2,"Fernando Silva"));
		geraIdAdiciona(new Professor(3,"Albeto Torres"));
		
	}
	public static void geraIdAdiciona(Professor professor){
		long id = PROFESSOR.size()+1;
		professor.setID(id);
		PROFESSOR.put(id, professor);
	}
}

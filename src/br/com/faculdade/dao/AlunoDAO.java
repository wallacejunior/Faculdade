package br.com.faculdade.dao;
import java.util.HashMap;
import java.util.Map;

import br.com.faculdade.entidades.Aluno;
import br.com.faculdade.entidades.Disciplina;

public class AlunoDAO {

	public final static Map<Long,Aluno> ALUNOS = new HashMap<>();
	static{
		geraIdAdiciona(new Aluno(1,"Rafael Silva"));
		geraIdAdiciona(new Aluno(2,"André Fernandes"));
		geraIdAdiciona(new Aluno(2,"Antonio Santos"));
		
	}
	public static void geraIdAdiciona(Aluno aluno){
		long id = ALUNOS.size()+1;
		aluno.setMatricula(id);
		ALUNOS.put(id, aluno);
	}
	
	public void adiciona(Aluno aluno){
		geraIdAdiciona(aluno);
	}
	
}

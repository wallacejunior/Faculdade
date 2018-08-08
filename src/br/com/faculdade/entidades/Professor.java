package br.com.faculdade.entidades;

public class Professor {

	long id;
	String nome;
	String cpf;
	String RG;
	char sexo;
	public Professor(int id, String nome) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nome = nome;
	}
	public void setID(long id2) {
		id = id2;
		
	}
}

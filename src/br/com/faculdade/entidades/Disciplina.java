package br.com.faculdade.entidades;

public class Disciplina {

	long ID;
	String nome;
	String cargaHoraria;
	public Disciplina(int id, String nome) {
		this.ID = id;
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public long getID() {
		return ID;
	}
	public void setId(long id2) {
		ID = id2;
		
	}
}

package br.com.faculdade.entidades;

public class Aluno {
	private long matricula;
	private String nome;
	private String CPF;
	private String RG;
	private char sexo;
	
	public Aluno(long matricula,String nome){
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	

}

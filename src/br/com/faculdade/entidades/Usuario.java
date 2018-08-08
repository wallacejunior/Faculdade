package br.com.faculdade.entidades;

public class Usuario {

	private long id;
	private String login;
	private String senha;
	public Usuario( long id, String login, String senha) {
		this.id = id;
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}

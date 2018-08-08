package br.com.faculdade.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.faculdade.entidades.Professor;
import br.com.faculdade.entidades.Usuario;

public class UsuarioDAO {

	public final static Map<String,Usuario> USUARIOS = new HashMap<>();
	static{
		geraIdAdiciona("Mario@gmail.com",new Usuario(1,"Mario@gmail.com","123"));
		geraIdAdiciona("Fernando@gmail.com",new Usuario(2,"Fernando@gmail.com","132"));
		geraIdAdiciona("alberto@gmail.com",new Usuario(3,"alberto@gmail.com","123"));
		
	}
	public static void geraIdAdiciona(String idEmail, Usuario usuario){
		USUARIOS.put(idEmail, usuario);
	}
	public void adiciona(String email,Usuario usuario){
		geraIdAdiciona(email,usuario);
	}
	
	public Usuario buscaUsuario (String email, String senha){
		if (!USUARIOS.containsKey(email))
			return null;

		Usuario usuario = USUARIOS.get(email);
		if (usuario.getSenha().equals(senha))
			return usuario;
		
		return null;
	}
}

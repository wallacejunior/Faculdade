package br.com.faculdade.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.faculdade.dao.UsuarioDAO;
import br.com.faculdade.entidades.Usuario;

public class Login implements Tarefa {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Login");
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		UsuarioDAO usuarioDao = new UsuarioDAO();
		Usuario usuario =  usuarioDao.buscaUsuario(email, senha);
		if (usuario == null) {
			System.out.println("usuario inválido");
		}
		return "/WEB-INF/paginas/login.jsp";
	}

	
}

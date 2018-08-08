package br.com.faculdade.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/executa")
public class Controller extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String tarefa=req.getParameter("tarefa");
		System.out.println(tarefa);
		if (tarefa == null) {
			
			throw new ServletException("Não foi passado parametro tarefa!");
		}
		tarefa = "br.com.faculdade.web." + tarefa;
		try {
			Class<?> tipo = Class.forName(tarefa);
			Tarefa obj = (Tarefa)tipo.newInstance();
			String pagina = obj.executa(req, resp);
			RequestDispatcher dispatcher = req.getRequestDispatcher(pagina);
			dispatcher.forward(req, resp);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			throw new ServletException(e);
		}
		
	}
}

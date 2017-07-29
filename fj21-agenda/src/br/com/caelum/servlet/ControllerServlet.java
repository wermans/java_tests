package br.com.caelum.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

import br.com.caelum.mvc.logica.Logica;

@WebServlet("/mvc")
public class ControllerServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
		String parametro = request.getParameter("logica");
		String nomeClasse = "br.com.caelum.mvc.logica." + parametro;
		
		try{
			Class classe = Class.forName(nomeClasse);
			
			Logica logica = (Logica) classe.newInstance();
			String pagina = logica.executa(request, response);
			
			request.getRequestDispatcher(pagina).forward(request, response);
		} catch(Exception e){
			throw new ServletException("A logica de negocios causou uma exeção", e);
		}
	}
}

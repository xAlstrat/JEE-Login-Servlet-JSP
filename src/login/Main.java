package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class Main extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		if (request.getSession(false)==null || request.getSession().getAttribute("username") == null){
			response.sendRedirect("/hello/login");
		}
		else{
			/*
			String user = (String) request.getSession(true).getAttribute("username");
			PrintWriter a = response.getWriter();
			a.println("Hola !" + user);*/
			request.getRequestDispatcher("Main.jsp").forward(request, response);
		}
			
	}
}

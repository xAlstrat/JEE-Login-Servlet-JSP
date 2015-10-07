package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		/*
		response.setContentType("text/html");
		PrintWriter a = response.getWriter();
		a.println("<form method='POST'>");
		a.println("Usuario <input type='text' name='user' /><br />"
				+ "Password <input type='password' name='pass'/>"
				+ "<input type='submit' value='Ingresar'/>");
		a.println("</form>");*/
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		if(user.equals("user") && pass.equals("123")){
			request.getSession(true).setAttribute("username", "user");
			response.sendRedirect("/hello/main");
		}
		else{
			doGet(request, response);
		}
	}

}

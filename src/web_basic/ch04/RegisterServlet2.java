package web_basic.ch04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch04/RegisterServlet2")
public class RegisterServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("id");
		String pwd1 = request.getParameter("pwd1");
		String pwd2 = request.getParameter("pwd2");
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		String phone = request.getParameter("phone");
		String homep = request.getParameter("homep");
		
		PrintWriter out = response.getWriter();
		out.printf("<html><h2>가입정보</h2><br>");
		out.printf("id %s<br> passwrd %s<br>", id, (pwd1.equals(pwd2)?"일치":"불일치"));
		out.printf("name %s<br>", name);
		out.printf("mail %s<br>", mail);
		out.printf("phone %s<br>", phone);
		out.printf("homep %s<br>", homep);		
		out.print("</html>");
		
	}

}

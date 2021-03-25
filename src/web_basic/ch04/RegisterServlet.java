package web_basic.ch04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch04/RegisterServlet")
public class RegisterServlet extends HttpServlet {
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
		String pwd = request.getParameter("pwd");
		
		String subject = request.getParameter("subject");
		String[] gubuns = request.getParameterValues("gubun");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		
		out.println("<h2>로그인 정보</h2>");
		out.printf("id = %s<br>", id);
		out.printf("password = %s<br>", pwd);
		
		out.println("<h2>수강과목</h2>");
		String t = null;
		if (subject.equals("eng")) {
			t = "영어회화";
		}else if(subject.equals("ch")){
			t = "중국어회화";
		}else {
			t = "일어회화";
		}		
		out.println("subject = " + t + "<br>");
		
		out.println("<h2>수강분야</h2>");
		
		for(String gubun : gubuns) {
			if (gubun.equals("grm")) {
				out.printf("분야 = %s<br>", "문법");		
			}
			if (gubun.equals("wr")) {
				out.printf("분야 = %s<br>", "작문");				
			}
			if (gubun.equals("rd")) {
				out.printf("분야 = %s<br>", "독해");				
			}
		}
		out.println("</html>");
	}

}

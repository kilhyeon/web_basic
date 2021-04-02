package web_basic.ch04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch04/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String selectClass = request.getParameter("class");
		String interest = request.getParameter("interest");
		String intro = request.getParameter("intro");
		
		PrintWriter out = response.getWriter();
		out.printf("아이디 : %s<br><br>", id);
		out.printf("비밀번호 : %s<br><br>", passwd);
		
		String cls = null;		
		if (selectClass.equals("archi")) {
			cls = "건축공학과";
		}
		if (selectClass.equals("mechanic")) {
			cls = "기계공학과";
		}
		if (selectClass.equals("indust")) {
			cls = "산업공학과";
		}
		if (selectClass.equals("elec")) {
			cls = "전기전자공학과";
		}
		if (selectClass.equals("computer")) {
			cls = "컴퓨터공학과";
		}
		if (selectClass.equals("chemical")) {
			cls = "화학공학과";
		}
		if (selectClass.equals("history")) {
			cls = "사학과";
		}
		if (selectClass.equals("lang")) {
			cls = "어문학부";
		}
		if (selectClass.equals("philo")) {
			cls = "철학과";
		}
		out.printf("선택 학과 : %s<br><br>", cls);
		
		out.printf("관심분야 : %s<br><br>", interest);
		
		out.printf("하고싶은말  : <br>%s<br><br>", intro.replace("\r\n", "<br>"));
		
	}

}

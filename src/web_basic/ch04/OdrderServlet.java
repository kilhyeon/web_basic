package web_basic.ch04;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch04/OdrderServlet")
public class OdrderServlet extends HttpServlet {
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
		
		String uname = request.getParameter("uname");
		String tel1 = request.getParameter("tel1");
		String addr = request.getParameter("addr");
		String tel2 = request.getParameter("tel2");
		String comment = request.getParameter("comment");
		String number1 = request.getParameter("number1");
		String number2 = request.getParameter("number2");
		String number3 = request.getParameter("number3");
		
		PrintWriter out = response.getWriter();
		out.printf("<html><h2>주문 정보</h2><br>");
		out.printf("이름 %s<br>", uname);
		out.printf("연락처 %s<br>", tel1);
		out.printf("주소 %s<br>", addr);
		out.printf("전화번호 %s<br>", tel2);
		out.printf("메모 %s<br>", comment);
		out.printf("과테말라 인티구아 %s 개<br>", number1);
		out.printf("인도네시아 만델링 %s 개<br>", number2);
		out.printf("인도네시아 만델링 %s 개<br>", number3);
		
		out.printf("</html>");
		
	}

}

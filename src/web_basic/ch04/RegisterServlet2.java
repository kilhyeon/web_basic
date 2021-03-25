package web_basic.ch04;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
		
		String member = request.getParameter("member");
		String stuffs = request.getParameter("stuffs");
		int satis = Integer.parseInt(request.getParameter("satis"));
		
		String subject = request.getParameter("subject");
		String[] mailings = request.getParameterValues("mailing");
		
		String start = request.getParameter("start-date");
		String end = request.getParameter("end-date");
		
		PrintWriter out = response.getWriter();
		out.printf("<html><h2>가입정보</h2><br>");
		out.printf("id %s<br> passwrd %s<br>", id, (pwd1.equals(pwd2)?"일치":"불일치"));
		out.printf("name %s<br>", name);
		out.printf("mail %s<br>", mail);
		out.printf("phone %s<br>", phone);
		out.printf("homep %s<br>", homep);
		
		out.printf("member %s 명<br>", member);
		out.printf("stuffs %s 개<br>", stuffs);
		out.printf("satis %s <br>", satis==1?"하":(satis==2?"중":"상"));
		
		if (subject.equals("speaking")) {
			out.printf("subject %s<br>", "회화");
		}
		if (subject.equals("grammar")) {
			out.printf("subject %s<br>", "작문");
		}
		if (subject.equals("writing")) {
			out.printf("subject %s<br>", "작문");
		}
		
		if (mailings == null) {
			out.println("선택한 수강분야가 없음");
		} else {
			for(String mailing : mailings) {
				if (mailing.equals("news")) {
					out.printf("mailing %s<br>", "해외 단신");
				}
				if (mailing.equals("dialog")) {
					out.printf("mailing %s<br>", "5분 회화");
				}
				if (mailing.equals("pops")) {
					out.printf("mailing %s<br>", "모닝팝스");	
				}
			}
		}
		
		/*
		 * out.printf("start %s<br>", start.substring(0, 10)); out.printf("end %s<br>",
		 * end.substring(0, 10)); out.printf("start Time %s<br>", start.substring(11,
		 * 16)); out.printf("end Time %s<br>", end.substring(11, 16));
		 */

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date startDate = sdf.parse(start);
			Date endDate = sdf.parse(end);
			
			out.printf("start %tF<br>", startDate);
			out.printf("end %tF<br>", endDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm");
		
		String startTime1 = request.getParameter("start-time1");
		String endTime1 = request.getParameter("end-time1");
		
		try {
			Date sTime1 = sdf2.parse(startTime1);
			Date eTime1 = sdf2.parse(endTime1);
			
			out.printf("start Time : %tT<br>", sTime1);
			out.printf("end Time : %tT<br>", eTime1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String startTime2 = request.getParameter("start-time2"); 
		String endTime2 = request.getParameter("end-time2");
		System.out.printf("%s - %s%n", startTime2, endTime2);
		
		LocalDateTime startDate = LocalDateTime.parse(startTime2, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		LocalDateTime endDate = LocalDateTime.parse(endTime2, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		out.printf("start Date-Time : %s<br>", startDate.format(formatter));
		out.printf("end Date-Time : %s<br>", endDate.format(formatter));
		out.printf("</html>");
		
		//localDateTime -> Date변환
		Date sd = Date.from(startDate.atZone(ZoneId.systemDefault()).toInstant());
		Date ed = Date.from(endDate.atZone(ZoneId.systemDefault()).toInstant());
		System.out.printf("%1$tF %1$tT - %2$tF %2$tT%n", sd, ed);
		
	}

}

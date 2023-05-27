package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Studentdto;
import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher;

@WebServlet("/edit1")
public class Editcontroller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
	 	
		String sid=req.getParameter("sid");
		int sid1=Integer.parseInt(sid);
		String sname=req.getParameter("sname");
		 String gender=req.getParameter("gender");
		 
		 String phno=req.getParameter("phno");
		 
		 long phno1= Long.parseLong(phno);
		 
		 Studentdto dto =new Studentdto();
		 dto.setSid(sid1);
		 dto.setSname(sname);
		 dto.setGender(gender);
		 dto.setPhno(phno1);
		 
		 Studentdao dao=new Studentdao();
		 dao.edit(dto);
		 
		 List<Studentdto> l1=dao.fetchAll();
		 
		 req.setAttribute("studentlist",l1);
		 
		 
		  resp.setContentType("text/html");
		 resp.getWriter().print("<h1>data updated successfully</h1>");
		 RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
		 
		rd.include(req, resp);
//		rd.forward(req, resp);
		 
	}

}

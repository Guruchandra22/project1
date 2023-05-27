package controllerloginvalidtion;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daovalidation.daologinvalid;
import dtovalidation.dtologinvalidation;

@WebServlet("/signin")
public class controllersigninvalidation extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);

	
	String name=req.getParameter("name");
	
    String phno=req.getParameter("phno");
   long num= Long.parseLong(phno);
   
    String email=req.getParameter("email");

    String password=req.getParameter("password");
     int pwd=Integer.parseInt(password);

 
    
    String gender=req.getParameter("gender");
    
     
    dtologinvalidation dto=new  dtologinvalidation();
     

     dto.setName(name);
     dto.setPhno(num);
     dto.setEmail(email);
     dto.setPassword(password);
     dto.setGender(gender);
     
     
   daologinvalid dao=new   daologinvalid();
   dao.equals(dto);
		
	}

}

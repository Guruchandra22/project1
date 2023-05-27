package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Daoservclass2;
import dto.Dtoservclass2;

@WebServlet("/insert")
public class Controllerservclass2  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		String id=	req.getParameter("id");
		int eid=Integer.parseInt(id);
	
	String name=req.getParameter("name");
	
    String phno=req.getParameter("phno");
   long num= Long.parseLong(phno);
   
    String email=req.getParameter("email");

    String password=req.getParameter("password");
    
    String cpassword=req.getParameter("cpassword");

    String dob=req.getParameter("dob");
  
    String country=req.getParameter("country");
    
    String gender=req.getParameter("gender");
    
     Dtoservclass2 dto2=new Dtoservclass2();
     
     dto2.setId(eid);
     dto2.setName(name);
     dto2.setPhno(num);
     dto2.setEmail(email);
     dto2.setPassword(password);
     dto2.setCpassword(cpassword);
     dto2.setDob(dob);
     dto2.setCountry(country);
     dto2.setGender(gender);
     
     
   Daoservclass2 dao2=new Daoservclass2();
   dao2.insert(dto2);
    
	}

}

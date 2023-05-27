package basics;

import java.awt.image.RescaleOp;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class File extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	System.out.println("welcome to servelets");
			res.getWriter().print("hjdfjenfweofioe");
			
			
		
	}
}



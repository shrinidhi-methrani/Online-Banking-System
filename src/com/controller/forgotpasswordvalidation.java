package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class forgotpasswordvalidation extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			String np=req.getParameter("np");
			String cnp=req.getParameter("cnp");
			
			if(np.length()==0 || cnp.length()==0)
			{
				resp.sendRedirect("/BankProject/invalidforgotpassword.html");
			}
			else if(np.equals(cnp)==true)
			{
				req.getServletContext().getRequestDispatcher("/forgotpassword").forward(req, resp);
			}
			else
			{
				resp.sendRedirect("/BankProject/passnotmatch.html");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

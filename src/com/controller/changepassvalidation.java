package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class changepassvalidation extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			String op=req.getParameter("op");
			String np=req.getParameter("np");
			String cnp=req.getParameter("cnp");
			
			if(op.length()==0 || np.length()==0 || cnp.length()==0)
			{
				resp.sendRedirect("/BankProject/invalidchangepassword.jsp");
			}
			else if(np.equals(cnp)==true)
			{
				req.getServletContext().getRequestDispatcher("/changepassword").forward(req, resp);
			}
			else
			{
				resp.sendRedirect("/BankProject/invalidchangepassword.jsp");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

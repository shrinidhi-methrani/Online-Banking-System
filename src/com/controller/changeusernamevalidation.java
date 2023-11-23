package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class changeusernamevalidation extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			String ou=req.getParameter("ou");
			String nu=req.getParameter("nu");
			
			if(ou.length()==0 || nu.length()==0)
			{
				resp.sendRedirect("/BankProject/changeusernameinvalid.jsp");
			}
			else
			{
				req.getServletContext().getRequestDispatcher("/changeusername").forward(req, resp);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

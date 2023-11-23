package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginvalidation extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		String uname=req.getParameter("uname");
		String password=req.getParameter("password");
		
		try
		{
		if(uname.length()==0 || password.length()==0)
		{
			resp.sendRedirect("/BankProject/incorrect.html");
		}
		else
		{
			req.getServletContext().getRequestDispatcher("/login").forward(req, resp);
		}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

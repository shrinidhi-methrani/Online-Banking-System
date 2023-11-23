package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class forpassvalidation extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			String accno=req.getParameter("accno");
			String uname=req.getParameter("uname");
			String mail=req.getParameter("mail");
			String phone=req.getParameter("phone");
			
			if(accno.length()==0 || uname.length()==0 || mail.length()==0 || phone.length()==0)
			{
				resp.sendRedirect("/BankProject/invalidforpass.html");
			}
			else
			{
				req.getServletContext().getRequestDispatcher("/forpass").forward(req,resp);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

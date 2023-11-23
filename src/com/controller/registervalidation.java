package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class registervalidation extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			String fname=req.getParameter("fname");
			String uname=req.getParameter("uname");
			String mail=req.getParameter("mail");
			String phone=req.getParameter("phone");
			String pass=req.getParameter("pass");
			String cpass=req.getParameter("cpass");
			String balance=req.getParameter("balance");
			
			if(fname.length()==0 || uname.length()==0 || mail.length()==0 || phone.length()==0 || pass.length()==0 || cpass.length()==0 || balance.length()==0)
			{
				resp.sendRedirect("/BankProject/reginvalid.html");
			}
			else if(pass.equals(cpass)==false)
			{
			resp.sendRedirect("/BankProject/reginvalid.html");
			}
			else
			{
				req.getServletContext().getRequestDispatcher("/register").forward(req, resp);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

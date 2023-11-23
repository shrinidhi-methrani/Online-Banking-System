package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Model.model;
public class changepassword extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			String op=req.getParameter("op");
			String np=req.getParameter("np");
			String cnp=req.getParameter("cnp");
			
			HttpSession session=req.getSession();
			int accno=(int)session.getAttribute("accno");
			
			model m=new model();
			m.setPassword(op);
			m.setaccno(accno);
			boolean status = m.changepassword(np);
			if(status==true)
			{
				resp.sendRedirect("/BankProject/changepasswordlogin.html");
			}
			else
			{
				resp.sendRedirect("/BankProject/incorrectchangepass.jsp");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
	}
}

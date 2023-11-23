package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Model.model;

public class changeusername extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			String ou=req.getParameter("ou");
			String nu=req.getParameter("nu");
			
			HttpSession hs=req.getSession();
			int accno=(int)hs.getAttribute("accno");
			
			model m=new model();
			m.setaccno(accno);
			m.setuname(ou);
			
			boolean status=m.changeusername(nu);
			
			if(status == true)
			{
				resp.sendRedirect("/BankProject/changeusernamelogin.html");
			}
			else
			{
				resp.sendRedirect("/BankProject/incorrectchangeusername.jsp");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Model.model;

public class forgotpassword extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			String np=req.getParameter("np");
			String cnp=req.getParameter("cnp");
			
			HttpSession hs=req.getSession();
			int accno=(int)hs.getAttribute("accno");
			String pass=(String)hs.getAttribute("password");
			
			model m=new model();
			m.setaccno(accno);
			m.setPassword(pass);
			
		    boolean status=m.forgotpass(np);
			if(status==true)
			{
				resp.sendRedirect("/BankProject/changepasswordlogin.html");
			}
			else
			{
				resp.sendRedirect("/BankProject/forgotpassfail.html");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

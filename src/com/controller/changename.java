package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Model.model;

public class changename extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			String on=req.getParameter("on");
			String nn=req.getParameter("nn");
			
			HttpSession hs=req.getSession();
			int accno=(int)hs.getAttribute("accno");
			
			model m=new model();
			m.setaccno(accno);
			m.setName(on);
			
			boolean status=m.changename(nn);
			
			if(status==true)
			{
				resp.sendRedirect("/BankProject/changenamelogin.html");
			}
			else
			{
				resp.sendRedirect("/BankProject/incorrectchangename.jsp");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

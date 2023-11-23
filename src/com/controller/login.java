package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Model.model;
public class login extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			String uname=req.getParameter("uname");
			String password=req.getParameter("password");	
			
			model m=new model();
			m.setuname(uname);
			m.setPassword(password);
			
			boolean status=m.login();
			if(status==true)
			{
				int a=m.getaccno();
				String b=m.getName();
				String c=m.getMail();
				double d=m.getPhone();
				String e=m.getPassword();
				int f=m.getBalance();
				String g=m.getuname();
				
				//Creating the session and adding the table values into the session
				HttpSession session=req.getSession(true);
				session.setAttribute("accno", a);
				session.setAttribute("name", b);
				session.setAttribute("mail", c);
				session.setAttribute("phone", d);
				session.setAttribute("passw", e);
				session.setAttribute("bal", f);
				session.setAttribute("username", g);
				
					
				resp.sendRedirect("/BankProject/home.jsp");
			}
			else
			{
				resp.sendRedirect("/BankProject/incorrect.html");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

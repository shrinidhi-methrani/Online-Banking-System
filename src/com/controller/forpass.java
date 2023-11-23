package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Model.model;

public class forpass extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			int accno=Integer.parseInt(req.getParameter("accno"));
			String uname=req.getParameter("uname");
			String mail=req.getParameter("mail");
			double phone=Double.parseDouble(req.getParameter("phone"));
			
			model m=new model();
			m.setaccno(accno);
			m.setuname(uname);
			m.setMail(mail);
			m.setPhone(phone);
			
			boolean status=m.forpassw();
			
			if(status==true)
			{
				int a=m.getaccno();
				String b=m.getName();
				String c=m.getMail();
				double d=m.getPhone();
				String e=m.getPassword();
				int f=m.getBalance();
				String g=m.getuname();
				
				HttpSession session=req.getSession(true);
				session.setAttribute("accno", a);
				session.setAttribute("name", b);
				session.setAttribute("mail", c);
				session.setAttribute("phone", d);
				session.setAttribute("password", e);
				session.setAttribute("balance", f);
				session.setAttribute("uname", g);
				
				resp.sendRedirect("/BankProject/forpasspassword.html");
			}
			else
			{
				resp.sendRedirect("/BankProject/incorrectforpass.html");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

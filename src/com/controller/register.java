package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.model;
public class register extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			String fname=req.getParameter("fname");
			String uname=req.getParameter("uname");
			String mail=req.getParameter("mail");
			double phone=Double.parseDouble(req.getParameter("phone"));
			String pass=req.getParameter("pass");
			String cpass=req.getParameter("cpass");
			int balance=Integer.parseInt(req.getParameter("balance"));
			
			
			model m=new model();
			m.setName(fname);
			m.setuname(uname);
			m.setMail(mail);
			m.setPhone(phone);
			m.setPassword(pass);
			m.setBalance(balance);
			
    		boolean status=m.register();
    		if(status==true)
    		{
    			resp.sendRedirect("/BankProject/registerlogin.html");
    		}
    		else
    		{
    			resp.sendRedirect("/BankProject/regincorrect.html");
    		}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

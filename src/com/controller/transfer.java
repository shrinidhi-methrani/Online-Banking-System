package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Model.model;

public class transfer extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			int acno=Integer.parseInt(req.getParameter("acno"));
			int amount=Integer.parseInt(req.getParameter("amount"));
			
			HttpSession session =req.getSession();
			int accno=(int)session.getAttribute("accno");
			
			model m=new model();
			
			m.setaccno(accno);
			boolean status=m.checkbalance();
			
			if(status==true)
			{
				int balance=m.getBalance();
			    if(amount<=balance)
			    	{
					 boolean status1=m.transfer(acno,amount);
					 
					 if(status1==true)
					 {
					    resp.sendRedirect("/BankProject/transfersuccess.jsp");
					 }
					 else
					 {
					    resp.sendRedirect("/BankProject/transferfail.jsp");
					 }
			    }
			    else
			    {
				     resp.sendRedirect("/BankProject/transferfailnobalance.jsp");
			    }
		}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

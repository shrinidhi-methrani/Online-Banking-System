package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Model.model;
public class balance extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			HttpSession session=req.getSession();
			int accno=(int)session.getAttribute("accno");
			
			model m=new model();
			m.setaccno(accno);
			boolean status=m.checkbalance();
			if(status==true)
			{
				int bal=m.getBalance();
				session.setAttribute("new_bal", bal);
				resp.sendRedirect("/BankProject/balancesuccess.jsp");
			}
			else
			{
				resp.sendRedirect("/BankProject/balancefail.jsp");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

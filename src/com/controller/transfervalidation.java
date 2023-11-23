package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class transfervalidation extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse resp)
	{
		try
		{
			String acno=req.getParameter("acno");
			String amount=req.getParameter("amount");
			
			if(acno.length()==0 || amount.length()==0)
			{
				resp.sendRedirect("transferinvalid.jsp");
			}
			else
			{
				req.getServletContext().getRequestDispatcher("/transfer").forward(req, resp);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

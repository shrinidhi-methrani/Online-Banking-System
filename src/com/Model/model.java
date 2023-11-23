
package com.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class model 
{
	String name;
	String mail;
	double phone;
	String password;
	int balance;
	String uname;
	int accno;
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String pass="S8123";
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	
	public model() 
	{
		try
		{
			//Initializing the connection with the database
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, pass);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public model(String name, String mail, int phone, String password, int balance) 
	{
		super();
		this.name = name;
		this.mail = mail;
		this.phone = phone;
		this.password = password;
		this.balance = balance;
	}
	
	
	public boolean login()
	{
		try
		{
			String sql="SELECT * FROM DHOLAKPURR_BANK WHERE USERID=? AND PASSWORD=?";
			pst=con.prepareStatement(sql);
			pst.setString(1, uname);
			pst.setString(2, password);
			rs=pst.executeQuery();
			
			if(rs.next()==true)
			{
				accno=rs.getInt(1);
				name=rs.getString(2);
				mail=rs.getString(3);
				phone=rs.getDouble(4);
				password=rs.getString(5);
				balance=rs.getInt(6);
				uname=rs.getString(7);
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean register()
	{
		try
		{
			String sql="INSERT INTO DHOLAKPURR_BANK VALUES(ACCNO.NEXTVAL,?,?,?,?,?,?)";
			pst=con.prepareStatement(sql);
			pst.setString(1,name);
			pst.setString(2, mail);
			pst.setDouble(3, phone);
			pst.setString(4, password);
			pst.setInt(5, balance);
			pst.setString(6, uname);
			
			int row=pst.executeUpdate();
			if(row==0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean checkbalance()
	{
		try
		{
			String sql="SELECT * FROM DHOLAKPURR_BANK WHERE ACCNUM=?";
			pst=con.prepareStatement(sql);
			pst.setInt(1, accno);
			rs=pst.executeQuery();
			
			if(rs.next()==true)
			{
				balance=rs.getInt(6);
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean changepassword(String np)
	{
		try
		{
			String sql="UPDATE DHOLAKPURR_BANK SET PASSWORD=? WHERE ACCNUM=? AND PASSWORD=?";
			pst=con.prepareStatement(sql);
			pst.setString(1, np);
			pst.setInt(2, accno);
			pst.setString(3, password);
			int row=pst.executeUpdate();
			
			if(row==0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean transfer(int acno,int amount)
	{
		try
		{
			String sql1="UPDATE DHOLAKPURR_BANK SET BALANCE=BALANCE-? WHERE ACCNUM=?";
			con.setAutoCommit(false);
			pst=con.prepareStatement(sql1);
			pst.setInt(1,amount);
			pst.setInt(2, accno);
			int row1=pst.executeUpdate();
			
			String sql2="UPDATE DHOLAKPURR_BANK SET BALANCE=BALANCE+? WHERE ACCNUM=?";
		    pst=con.prepareStatement(sql2);
		    pst.setInt(1, amount);
		    pst.setInt(2, acno);
		    int row2=pst.executeUpdate();
		    
		    if(row1 == 0 || row2==0)
		    {
		    	return false;
		    }
		    else
		    {
		    	con.commit();
		    	return true;
		    }
		}
		catch (Exception e) 
		{
			try
			{
				con.rollback();
			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean changename(String nn)
	{
		try
		{
			String sql="UPDATE DHOLAKPURR_BANK SET NAME=? WHERE ACCNUM=? AND NAME=?";
			pst=con.prepareStatement(sql);
			pst.setString(1, nn);
			pst.setInt(2, accno);
			pst.setString(3, name);
			int row=pst.executeUpdate();
			
			if(row==0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean forpassw()
	{
		try
		{
			String sql="SELECT * FROM DHOLAKPURR_BANK WHERE ACCNUM=? AND USERID=? AND MAIL=? AND PHONE=?";
			pst=con.prepareStatement(sql);
			pst.setInt(1, accno);
			pst.setString(2, uname);
			pst.setString(3, mail);
			pst.setDouble(4, phone);
			rs=pst.executeQuery();
			
			if(rs.next()==true)
			{
				accno=rs.getInt(1);
				name=rs.getString(2);
				mail=rs.getString(3);
				phone=rs.getDouble(4);
				password=rs.getString(5);
				balance=rs.getInt(6);
				uname=rs.getString(7);
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean forgotpass(String np)
	{
		try
		{
			String sql="UPDATE DHOLAKPURR_BANK SET PASSWORD=? WHERE ACCNUM=? AND PASSWORD=?";
			pst=con.prepareStatement(sql);
			pst.setString(1, np);
			pst.setInt(2, accno);
			pst.setString(3, password);
			int row=pst.executeUpdate();
			
			if(row==0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean changeusername(String nu)
	{
		try
		{
			String sql="UPDATE DHOLAKPURR_BANK SET USERID=? WHERE ACCNUM=? AND USERID=?";
			pst=con.prepareStatement(sql);
			pst.setString(1, nu);
			pst.setInt(2, accno);
			pst.setString(3, uname);
			int row=pst.executeUpdate();
			
			if(row==0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getuname() {
		return uname;
	}
	public void setuname(String  uname) {
		this.uname = uname;
	}
	public int getaccno() {
		return accno;
	}
	public void setaccno(int accno) {
		this.accno = accno;
	}
	
}

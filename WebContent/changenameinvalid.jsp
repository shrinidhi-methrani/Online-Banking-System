<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Name</title>
</head>
<body>
<h2>Invalid credentials please try again...!</h2>
<form action="/BankProject/changenamevalidation">
   <table>
   <tr>
   	<td><label>Old Name</label></td>
   	<td><input type="text" placeholder="Old Name" name="on"></td>
   </tr>
   
   <tr>
   	<td><label>New Name</label></td>
   	<td><input type="text" placeholder="New Name" name="nn"></td>
   </tr>
   
   <tr>
      <td><button type="submit" class="btn">Change Name</button></td>
   </tr>
   </table>
 </form>
</body>
</html>
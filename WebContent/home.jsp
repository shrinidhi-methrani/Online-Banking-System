<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>home page</title>
    <link rel="stylesheet" href="home.css">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>
    <header class="header">
        <a href="" class="logo">Logo</a>

        <nav class="navbar">
            <a href="#">Home</a>
            <a href="#">About</a>
            <a href="#">Gallery</a>
            <a href="#">Service</a>
            <a href="#">Contacts</a>
            <a href="/BankProject/logout.jsp">Logout<i class='bx bxs-user'></i></a>
        </nav>
    </header>
<%
//getting the session with its attributes
session =request.getSession();
int accno=(int)session.getAttribute("accno");
String name=(String)session.getAttribute("name");
String mail=(String)session.getAttribute("mailid");
String pass=(String)session.getAttribute("pass");
int bal=(int)session.getAttribute("bal");
String uname=(String)session.getAttribute("username");
double phone=(double)session.getAttribute("phone");
%>
<div class="main">
    <div class="name">
         <% 
        out.println("Welcome :"+name);
        %>
    </div>
    <div class="uname">
        <% 
        out.println("Username :"+uname);
        %>
    </div>
    <div class="accno">
     <% out.println("your account number is "+accno);%>
    </div>
</div>

    <div class="firstrow">
        <div class="wrapper">
            <a href="/BankProject/balance">
            <h1>Check Balance</h1>
            <i class='bx bxs-wallet-alt' ></i></a>
        </div>
        <div class="wrapper">
            <a href="/BankProject/applyloan.jsp">
            <h1>Apply Loan</h1>
            <div class="imgbox">

            </div></a>
        </div>

        <div class="wrapper">
            <a href="/BankProject/transfer.jsp">
            <h1>Money Transfer</h1>
            <div class="MoneyTransfer">

            </div></a>
        </div>
       
    </div>
    <div class="secondrow">
        <div class="wrapper">
            <a href="/BankProject/changename.jsp">
           <h1>Change Name</h1>
           <div class="ChangeName">

           </div></a>
        </div>

        <div class="wrapper">
            <a href="/BankProject/changeusername.jsp">
           <h1 style="font-size: 22px;">Change Username</h1>
           <div class="ChangeName">

           </div></a>
        </div>

           <div class="wrapper">
                <a href="/BankProject/changepassword.jsp">
                <h1>Change Password</h1>
                <div class="changepassword">
                
                </div></a>
            </div>
       
    </div>
</body>
</html>
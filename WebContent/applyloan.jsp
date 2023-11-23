<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Loan Page</title>
    <link rel="stylesheet" href="loanjsp.css">
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
        String uname=(String)session.getAttribute("username");
        String name=(String)session.getAttribute("name");
        %>
        <div class="main">
            <div class="name">
               <h3><% 
                out.println("Welcome "+name);
                %></h3> 
            </div>
            <div class="uname">
               <h3><% 
                out.println("Username :"+uname);
                %></h3> 
            </div>
            <div class="accno">
                <h3><% out.println("your account number is "+accno);%></h3> 
            </div>
         </div>

        <div class="firstrow">
            <div class="wrapper">
                <a href="/BankProject/carloan.jsp">
                <h1 style="text-align: center;">Car Loan</h1>
                <div class="imgbox">
    
                </div></a>
            </div>
            <div class="wrapper">
                <a href="/BankProject/homeloan.jsp">
                <h1>House Loan</h1>
                <div class="home">
    
                </div></a>
            </div>
            <div class="wrapper">
                <a href="/BankProject/educationloan.jsp">
                <h1>Education Loan</h1>
                <div class="education">
                
                </div></a>
            </div>
         </div>
         <div class="center">
            <a href="/BankProject/home.jsp"><button type="submit">Back</button></a>
         </div>
</body>
</html>
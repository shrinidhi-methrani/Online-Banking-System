<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="balancesuccess.css">
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
    int bal=(int)session.getAttribute("bal");
    %>
    <div class="main">
        <div class="name">
            <% 
            out.println("Welcome "+name);
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
    <div class="centercontent">
        <%
        int balance=(int)session.getAttribute("new_bal");
        %>
        <h2 style="color: #fff;" > 
          <% out.println("your balance is :"+balance); %>
        </h2></div>
        <div class="center">
        <a href="/BankProject/home.jsp"><button type="submit">Back</button></a>
    </div>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="transfer.css">
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
        <h3>
         <%out.println("Welcome "+name); %> 
        </h3>
        <h3>
         <%out.println("UserName :"+uname); %>
        </h3>
        <h3>
         <%out.println("Your Account Number is "+accno); %> 
        </h3>
        </div>

<div class="wrappershelp">
    <div class="wrapper">
         <form action="/BankProject/transfervalidation" onsubmit="return validation()" >
            <h1>Transfer Money</h1>
            <div class="input-box">
                <input type="number" placeholder="Account Number" name="acno" id="accno">
                <i class='bx bxs-lock-alt'></i>
                <span id="msgg" style="color: red; font-size: 12px;"></span>
            </div>

            <div class="input-box">
                <input type="number" placeholder="Amount" name="amountt" id="initbal">
                <i class='bx bx-rupee'></i>
               <span id="msg" style="color: red; font-size: 12px;"></span>
            </div>

            <button type="submit" class="btn">Transfer</button>
        </form>
    </div>
</div>
    <div class="centercontent">
       <div class="center">
         <a href="/BankProject/home.jsp"><button type="button">Back</button></a>
       </div>
   </div>
</body>
<script type="text/javascript" src="transfer.js"></script>

</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Transfer</title>
    <link rel="stylesheet" href="transfer.css">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <script src="transfer.js"></script>
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
        <form onsubmit="return validation()" action="/BankProject/transfervalidation" name="change">
            <h1>Transfer Money</h1>
            <h4 style="color: red;">Transfer failed, Invalid Account Provided</h4>
            <div class="input-box" id="accno">
                <input type="number" placeholder="Account Number" name="acno" id="accnum">
                <i class='bx bxs-lock-alt'></i>
                <span id="msg" class="formerror" style="color: red; font-size: 12px;"></span>
            </div>

            <div class="input-box" id="initbal">
                <input type="number" placeholder="Amount" name="amount" id="passw">
                <i class='bx bx-rupee'></i>
               <span id="msg" class="formerror" style="color: red; font-size: 12px;"></span>
            </div>

            <button type="submit" class="btn">Transfer</button>
        </form>
    </div>
</div>
    <div class="centercontent">
       <div class="center">
         <a href="/BankProject/home.jsp"><button type="submit">Back</button></a>
       </div>
   </div>
</body>
</html>
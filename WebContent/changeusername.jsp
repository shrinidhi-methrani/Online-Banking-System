<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Change Username</title>
    <link rel="stylesheet" href="transfer.css">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <script type="text/javascript" src="changeusername.js"></script>
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
    session =request.getSession();
    int accno=(int)session.getAttribute("accno");
    String uname=(String)session.getAttribute("username");
    String name=(String)session.getAttribute("name");
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

    <div class="wrappershelp">
        <div class="wrapper">
            <form onsubmit="return validation()" action="/BankProject/changeusernamevalidation" name="change">
                <h2 style="text-align: center;">Change Username</h2>
                <div class="input-box">
                    <input type="text" placeholder="Old Username" name="ou" required>
                    <i class='bx bxs-lock-alt'></i>
                </div>
    
                <div class="input-box" id="newuser">
                    <input type="text" placeholder="New Username" name="nu" required>
                    <i class='bx bxs-lock-alt'></i>
                    <span id="msg" class="formerror" style="color: red; font-size: 12px;"></span>
                </div>

                <button type="submit" class="btn">Change Username</button>
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
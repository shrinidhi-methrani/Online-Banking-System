<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="changepassword.css">
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
<div class="wrappershelp">
    <div class="wrapper">
        <form action="/BankProject/changepassvalidation">
            <h1>Change Password</h1>
            <h4 style="color: red;">Incorrect data provided, Please try again....!</h4>
            <div class="input-box">
                <input type="password" placeholder="Old Password" name="op" required>
                <i class='bx bxs-lock-alt'></i>
            </div>

            <div class="input-box">
                <input type="password" placeholder="New Password" name="np" required>
                <i class='bx bxs-lock-alt'></i>
            </div>

            <div class="input-box">
                <input type="password" placeholder="Confirm New Password" name="cnp" required>
                <i class='bx bxs-lock-alt'></i>
            </div>

            <button type="submit" class="btn">Change Password</button>
        </form>
    </div>
</div>
    <div class="centercontent">
       <div class="center">
       <a href="/BankProject/home.jsp"><button type="submit">Back</button></a>
   </div>
</body>
</html>
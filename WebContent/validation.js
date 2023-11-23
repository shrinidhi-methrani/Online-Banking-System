function clearErrors()
{
  errors = document.getElementsByClassName('formerror');
  for(let item of errors)
 { 
    item.innerHTML = "";
 }
}

function seterror(id, error)
{
  element=document.getElementById(id);
  element.getElementsByClassName('formerror')[0].innerHTML = error;
}

function validation()
{
    var returnval = true;
    clearErrors();

    var name=document.forms['registerform']["fname"].value;
    var name1=/^[a-zA-Z]+$/.test(name);
    if(name1 == false)
    {
    	 seterror("name","please enter alphabets only");
         returnval = false;
    }
    if(name.length<4)
    {
        seterror("name","please enter atleast 4 characters");
        returnval = false;
    }

    if (name.trim() == 0)
    {
        seterror("name","please enter the name");
        returnval = false;
    }
    

    var uname=document.forms['registerform']["uname"].value;
    var uname1= /\S\s\S/.test(uname);
    
    if(uname1 ==true)
    	{
    	  seterror("username","Please enter username without space");
          returnval = false;
    	}
    
     if(uname.length<5 || uname.length>9)
      {
          seterror("username","Please enter username grater then 5 and less then 9 characters");
          returnval = false;
      }
     if(uname.trim() == 0)
     {
         seterror("username","Please enter the username");
         returnval = false;
     }

     var email=document.forms['registerform']["mail"].value;
     if(email.length>15)
     {
         seterror("email","Please enter the mail id less then 15 characters");
         returnval = false;
     }

     var phone=document.forms['registerform']["phone"].value;
     var regax=/^[6-9]{1}[0-9]{9}$/.test(phone);
     if(regax == false)
     {
        seterror("phonenum","Invalid Number");
        returnval = false;
     }
     if(phone.length <10)
     {
        seterror("phonenum","Number is less then 10");
        returnval = false
     }  
     if(phone.length>10)
     {
        seterror("phonenum","number is grater then 10");
        return false;
     }

     var passw=document.forms['registerform']["pass"].value;
     var passw1=/\S\s\S/.test(passw);
     if(passw.trim()==0)
     {
        seterror("passw","Password cant be empty");
        returnval = false;
     }
     
     if(passw.trim().length<4)
     {
        seterror("passw","Password cant be less then 4 characters");
        returnval = false;
     }
     
     if(passw.trim().length>9)
     {
        seterror("passw","password cant be grater then 9 characters");
        returnval = false;
     }
     
     if(passw1 == true)
    	 {
    	 seterror("passw","Remove the spaces from password");
    	 returnval = false;
    	 }
     
     var cpassw=document.forms['registerform']["cpass"].value;
     if(cpassw != passw)
     {
        seterror("cpassw","Passwords are not matched");
        returnval = false;
     }
     
     var initbal=document.forms['registerform']["balance"].value;
     if(initbal<=0)
     {
        seterror("initbal","Please enter the positive value");
        returnval = false;
     }
     
    return returnval;
}
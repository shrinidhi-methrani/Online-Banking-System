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
	
	var accno=document.forms['change']["accno"].value;
	if(accno<=0)
		{
		   seterror("accnum","Please enter the positive value");
		   returnval =  false;
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

	return returnval; 
}
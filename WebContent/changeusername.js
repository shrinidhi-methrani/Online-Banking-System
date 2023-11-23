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
	
	var newuser=document.forms['change']["nu"].value;
	
	if(newuser.length<4)
		{
		seterror("newuser","Please enter the username minimum of 4 chars");
		returnval = false;
		}
	
	if(newuser.length>9)
		{
		seterror("newuser","Please enter the username less then 9 chars");
		returnval = false;
		}
	
	 if(newuser.trim().length == 0)
		{
		seterror("newuser","Please enter the username");
		returnval = false;
		}
    
    var uname1= /\S\s\S/.test(newuser);
    
    if(uname1 == true)
    	{
    	  seterror("newuser","Please enter username without space");
          returnval = false;
    	}
    
	return returnval;
}
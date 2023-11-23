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
	
	
	var passw=document.forms['change']["np"].value;
    var passw1=/\S\s\S/.test(np);
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
    
    if(passw.trim().length>8)
    {
       seterror("passw","password cant be grater then 8 characters");
       returnval = false;
    }
    
    if(passw1 == true)
   	 {
   	 seterror("passw","Remove the spaces from password");
   	 returnval = false;
   	 }
    
    var cpassw=document.forms['change']["cnp"].value;
    if(cpassw != passw)
    {
       seterror("cpassw","Passwords are not matched");
       returnval = false;
    }
    return returnval;
}
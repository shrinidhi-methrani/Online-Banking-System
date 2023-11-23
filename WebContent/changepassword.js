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
	clearErrors()
	
	var np = document.forms['change']["np"].value;
	if(np.length < 4)
		{
		seterror("passw","Password cant be less then 4 characters");
		returnval = false;
		}
	if(np.length>9)
		{
		seterror("passw","password cant be grater then 9 characters");
		returnval = false;
		}
	
	if(np.trim().length == 0)
		{
		seterror("passw","password cant be empty");
		returnval = false;
		}
	var np1 = /\S\s\S/.test(np);
	if(np1 == true)
		{
		seterror("passw","remove the spaces from the password");
		returnval = false;
		}
	
	var cnp= document.forms['change']["cnp"].value;
	
	if(cnp != np)
		{
		seterror("cpassw","passwords are not same");
		returnval = false;
		}
	return returnval;
}
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
    
    var name=document.forms['change']["nn"].value;
    if(name.length<5 || name.length>9)
     {
         seterror("name","Please enter name grater then 5 and less then 9 characters");
         returnval = false;
     }
     
    var name1=/^[a-zA-Z]+$/.test(name);
    if(name1 == false)
    {
    	 seterror("name","please enter alphabets only");
         returnval = false;
    }
    
    return returnval;
}
var validation = function()
{
    var accnum = document.getElementById("accno").value;

    if(accnum <= 0)
    {
        document.getElementById("msgg").innerHTML = "*Please enter the positive value";
        return false;
    }

    var initialbal = document.getElementById("initbal").value;

    if(initialbal <= 0)
    {
        document.getElementById("msg").innerHTML = "*Please enter the positive value";
        return false;
    }
}
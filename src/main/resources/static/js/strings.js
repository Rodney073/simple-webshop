/*
document.getElementById('button').addEventListener("click", function()
{
    document.querySelector('.bg-modal').style.display = "flex";
});

document.querySelector('.close').addEventListener("click", function()
{
    document.querySelector('.bg-modal').style.display = "none";
});
*/


document.getElementById('button').onclick = function(){
    document.querySelector('.bg-modal').style.display = "flex";
};

document.querySelector('.close').onclick = function() {
    document.querySelector('.bg-modal').style.display = "none";
};
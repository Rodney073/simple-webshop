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


document.querySelector('.button').onclick = function(){
    document.querySelector('.bg-modal').style.display = "flex";
    document.querySelector("html").style.overflow = "hidden";
};

document.querySelector('.close').onclick = function() {
    document.querySelector('.bg-modal').style.display = "none";
    document.querySelector("html").style.overflow = "unset";
};

document.getElementById('add').onclick = function(){
    document.querySelector('.bg-modal-add').style.display = "flex";
    document.querySelector("html").style.overflow = "hidden";
};

document.querySelector('.save').onclick = function() {
    document.querySelector('.bg-modal-add').style.display = "none";
    document.querySelector("html").style.overflow = "unset";
};

document.getElementById('deleteItem').onclick = function(){
    document.querySelector('.bg-modal-delete').style.display = "flex";
    document.querySelector("html").style.overflow = "hidden";
};

document.getElementById('delete').onclick = function() {
    document.querySelector('.bg-modal-delete').style.display = "none";
    document.querySelector("html").style.overflow = "unset";
};


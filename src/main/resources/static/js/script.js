// $(document).ready(function(){
//     // console.log(document.getElementById('inheritanceText').style.display);
//     //document.getElementById('inheritanceText').style.display = "none";
// });

function showOopPrincipleContent(content) {
    console.log(content);
    document.getElementById('oopPrincipleText').style.display = "";
    document.getElementById('oopPrincipleText').innerHTML = content;
}

function showSolidPrinciples() {
    console.log("123");
    $.get("solid", function(data, status){
       document.getElementById('content').innerHTML = data;
    });
}
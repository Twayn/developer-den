function showOopPrincipleContent(content) {
    document.getElementById('oopPrincipleText').style.display = "";
    document.getElementById('oopPrincipleText').innerHTML = content;
}

function showBasicPrinciples() {
    $.get("basic_oop_principles", function(data, status){
       document.getElementById('content').innerHTML = data;
    });
}

function showOtherPrinciples() {
    $.get("other_oop_principles", function(data, status){
        document.getElementById('content').innerHTML = data;
    });
}
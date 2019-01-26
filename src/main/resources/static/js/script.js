function showBasicPrinciples() {
    $.get("basic_principles", function(data, status){
       document.getElementById('content').innerHTML = data;
    });
}

function showOtherPrinciples() {
    $.get("other_principles", function(data, status){
        document.getElementById('content').innerHTML = data;
    });
}
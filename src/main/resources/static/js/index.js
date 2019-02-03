function showOOP() {
    $.get("oop_sidenav", function(data, status){
        document.getElementById('sidenav').innerHTML = data;
        initSidenav();
    });
}

function showAbstraction() {
    $.get("stub", function(data, status){
        document.getElementById('content').innerHTML = 'Abstraction is...';
    });
}

function showPolymorphism() {
    $.get("stub", function(data, status){
        document.getElementById('content').innerHTML = 'Polymorphism is...';
    });
}

function showInheritance() {
    $.get("stub", function(data, status){
        document.getElementById('content').innerHTML = 'Inheritance is...';
    });
}

function showIncapsulation() {
    $.get("stub", function(data, status){
        document.getElementById('content').innerHTML = 'Incapsulation is...';
    });
}


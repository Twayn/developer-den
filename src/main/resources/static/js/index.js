$(document).ready(function(){
    showSynopsis();
});

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

function showDB() {
    $.get("db_sidenav", function(data, status){
        document.getElementById('sidenav').innerHTML = data;
        initSidenav();
    });
}

function showRelationDB() {
    $.get("db", function(data, status){
        document.getElementById('content').innerHTML = data;
    });
}

function showKeys() {
    $.get("keys", function(data, status){
        document.getElementById('content').innerHTML = data;
    });
}

function showNormalForms() {
    $.get("normal_forms", function(data, status){
        document.getElementById('content').innerHTML = data;
    });
}

function showIndexes() {
    $.get("indexes", function(data, status){
        document.getElementById('content').innerHTML = data;
    });
}

function showTransactions() {
    $.get("transactions", function(data, status){
        document.getElementById('content').innerHTML = data;
    });
}

function showLocks() {
    $.get("locks", function(data, status){
        document.getElementById('content').innerHTML = data;
    });
}

function showSynopsis() {
    $.get("synopsis", function(data, status){
        document.getElementById('content').innerHTML = data;
    });
}


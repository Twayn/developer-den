function showOopPrincipleContent(content) {
    document.getElementById('oopPrincipleText').style.display = "";
    document.getElementById('oopPrincipleText').innerHTML = content;
}

function showBasicPrinciples() {
    $.get("basic_oop_principles", function(data, status){
       document.getElementById('content').innerHTML = data;
    });

    document.getElementById('sidenav').innerHTML =
        '<a href="#">Абстракция</a>\n' +
        '<a href="#">Полиморфизм</a>\n' +
        '<a href="#">Наследование</a>\n' +
        '<a href="#">Инкапсуляция</a>';
}

function showOtherPrinciples() {
    $.get("other_oop_principles", function(data, status){
        document.getElementById('content').innerHTML = data;
    });

    document.getElementById('sidenav').innerHTML = '' +
        '<a href="#">KISS</a>\n' +
        '<a href="#">YAGNI</a>\n' +
        '<a href="#">DRY</a>\n' +
        '<a class="dropdown-btn">SOLID\n' +
        '    <i style="font-size: 12px">&#9660;</i>\n' +
        '</a>\n' +
        '<div class="dropdown-container">\n' +
        '    <a href="#">Single responsibility</a>\n' +
        '    <a href="#">Open-closed</a>\n' +
        '    <a href="#">Liskov substitution</a>\n' +
        '    <a href="#">Interface segregation</a>\n' +
        '    <a href="#">Dependency inversion</a>\n';

    initSidenav();
}
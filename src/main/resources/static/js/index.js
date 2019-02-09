$(document).ready(function(){
    var url = window.location.pathname;
    var path = url.substr(1);
    if (path.length===0){
        showContent('synopsis')
    } else {
        showContent(path);
    }
});

function showSidenav(sidenav_path) {
    $.get('content/' + sidenav_path, function(data, status){
        document.getElementById('sidenav').innerHTML = data;
        initSidenav();
    });
}

function showContent(content_path) {
    $.get('content/' + content_path, function(data, status){
        document.getElementById('content').innerHTML = data;
        window.history.pushState("data", "title", "/"+content_path);
    });
}

$(window).on('popstate',function(event) {
    var url = document.location.pathname; //document.location
    var path = url.substr(1);
    $.get('content/' + path, function(data, status){
        document.getElementById('content').innerHTML = data;
    });
});
$(document).ready(function(){
    var url = window.location.pathname;
    if (!url.includes('content')){
        var path = url.substr(1);
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
    if (!url.includes('content')){
        var path = url.substr(1);
        showContent2(path);
    }
});

function showContent2(content_path) {
    $.get('content/' + content_path, function(data, status){
        document.getElementById('content').innerHTML = data;
    });
}

//FIXME prototype version
//Do refactoring
//Decide when use pushState
//Improve path extraction from url
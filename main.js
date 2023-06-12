document.getElementById('foo').addEventListener('click', function (e) {

    var img = document.createElement('img');
    
    img.setAttribute('src', 'F:\Users\Jasffer Catapat\Desktop\ONLINE TECH\images');
    
    e.target.appendChild(img);
    });
    
    window.onload=function(){
        document.getElementById("autoplay").play();
         }
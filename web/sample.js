function displayHello(){
    var msg;
    msg = document.getElementById("message");
    msg.outerHTML = "<h1>Hello world!</h1>";
}

function loop1(){
let text = "";
let i = 0;
do {
  text += i + "<br>";
  i++;
}
while (i < 5);
document.getElementById("dowhile").innerHTML = text;
}


function loop2(){
    let text = "";
for (let i = 0; i < 5; i++) {
  text += i + "<br>";
}
document.getElementById("for").innerHTML = text;
}

function loop3(){
    let text = "";
let i = 0;
while (i < 5) {
  text += i + "<br>";
  i++;
}
document.getElementById("while").innerHTML = text;
}
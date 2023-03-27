let chart__bar = document.querySelectosAll(".chart__bar");

function mostrarScroll() {


let scrollTop = document.documentElement.scrollTop;

for ( var i=0; i < chart__bar.length; i++){

let alturaanimation = chart__bar[i].offsetTop;
if(alturaanimation - 300 < scrollTop){
    chart__bar[i].style.opacity=1;
}

}

}
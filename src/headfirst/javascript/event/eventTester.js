function init() {
    var images = document.getElementsByTagName("img");
    for (var i = 0; i < images.length; i++) {
        images[i].onmouseover = showClearImg;
        images[i].onmouseout = showBlurImg;
    }
}

function showClearImg(event) {
    var image = event.target;
    var name = image.id + ".jpg";
    image.src = name;
    // image.onclick = reBlurImg(reBlurImg, 3000, image);;
}

function showBlurImg(event) {
    var image = event.target;
    var name = image.id + "blur.jpg";
    image.src = name;
    image.onclick = showClearImg;
}

function reBlurImg(image) {
    var name = image.id + "blur.jpg";
    image.src = name;

    image.onclick = showClearImg;
}

window.onload = init;

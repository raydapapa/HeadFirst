function init() {
    var images = document.getElementsByTagName("img");
    for (var i = 0; i < images.length; i++) {
        // images[i].onmouseover = showClearImg;
        // images[i].onmouseout = showBlurImg;
        images[i].onclick = showClearImg;
    }
}

function showClearImg(event) {
    var image = event.target;
    var name = image.id + ".jpg";
    image.src = name;

    setTimeout(function () {
        var name = image.id + "blur.jpg";
        image.src = name;

        image.onclick = showClearImg;
    }, 2000);

    // image.onclick = reBlurImg(reBlurImg, 3000, image);
}

function showBlurImg(event) {
    var image = event.target;
    var name = image.id + "blur.jpg";
    image.src = name;
    image.onclick = showClearImg;
}

function reBlurImg() {
    var name = image.id + "blur.jpg";
    image.src = name;

    image.onclick = showClearImg;
}

window.onload = init;

const a = {
    i: 1,
    toString: function () {
        return a.i++;
    }
}

if (a == 1 && a == 2 && a == 3) {
    console.log("true");
} else {
    console.log("false")
}

//the above code will will print "true"
function Dog(name, breed, weight) {
    this.name = name;
    this.breed = breed;
    this.weight = weight;
    this.bark = function () {
        if (this.weight > 25) {
            alert(this.name + " says Woof!");
        } else {
            alert(this.name + " says Yip!");
        }
    }
}

function Car(params) {
    this.make = params.make;
    this.model = params.model;
    this.year = params.year;
    this.color = params.color;
    this.passengers = params.passengers;
    this.convertible = params.convertible;
    this.mileage = params.mileage;
    this.started = false;

    this.start = function () {
        this.started = true;
    };
    this.stop = function () {
        this.started = false;
    };
    this.drive = function () {
        if (this.started) {
            console.log(this.make + " " + this.model + " goes zoom zoom!");
        } else {
            console.log("Start the engine first.");
        }
    };
}

// var fido = new Dog("Fido", "Mixed", 38);
// var fluffy = new Dog("Fluffy", "Poodle", 30);
// var spot = new Dog("Spot", "Chihuahua", 10);
// var dogs = [fido, fluffy, spot];

// for (var i = 0; i < dogs.length; i++) {
//     dogs[i].bark();
// }

function Coffee(roast, ounces) {
    this.roast = roast;
    this.ounces = ounces;
    this.getSize = function () {
        if (this.ounces <= 8) {
            return "small";
        } else if (this.ounces <= 12) {
            return "medium";
        } else {
            return "large";
        }
    };
    this.toString = function () {
        return "You've ordered a " + this.getSize() + " " + this.roast + " coffee.";
    }
}

// let coffe1 = new Coffee("blue mountain", 12);
// let coffe2 = new Coffee("cat poo", 8);
// alert(coffe1.toString());
// alert(coffe2.toString());


let cadiParams = {
    make: "GM",
    model: "Cadillac",
    year: 1955,
    color: "tan",
    passengers: 5,
    convertible: false,
    mileage: 12892
};

// console.log(cadi.make + " " + cadi.model + " is a " + typeof cadi);
// console.log(cadiDog.name + " is a " + typeof cadiDog);

// let obj = new Car(cadiParams);
let obj = new Dog("Rhapsody In Blue", "Poolde", 40);

if (obj instanceof Car) {
    console.log(obj.make + " " + obj.model + " is a car!");
} else if (obj instanceof Dog) {
    console.log(obj.name + " is a dog!");
}

function dogCatcher(obj) {
    return obj instanceof Dog;
}

function Cat(name, breed, weight) {
    this.name = name;
    this.breed = breed;
    this.weight = weight;
}

function Dog(name, breed, weight) {
    this.name = name;
    this.breed = breed;
    this.weight = weight;
}

Dog.prototype.species = "Cannie";
Dog.prototype.bark = function () {
    if (this.weight > 25) {
        alert(this.name + " says Woof!");
    } else {
        alert(this.name + " says Yip!");
    }
};
Dog.prototype.run = function () {
    alert("Run!");
};
Dog.prototype.wag = function () {
    alert("Wag!");
};


let meow = new Cat("Meow", "Siamese", 10);
let whiskers = new Cat("Whiskers", "Mixed", 12);

let fido = {name: "Fido", breed: "Mixed", weight: 38};

let fluffy = new Dog("Fluffy", "Poodle", 30);
let spot = new Dog("Spot", "Chihuahua", 10);
spot.bark = function () {
    alert(this.name + " says WOOF!");
};

let dogs = [meow, whiskers, fido, fluffy, spot];

for (let i = 0; i < dogs.length; i++) {
    if (dogCatcher(dogs[i])) {
        console.log(dogs[i].name + " is a dog!");
    }
}

fluffy.bark();
fluffy.run();
fluffy.wag();

spot.bark();
spot.run();
spot.wag();
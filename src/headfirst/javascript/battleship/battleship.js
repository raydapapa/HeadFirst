const ALPHABET = ["A","B","C","D","E","F","G","H","I","J"];
// const GUESS_REG = new RegExp("^[a-gA-G]{1}[0-7]{1}$");

let model = {
    boardSize: 7,
    numShips: 3,
    shipLength: 3,
    shipsSunk: 0,

    ships: [{locations: [0, 0, 0], hits: ["", "", ""]},
        {locations: [0, 0, 0], hits: ["", "", ""]},
        {locations: [0, 0, 0], hits: ["", "", ""]}],

    hitted: [],

    fire: function (guess) {
        for (let i = 0; i < this.numShips; i++) {
            const ship = this.ships[i];
            const hitIndex = ship.locations.indexOf(guess);
            if (hitIndex >= 0) {//is a hit
                if (this.hitted.indexOf(guess) >= 0) {//re-entered a hit
                    view.displayMessage("You re-entered a hit! That won't count!");
                    return false;
                }
                this.hitted.push(guess);
                ship.hits[hitIndex] = "hit";
                view.displayHit(guess);
                view.displayMessage("HIT!");
                if (this.isSunk(ship)) {
                    view.displayMessage("You sank my battleship!");
                    this.shipsSunk++;
                }
                return true;
            }
        }
        view.displayMiss(guess);
        view.displayMessage("You missed!");
        return false;
    },

    isSunk: function (ship) {
        for (let i = 0; i < this.shipLength; i++) {
            if (ship.hits[i] !== "hit") {
                return false;
            }
        }
        return true;
    },

    generateShipLocations: function () {
        let locations;
        for (let i = 0; i < this.numShips; i++) {
            do {
                locations = this.generateShip();
            } while (this.collision(locations));
            this.ships[i].locations = locations;
        }
    },

    generateShip: function () {
        const direction = Math.floor(Math.random() * 2); // get a random int between 0 and 1
        let row, col;

        if (direction === 1) {
            // horizontal ship
            row = Math.floor(Math.random() * this.boardSize);
            col = Math.floor(Math.random() * (this.boardSize - this.shipLength));
        } else {
            // vertical ship
            row = Math.floor(Math.random() * (this.boardSize - this.shipLength));
            col = Math.floor(Math.random() * this.boardSize);
        }

        let newShipLocations = [];
        for (let i = 0; i < this.shipLength; i++) {
            if (direction === 1) {
                newShipLocations.push(ALPHABET[row] + "" + (col + i));
            } else {
                newShipLocations.push(ALPHABET[row + i] + "" + col);
            }
        }

        return newShipLocations;
    },

    collision: function (locations) {
        for (let i = 0; i < this.numShips; i++) {
            let ship = this.ships[i];
            for (let j = 0; j < ship.locations.length; j++) {
                if (ship.locations.indexOf(locations[j]) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
};

let view = {
    displayMessage: function(msg) {
        const msgArea = document.getElementById("messageArea");
        msgArea.innerHTML = msg;
    },

    displayHit(location) {
        const cell = this.getCellByLocation(location);
        cell.setAttribute("class", "hit");
    },

    displayMiss(location) {
        const cell = this.getCellByLocation(location);
        cell.setAttribute("class", "miss");
    },

    getCellByLocation: function (location) {
        const x = ALPHABET.indexOf(location.substring(0, 1).toUpperCase());
        const y = location.substring(1, 2);
        return document.getElementById(x + "" + y);
    },

    gameover() {
        const fireForm = document.getElementById("fireForm");
        fireForm.style.display = 'none';
    }
};

let controller = {
    guesses: 0,

    processGuess: function(guess) {
        const location = this.checkGuess(guess);
        if (location) {
            this.guesses++;
            const hit = model.fire(location);
            if (hit && model.shipsSunk === model.numShips) {
                view.displayMessage("You sank all my battleships, in " + this.guesses + " guesses");
                view.gameover();
            }
        }
    },

    checkGuess: function(guess) {
        if (guess === null || guess.length !== 2) {
            alert("Oops, please enter a letter and a number on the board.");
        }
        else {
            const firstChar = guess.charAt(0);
            const row = ALPHABET.indexOf(firstChar.toUpperCase());
            const column = parseInt(guess.charAt(1));

            if (isNaN(row) || isNaN(column)) {
                alert("Oops, that isn't on the board.");
            } else if (row < 0 || row >= model.boardSize || column < 0 || column >= model.boardSize) {
                alert("Oops, that's off the board!");
            } else {
                return guess.toUpperCase();
            }

        }
        return null;
    }
};

function handleFireButton() {
    const guessInput = document.getElementById("guessInput");
    const guess = guessInput.value;
    controller.processGuess(guess);
    guessInput.value = "";
}

function handleKeyPress(e) {
    const fireButton = document.getElementById("fireButton");

    // in IE9 and earlier, the event object doesn't get passed to the event handler correctly, so we use window.event instead.
	e = e || window.event;

    if (e.keyCode === 13) {
        fireButton.click();
        return false;
    }
}

function init() {
    const fireButton = document.getElementById("fireButton");
    fireButton.onclick = handleFireButton;
    const guessInput = document.getElementById("guessInput");
    guessInput.onkeypress = handleKeyPress;

    model.generateShipLocations();
}

window.onload = init;

let y;
let r;
let x;

let cordX;
let cordY;
let inR = "form:coord-r_label",
    inY = "form:coord-y";

document.getElementById("area-enot").addEventListener("click", function (e) {
    cordX = e.offsetX
    cordY = e.offsetY
    getRValue()
    if (checkR()) {
        detectClick()
    }
})

function handleYInput() {
    let domY = document.getElementById(inY)
    domY.value = domY.value.replace(",", ".")
}

function detectClick() {
    convertCoordinates()
    setInputs()
    document.getElementById("submitParent").children[0].click()
}

function setInputs() {
    document.getElementById(inY).value = y
    document.getElementById(inR).value = r
    var inputs = document.querySelectorAll('.button-input')
    for (var i = 0; i < inputs.length; i++) {
        inputs[i].setAttribute('class', 'button-input')
        if (inputs[i].innerHTML == (Math.round(x)).toString()) {
            $('.button-input-selected')
                .add(inputs[i])
                .toggleClass('button-input-selected')
                .toggleClass('button-input');
            inputs[i].click()
        } else if ((Math.round(x)) < -3) {
            $('.button-input-selected')
                .add(inputs[0])
                .toggleClass('button-input-selected')
                .toggleClass('button-input');
            inputs[0].click()
        }
    }
}

function getRValue() {
    r = document.getElementById(inR).textContent
}

function convertCoordinates() {
    changeXCord()
    changeYCord()
    x = convertCoordinate(cordX)
    y = convertCoordinate(cordY)
}


function convertCoordinate(coord) {
    return (coord / 120) * r;
}

$('.button-input').click(function () {
    $('.button-input-selected')
        .add(this)
        .toggleClass('button-input-selected')
        .toggleClass('button-input');

})

function changeXCord() {
    let centerX = 150
    if (cordX < centerX) {
        cordX = -(centerX - cordX)
    } else {
        cordX = cordX - centerX
    }
}

function changeYCord() {
    let centerY = 150
    if (cordY > centerY) {
        cordY = -(cordY - centerY)
    } else {
        cordY = centerY - cordY
    }
}


function checkR() {
    if (r.length == 0 || !isNumber(r) || !((r <= 5) && r >= 1)) {
        return false
    } else {
        return true
    }
}

function isNumber(n) {
    return !isNaN(parseFloat(n)) && !isNaN(n - 0)
}







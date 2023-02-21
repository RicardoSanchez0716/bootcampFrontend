function siempreTrue(){
    return true
}

async function promesa() {
    return setTimeout(() => console.log("Hola soy una promesa"), 5000)
}

function* indicesPares() {
    let id = 0
    while(true) {
        yield id += 2
    }
}

const generadora = indicesPares()

class Estudiante {
    nombre = "Ricardo"
    asignaturas = ["JavaScript", "HTML", "CSS"]

    obtenDatos() {
        return {
            nombre: this.nombre,
            asignaturas: this.asignaturas
        }
    }
}

const estudiante = new Estudiante()
console.log(estudiante.obtenDatos())
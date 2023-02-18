let comprasList = ["Arroz", "Lentejas", "Huevos", "Carne", "Sal", "Chocolate"];
comprasList.push("Aceite de Girasol");

comprasList.pop();

let peliculasFav = [
    {nombre: "Señor de los anillos", director: "Peter Jackson", anio: 2001},
    {nombre: "EL club de la pelea", director: "David Fincher", anio: 1999},
    {nombre: "Bastardos sin gloria", director: "Quentin Tarantino", anio: 2009}
]

let peliculasRecientes = peliculasFav.filter(peli => peli.anio >2010);

let directores = peliculasFav.map((valor) =>  valor.director)

let peliculas = peliculasFav.map((valor) =>  valor.nombre)

let directorPelicula = directores.concat(peliculas)

let directorPeliculaF = [...directores, ...peliculas]
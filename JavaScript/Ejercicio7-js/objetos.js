let datosPersonales = {
    nombre: "Ricardo",
    apellido: "Leon",
    edad: 31,
    altura: 1.78,
    desarrollador: true,
  };
  
  let edad = datosPersonales.edad;
  
  let lista = [
    { ...datosPersonales },
    {
      nombre: "Pipe",
      apellido: "Leon",
      edad: 30,
      altura: 1.7,
      desarrollador: true,
    },
    {
      nombre: "Estiven",
      apellido: "Lopez",
      edad: 31,
      altura: 1.75,
      desarrollador: true,
    },
  ];
  
  let = listaOrde = lista.sort((a, b) => b.edad - a.edad)
  
  console.log(listaOrde);
  
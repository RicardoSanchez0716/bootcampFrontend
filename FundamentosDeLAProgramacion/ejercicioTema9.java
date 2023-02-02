public class Main {

    public static void main(String[] arg) {
        
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.edad = 22;
        cliente.nombre = "Pedro Contreras";
        cliente.telefono = "1243556757";
        cliente.credito = 24;

        System.out.println("Edad del cliente: " + cliente.edad + " años");
        System.out.println("Nombre del cliente: " + cliente.nombre);
        System.out.println("Telefono del cliente: " + cliente.telefono);
        System.out.println("Tiempo del credito del cliente: " + cliente.credito + " meses");

        System.out.println();

        trabajador.edad = 30;
        trabajador.nombre = "Camilo Dias";
        trabajador.telefono = "23546456456";
        trabajador.salario = "2.500.000";

        System.out.println("Edad del trabajador: " + trabajador.edad + " años");
        System.out.println("Nombre del trabajador: " + trabajador.nombre);
        System.out.println("Telefono del trebajador: " + trabajador.telefono);
        System.out.println("Salario del trabajador: " + trabajador.salario);
    }
}

class Persona{

    int edad;
    String nombre;
    String telefono;  
}

class Cliente extends Persona {

    int credito;
}

class Trabajador extends Persona {

    String salario;
}
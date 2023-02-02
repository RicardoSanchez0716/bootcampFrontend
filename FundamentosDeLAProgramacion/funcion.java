public class Main
{
		
	static int resul;
	public static void suma(int a, int b, int c){
		
		int resultado;
		resultado = a + b + c;
		
		System.out.println(resultado);	
	}


    
    
    public static void main(String[] args) {
		
		suma(50,40,20);
		
		Coche miCoche = new Coche();

        resul = miCoche.incrPuertas(miCoche.puertas);
        System.out.println("El coche ahora cuenta con " + resul + " puertas");

	}

}

 class Coche{
    
    int puertas = 4;
        
        
    public static int incrPuertas(int a){
        a = a + 1;
        
        return a;
    }
 }
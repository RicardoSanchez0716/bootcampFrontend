public class Main {
    
    public static void main(String[] arg){

        int numeroIf = -10;
    
        if (numeroIf > 0) {
            System.out.println("El numero es Positivo");
        }else if(numeroIf == 0){
            System.out.println("El numero es igual a 0");
        }else {
            System.out.println("El numero es negativo");
        }
        
        
        
        int numeroWhile = 0;
        
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while (numeroWhile < 3);
    
    
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        } 
        
        String estacion = "Invierno";
        
        switch(estacion) {
            case "Invierno":
                System.out.println("La estacion es Invierno");
                break;
            case "Verano":
                System.out.println("La estacion es Verano");
                break;
            case "Otoño":
                System.out.println("La estacion es Otoño");
                break;
            case "Primavera":
                System.out.println("La estacion es Primavera");
                break;
            default:
                System.out.println("No ingreso una estacion");
        }
        
    }
}
package RoadMap.Exepciones;

public class Exepcion {
	
	
	
	  
    // 1. UNCHECKED - divido dos numeros
   
    public void dividir(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("No puedes dividir entre cero");
        }
        System.out.println("Resultado: " + a / b);
    }


   
    // 2. UNCHECKED - convierto un texto a numero

    public void convertir(String texto) {

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("El numero es: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("'" + texto + "' no es un numero valido");
        }
    }


   
    
	
	
	

}

package RoadMap.InstaciadeBloke;

public class Instanciabloke {
	
	int valor;
	static int n;
	
	{
		 valor = 10; 
		
	}
	
	
	static {
		n = 0;
		System.out.println(n);
	}
	
	
	public void mostrar() {
		
		System.out.println("El valor es " + valor);
	}
	
public void sumar(int x) {
	
	valor = valor +x;
 	System.out.println("El valor es de " + valor);
	
	
}	









}

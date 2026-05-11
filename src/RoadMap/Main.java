package RoadMap;

import RoadMap.Enum.Enum;
import RoadMap.Exepciones.Exepcion;
import RoadMap.Modificador_de_Acceso.Pesona1;
import RoadMap.encapsulaminto.Persona;
import RoadMap.typecasting.TypeCasting; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Enum();
		herencia();
		modificador_de_acceso();
		type_casting();
		Excepciones();
	}
	
	
	
	
	
	

	
	public static void Enum() {
		Enum.Color miColor = Enum.Color.amarillo;
		Enum.Game gm = Enum.Game.lose;
		
		
		System.out.println(gm);
		
		for (Enum.Game g : Enum.Game.values()) {
			
			System.out.println(g);
			}
		
		
		
	System.out.println(miColor);
	System.out.println(Enum.Color.rojo);
	
	
		
	
	}
	
	public static void herencia() {
		
		Persona p1 = new Persona("tito", 18);
		
		System.out.println("El nombre es " +  p1.getNombre());
		System.out.println("La edad es " + p1.getEdad());
		
	}
	
	
	public static void modificador_de_acceso() {
		
		Pesona1 p2 = new Pesona1();
		
		p2.setNombre("tito");
		p2.setEdad(18);
		p2.setPais("Guatemala");
		p2.setCiudad("Jutiapa");
		
		System.out.println("El nombre es " + p2.getNombre());
		System.out.println("La edad es " + p2.getEdad());
		System.out.println( "El pais es " + p2.getPais());
		System.out.println( "La ciudad es " + p2.getCiudad());
		
		
	}
	
	public static void type_casting() {
		TypeCasting t = new TypeCasting();
		
		t.intADouble();
		t.intAString();
		t.stringAInt();
		
		
		
		}
	
	
	public static void Excepciones() {
		
		
		
		
		
		  Exepcion ej = new Exepcion();

	        // ---------- EJEMPLO 1 ----------
	        System.out.println("---------- DIVISION ----------");
	        try {
	            ej.dividir(10, 2);  // funciona
	            ej.dividir(10, 0);  // falla
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        // ---------- EJEMPLO 2 ----------
	        System.out.println("\n---------- CONVERSION ----------");
	        ej.convertir("42");   // funciona
	        ej.convertir("hola"); // falla

	        
	
	}
	
	
}

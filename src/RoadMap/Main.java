package RoadMap;

import RoadMap.Enum.Enum;
import RoadMap.encapsulaminto.Persona; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Enum();
		herencia();
		
		
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
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getEdad());
		
	}
	
	
	
}

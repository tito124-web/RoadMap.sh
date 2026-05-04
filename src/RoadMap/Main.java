package RoadMap;

import RoadMap.Enum.Enum; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Enum();
		
		
		
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
	
	
	
}

package RoadMap.Enum;

public class Enum {
	
	
	

	 public Enum() {
	        super();
	    }

	    // Un enum es como una lista de opciones fijas que NUNCA cambian
	    // Java lo trata internamente como una clase especial donde cada valor
	    // es un objeto constante y unico
	    // Se usa cuando tienes opciones predefinidas como dias, colores, estados
	    // Cada valor tiene una posicion interna llamada "ordinal" que empieza en 0
	    // rojo=0, ver=1, amarillo=2
	    // Puedes recorrerlos con Color.values() que devuelve todos los valores
	    // Puedes comparar con == porque cada valor es unico en memoria
	    public enum Color {
	        rojo, ver, amarillo
	    }

	    // Game funciona igual que Color
	    // win=0, lose=1, try_agen=2
	    // Ejemplo de uso:
	    // Game resultado = Game.win;
	    // if(resultado == Game.win) { System.out.println("Ganaste"); }
	    public enum Game {
	        win, lose, try_agen
	    }

	}

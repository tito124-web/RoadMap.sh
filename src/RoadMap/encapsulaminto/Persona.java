package RoadMap.encapsulaminto;

public class Persona {
	
	

		// ENCAPSULAMIENTO: los atributos son privados
		// nadie de afuera puede acceder directamente a ellos
		// solo se pueden modificar o leer a traves de los metodos get y set
		private String nombre;
		private int edad;


		// Constructor: forma de crear el objeto con valores iniciales
		public Persona(String nombre, int edad) {
			super();
			this.nombre = nombre;
			this.edad = edad;
		}


		// GET: metodo para LEER el valor de nombre desde afuera
		// como una ventana para ver el atributo sin tocarlo directamente
		public String getNombre() {
			return nombre;
		}


		// SET: metodo para MODIFICAR el valor de nombre desde afuera
		// aqui podrias agregar validaciones antes de cambiar el valor
		// ejemplo: no permitir nombres vacios
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		// GET: metodo para LEER el valor de edad desde afuera
		public int getEdad() {
			return edad;
		}


		// SET: metodo para MODIFICAR el valor de edad desde afuera
		// ejemplo de validacion: no permitir edades negativas
		public void setEdad(int edad) {
			if (edad >= 0) {
			this.edad = edad;
			}
		}

	
	
	
	
	
	

}

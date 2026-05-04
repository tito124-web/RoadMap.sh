package RoadMap.Modificador_de_Acceso;

public class Pesona1 {

	private String nombre;
    // private: solo esta clase puede acceder a nombre
    // si alguien de afuera intenta hacer persona.nombre = "Juan" le dara error

    public int edad;
    // public: cualquiera puede acceder y modificar edad directamente
    // no necesita get y set pero es buena practica usarlos

    protected String ciudad;
    // protected: solo las clases hijas y clases del mismo paquete pueden acceder
    // si una clase no tiene relacion con Persona no puede tocar ciudad

    String pais;
    // default: no tiene modificador, solo clases del mismo paquete pueden acceder
    // si una clase esta en otro paquete no puede ver pais

    
    // GET sirve para mostrar el valor y SET para ingrresar el valor

	    // GET y SET de nombre (private)
	    public String getNombre() {
	        return nombre;
	    }
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }


	    // GET y SET de edad (public)
	    // no necesita get y set porque es public
	    // pero se puede hacer igual
	    public int getEdad() {
	        return edad;
	    }
	    public void setEdad(int edad) {
	        this.edad = edad;
	    }


	    // GET y SET de ciudad (protected)
	    public String getCiudad() {
	        return ciudad;
	    }
	    public void setCiudad(String ciudad) {
	        this.ciudad = ciudad;
	    }


	    // GET y SET de pais (default)
	    public String getPais() {
	        return pais;
	    }
	    public void setPais(String pais) {
	        this.pais = pais;
	    }
	
	
}

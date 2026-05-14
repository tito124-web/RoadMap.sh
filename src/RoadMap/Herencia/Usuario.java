package RoadMap.Herencia;

public class Usuario extends Persona {
	
	private int num;

	public Usuario(String name, int age) {
		super(name, age);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Usuario [num=" + num + ", name=" + name + ", age=" + age + "]";
	}

	

	
	

	
	
	
}

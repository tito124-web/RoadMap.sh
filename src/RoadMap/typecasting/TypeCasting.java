package RoadMap.typecasting;

public class TypeCasting {

	
	
	 public  void intAString() {
	        int num = 10;
	        System.out.println("el numero es " + num);

	        String data = String.valueOf(num);
	        // String es el valor que le asignamos
	        // data es el nombre de la nueva variable que va a ser de tipo String
	        // y el num llamamos de la variable anterior y le asignamos su nuevo valor
	        System.out.println("el numero como String es " + data);
	    }


	    // conversion de String a int
	    public  void stringAInt() {
	        String num = "10";
	        System.out.println("el numero es " + num);

	        int data = Integer.parseInt(num);
	        // int es el valor que le asignamos
	        // data es el nombre de la nueva variable que va a ser de tipo int
	        // y el num llamamos de la variable anterior y le asignamos su nuevo valor
	        System.out.println("el numero como int es " + data);
	    }


	    // conversion de int a double
	    public  void intADouble() {
	        int num = 10;
	        System.out.println("el numero es " + num);

	        double data = (double) num;
	        // double es el valor que le asignamos
	        // data es el nombre de la nueva variable que va a ser de tipo double
	        // y el num llamamos de la variable anterior y le asignamos su nuevo valor
	        System.out.println("el numero como double es " + data);
	    }
}

package RoadMap.PasoporReferenciayporValor;

public class ReferenciayporValor {


    // Java copia el valor del numero y lo manda al metodo
    // lo que pase aqui adentro no afecta al original
    public void cambiarNumero(int numero) {
        numero = 99;
        System.out.println("Dentro del metodo: " + numero);
    }

    // Java tambien copia "por valor" pero lo que copia es la direccion del arreglo
    // como ambos (el main y el metodo) apuntan al mismo arreglo en memoria
    // si modificamos el contenido adentro, el original tambien cambia
    public void cambiarArreglo(int[] arreglo) {
        arreglo[0] = 99;
        System.out.println("Dentro del metodo: " + arreglo[0]);
    }


}

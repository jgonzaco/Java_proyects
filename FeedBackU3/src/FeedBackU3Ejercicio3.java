
import java.util.Arrays;

public class FeedBackU3Ejercicio3 {

    // Para hacer este ejercicio estuve buscando por internet, y finalmente he utilizado el metodo sort() de la clase Arrays para la ordenación alfabética de las palabras
    // que ponía el usuario. Si bien es cierto que para la ordenación de números puede lanzar ciertos fallos, para nuestro caso (ordenación de nombres), es perfecto. Para
    // el segundo caso, realice un algoritmo de ordenación en función de la longitud de las palabras. Imaginemos el ejemplo que viene a continuación, es decir, un array que
    // contiene: ["Zaragoza","madrid","Barcelona"]. Primero tenemos que poner un for para recorrer cada uno de los elementos que hay dentro del array, es decir, primero Zaragoza
    // después madrid y finalmente Barcelona. Teniendo claro para que sirve ese for, expliquemos el siguiente. El siguiente for empezará desde una posición más que el for
    // anterior. De manera que el anterior for empieza desde Zaragoza, y este por el contrario empieza desde madrid y llega hasta el final del array, es decir, hasta Barcelona.
    // Si nos fijamos, el valor del for con i toma una posición, en nuestro caso, la posición 0 que es la de Zaragoza. Por otro lado, el for con j toma una posición más adelantada,
    // la que ocupa madrid. Después de tener claro esto, vemos que el if compara la longitud de lo que hay en ciudades[i] y ciudades[j]. En nuestro caso la longitud de Zaragoza con
    // la de madrid. Como se cumple que la longitud de Zaragoza es mayor que la de madrid, entramos dentro del if. Dentro de este guardamos en una variable llamada cambio lo que hay
    // en la posicion i (Zaragoza). Posteriormente, metemos en la posición i lo que hay en la posición j, es decir, nos quedaría un array así: ["madrid","madrid","Barcelona"]. Por
    // último, metemos en la posición j lo que tenemos en la variable (Zaragoza), quedando: ["madrid","Zaragoza","Barcelona"]. Después de esto, seguimos en el bucle de la j, ya que
    // no hemos terminado, por lo que el bucle i no avanzará hasta que el bucle de la j no terminé. Lo anterior hace referencia a que i seguirá valiendo 0 y ciudades[0]= Zaragoza.
    // Por otro lado, el bucle interno, pasará a valer un valor más valiendo ahora Barcelona. Ahora se volverá a comparar longitud de Zaragoza > longitud de Barcelona. No se cumple,
    // así que no entra en el if y no cambia de posición. Ahora que ya hemos terminado el for interno, i se desplazaría uno a la derecha valiendo la primera posicion del array y hariamos
    // lo mismo hasta que finalizaran los bucles y el array se ordenaría.
    // A continuación se muestra un ejemplo.

    public static void main(String[] args) {
        String[] ciudades = {"Zaragoza", "madrid", "Barcelona"};
        // El array ordenado alfabeticamente es:
        Arrays.sort(ciudades);
        System.out.println("El array ordenado alfabéticamente es:");
        for (String s : ciudades) {
            System.out.print(s + " ");
        }
        // El array ordenado por longitud es:
        System.out.println();
        System.out.println("El array ordenado por longitud es:");
        for (int i = 0; i < ciudades.length - 1; i++) {
            for (int j = i + 1; j < ciudades.length; j++) {
                if (ciudades[i].length()>ciudades[j].length()) {
                    String cambio = ciudades[i];
                    ciudades[i] = ciudades[j];
                    ciudades[j] = cambio;
                }
            }
        }
        for (String s : ciudades) {
            System.out.print(s + " ");
        }
    }
}
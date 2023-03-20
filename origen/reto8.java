import java.util.Random;
import java.util.Scanner;
//crear clase
public class reto8 {
    //crear metodo
    public static void main(String[] args) {
        //declarar variables
        int numeroPrograma, numero, intentos = 1, cantidadDeIntentos = 0;
        //instanciar clases
        Scanner lectura = new Scanner(System.in);
        Random random = new Random();
        //generar número aleatorio entre 1 y 100
        numeroPrograma = random.nextInt(100) + 1;
        //solicitar datos
        System.out.println("¡Prepárate! Vas a adivinar un número entre 1 y 100");
        //pedir cantidad de intentos al usuario
        System.out.println("¿Cuántos intentos quieres tener? (puedes elegir entre 1 y 10)");
        //capturar datos
        cantidadDeIntentos = lectura.nextInt();
        //validacion de intentos
        if (cantidadDeIntentos < 1 || cantidadDeIntentos > 10) {
            System.out.println("No puedes jugar esa cantidad de veces");
            //limpiar buffer
            lectura.close();
            return;
        }
        //bucle de adivinanza
        while (intentos <= cantidadDeIntentos) {
            System.out.println("Intento " + intentos + ": ");
            numero = lectura.nextInt();
            if (numero == numeroPrograma) {
                System.out.println("¡Felicidades! Has adivinado el número");
                //limpiar buffer
                lectura.close();
                return;
            } else {
                System.out.println("Ese no era el número, inténtalo de nuevo.");
                intentos++;
            }
        }
        System.out.println("Has perdido, el número era: " + numeroPrograma);
        //limpiar buffer
        lectura.close();
    }
}

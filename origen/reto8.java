import java.util.Random;
import java.util.Scanner;
//crear clase
public class reto8 {
    //crear metodo
    public static void main(String[]args){
        //declarar variables
        int numeroPrograma;
        int numero;
        int intentos=1;
        int cantidadDeIntentos;
        //instanciar clases
        Scanner lectura=new Scanner(System.in);
        Random rand=new Random();
        numeroPrograma=rand.nextInt(100)+1;
        //solicitar datos
        System.out.println("Prparate vas a adivinar un numero de 1 al 100");
        System.out.println("¿Que cantidad de intentos te gustarian?(puedes elgir entre 1 a 10 intentos)");
        //capturar datos
        cantidadDeIntentos=lectura.nextInt();
        //crear condicion
        if (cantidadDeIntentos<0||cantidadDeIntentos>10) {
            System.out.println("No puedes jugar esa cantidad de veces");
            //limpiar buffer
            lectura.close();
            return;
        }
        //crear bucle
     while (intentos<=cantidadDeIntentos) {
        numero=lectura.nextInt();
        if (numero==numeroPrograma) {
            System.out.println("Has vencido al programa");
        }else{
            System.out.println("Tu eleccion fue correcta intentalo de nuevo, tienes_"+intentos+"_intentos");
            intentos=intentos+1;
        } 
    }
    System.out.println("Perdiste ese no era el numero, era este_"+numeroPrograma);
    //limpiar buffer
    lectura.close();
    }
}

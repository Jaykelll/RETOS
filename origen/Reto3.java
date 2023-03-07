import java.util.Random;
import java.util.Scanner;
//crear clase
public class Reto3 {
//crear metodo
    public static void main(String[] args){
//declarar clases
        int dinero;
        int cantidadApuesta;
        int resultado;
        int caraSello;
        String nombreJugador;
        //instanciar clases
        Scanner apuesta=new Scanner(System.in);
        Random variado=new Random();
//solicitar datos
        System.out.println("Hola, jugador, ingresa tu nombre");
        //capturar datos
        nombreJugador = apuesta.next();
        System.out.print("Ingresa tu cantidad de dinero actual");
        dinero=apuesta.nextInt();
            System.out.println("Tu cantidad de dinero actual es de_"+dinero);
            System.out.print("Elige cara (1) o sello (2) o elige (3 para salir)");
            caraSello=apuesta.nextInt();
//crear condicion
            if (caraSello==2) {
            }
            System.out.print("Ingresa cuanto dinero quieres apostar");
            cantidadApuesta = apuesta.nextInt();
            if (cantidadApuesta > dinero) {
            System.out.println("Ups parace que no te alcanza el dinero");
            }
            resultado = variado.nextInt(2);
            if (resultado == 0) {
            System.out.println("salio cara");
            } else {
            System.out.println("salio sello");
            }
            if (resultado==caraSello) {
            System.out.println("¡Felisidades ganaste!");
            dinero+=cantidadApuesta;
            } else {
            System.out.println("Lo lamento has perdido");
            dinero-=cantidadApuesta;
            }
            if (dinero<= 0) {
            System.out.println("Te quedaste sin dinero"); 
            }
        System.out.println("Muchas gracias por probar el programa_"+nombreJugador+"_tu cantidad de dinero es de_"+dinero);
        //limpiar buffer
        apuesta.close();
    }

}
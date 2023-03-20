import java.util.Random;
import java.util.Scanner;
//crear clase
public class Reto6 {
//crear metodo
public static void main(String[] args) {
    //declarar variables
    String nombre;
    int persona;
    int PC;
    int repeticiones=0;
    int cantidadDeJuegosJugados=0;
    int vidas=3;
    double suma1=0;
    double suma2=0;
    double valor=0;
    double dinero=0;
    double sumaTotal=0;
    //instanciar clases
    Scanner lectura=new Scanner(System.in);
    Random random=new Random();
    //solicitar datos
    System.out.println("Digite su nombre");
    //capturar datos
    nombre = lectura.next();
    System.out.println("Ingrese cuantas veces desea jugar(que no pase los 10 intentos)");
    repeticiones = lectura.nextInt();   
    //crear la condición
        if (repeticiones>10||repeticiones<0) {
            System.out.println("No puedes jugar esa cantidad de veces");
            lectura.close();
            return;
        }
        System.out.println("Ingrese su cantidad de dinero incial");
        dinero = lectura.nextDouble();
        System.out.println("Ingrese cuanto quiere apostar");
        valor = lectura.nextInt();
        //crear condicion
        while (vidas > 0 && cantidadDeJuegosJugados < repeticiones) {
        System.out.println("Ahora juguemos cara o sello");
        System.out.println("Elija uno");
        System.out.println("Cara(1)");
        System.out.println("Sello(2)");
        persona=lectura.nextInt();
        //crear condicion
        if (persona < 1 || persona > 2) {
            System.out.println("Esos valores no sirven solo usa 1 o 2");
             //limpiar buffer
       lectura.close();
            return;
        }
        PC = random.nextInt(2)+1;
        System.out.print("salio_");
        switch (PC) {
            case 0:
                System.out.println("Cara");
                break;
            case 1:
                System.out.println("Sello");
                break;
        }
        if (persona==PC) {
            System.out.println("Felicidades has ganado");
            suma1=valor*0.1;
            valor=valor+suma1;
            System.out.println("Ganaste"+valor+"_eso si es un buen dinero");
            dinero = dinero + valor;
            System.out.println("Quedaste con_"+dinero);
            cantidadDeJuegosJugados=cantidadDeJuegosJugados+1;
            System.out.println("Usted ha jugado_"+cantidadDeJuegosJugados);
            sumaTotal=sumaTotal+suma1;
        } else {            
            System.out.println("GAME OVER");
            suma2=valor*0.1;
            valor=valor-suma2;
            System.out.println("Lo hiciste bien_"+nombre+"_pero perdiste_"+suma2);
            vidas=vidas-1;
            dinero=dinero-valor;
            System.out.println("Has quedado con_"+dinero);
            System.out.println("Tienes_"+vidas+"_vidas");
            cantidadDeJuegosJugados=cantidadDeJuegosJugados+1;
            System.out.println("Jugaste_"+cantidadDeJuegosJugados);
            sumaTotal=sumaTotal-suma2;
        }
        }
            System.out.println("Gnaste__Perdiste"+sumaTotal);
            //limpiar el buffer
            lectura.close();
    }
}
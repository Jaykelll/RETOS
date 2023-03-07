import java.util.Random;
import java.util.Scanner;
//crear clase
public class Reto4 {
//crear metodo
public static void main(String[] args){
//declarar variables
    int costo;
    int apuesta;
    int puntos;
    int opcion;
    String Jugador;
//instanciar clases
    Scanner lectura=new Scanner(System.in);
    Random random=new Random();
//solicitar datos
    System.out.println("Hola, porfavor digita tu nombre");
    //capturar datos
    Jugador=lectura.nextLine();
    System.out.print("Ingresa cuanto el primer monto de dinero");
    costo=lectura.nextInt();
        System.out.println("Tu monto equivale a_"+costo);
        System.out.println("Ingrese su eleccion (0 piedra) (1 papel) (2 tijeras)");   
        opcion=lectura.nextInt();   
        //crear condicion      
        if (opcion==1) {
            System.out.println("Tu escogiste piedra");
        }else if(opcion==2){
            System.out.println("Tu escogite papel");
        }else{
            System.out.println("Tu escogiste tigeras");
        }
        System.out.print("Ingresa cuanto dinero quieres apostar");
        apuesta=lectura.nextInt();
        if (apuesta>costo) {
            System.out.println("Huy parece que no te alcanza la plata");
        }
        puntos=random.nextInt(3)+1;
        switch (puntos) {
case 1:
System.out.println("PC eligio piedra");
break;
case 2:
System.out.println("PC eligio papel");
break;
case 3:
System.out.println("PC eligio tigeras");
break;
default:
break;
}
    if ( puntos ==  opcion) {
          System.out.println("Empate!");
        } else if(opcion==1&&puntos==3||opcion==2&&puntos==1||opcion==3&&puntos==2){
            costo=costo+apuesta ;
            System.out.println("Ganaste felcidades!");
        }else{
            System.out.println("Triste perdiste");
            costo=costo-apuesta;
        }
        System.out.println("Hola_"+Jugador+"_Te quedan_"+costo);
        if (costo<=0) {
            System.out.println("Ya no tienes mas dinero");
        }
    lectura.close();
}

}
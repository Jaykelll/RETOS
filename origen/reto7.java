import java.util.Random;
import java.util.Scanner;
//crear clase
public class reto7 {
//crear  metodo
    public static void main(String[] args){
        //declarar variables
        String nombre;
        int persona; 
        int PC;
        int repeticiones=0;
        int jugados=0;
        int vidas=3;
        double suma1=0;
        double suma2=0;
        double valor=0;
        double dinero=0;
        double sumaTotal=0;
        //instanciar clases
        Scanner lectura=new Scanner(System.in);
        Random rand=new Random();
        //solicitar datos
        System.out.println("Digite su nombre");
        //capturar datos
        nombre = lectura.next();
        System.out.println("Ingrese cuantas veces desea jugar(que no pase los 10 intentos)");
        repeticiones = lectura.nextInt();
        //crear condicon    
        if (repeticiones > 10 || repeticiones < 0) {
            System.out.println("No puedes jugar esa cantidad de veces");
            lectura.close();
            return;
        }
        System.out.println("Ingrese su cantidad de dinero incial");
        dinero = lectura.nextDouble();
        System.out.println("Ingrese cuanto quiere apostar");
        valor = lectura.nextInt();
        //limpiar buffer
        lectura.close();
        //crear bucle
        while (vidas > 0 && jugados < repeticiones) {
        System.out.println("Ahora juguemos piedra, papel o tijeras");
        System.out.println("Elija uno");
        System.out.println("Piedra(1)");
        System.out.println("Papel(2)");
        System.out.println("Tijeras(3)");
        persona = lectura.nextInt();
        if (persona < 1 || persona > 3) {
            System.out.println("Esos valores no sirven solo usa 1 o 3");
            return;
        }
        PC = rand.nextInt(3) + 1;
        System.out.print("Sacaste");
        switch (PC) {
            case 1:
                System.out.println("Piedra");
                break;
            case 2:
                System.out.println("Papel");
                break;
            case 3:
                System.out.println("Tijeras");
                break;
        }
        if (persona == PC) {
            System.out.println("Has empatado");
            jugados = jugados + 1;
            System.out.println("Jugaste"+jugados);
        } else if(persona == 2 && PC == 3 || persona == 1 && PC == 2 || persona == 3 && PC == 2){            
            System.out.println("Has vencido al programa");
            suma2 = valor * 0.3;
            valor = valor + suma1;
            jugados = jugados + 1;
            dinero = dinero + valor;
            System.out.println("Gracias por usar el programa_"+nombre+"_usted tuvo un saldo de_"+dinero+"_Has ganado_"+suma1+"_lo conseguiste en_"+jugados);
            sumaTotal = valor + suma1;
        }else{
            System.out.println("Te gano el programa");
            suma2 = valor * 0.3;
            valor = valor - suma2;
            System.out.println("Gracias por usar el programa_"+nombre+"_usted tuvo un saldo de_"+dinero+"_Has perdido_"+suma2+"_lo conseguiste en_"+jugados);
            vidas = vidas - 1;
            System.out.println("Tienes_"+vidas+"vidas");
            sumaTotal=valor-suma2;
        }
        }
            System.out.println("Ganaste"+sumaTotal);
            //limpiar buffer
            lectura.close();
        }
        
    }
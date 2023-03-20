import java.util.Scanner;
//crear clase
public class Reto2 {
    //crear metodo
    public static void main(String[] args){
      //asignar variables
        double pesoBebe;
        double mesesBebe;
        double Vacuna;
        String nombreRepresentante;
        String nombreEnfermera;
      //instanciar clases
        Scanner lectura=new Scanner(System.in);
        //solicitar datos
        System.out.println("Digite el nombre de representante del menor");
        //capturar datos
        nombreRepresentante = lectura.nextLine();
        System.out.println("Digite nombre de la enfermera");
        nombreEnfermera = lectura.next();
        System.out.println("Digite cuanto pesa el bebe");
        pesoBebe = lectura.nextFloat();
        System.out.println("Digite la cantidad de meses del bebe");
        mesesBebe = lectura.nextDouble();
        Vacuna = ((pesoBebe + 10)/(mesesBebe * 10)) * 8;
        System.out.println("El bebe tiene_"+mesesBebe+"_meses");
        System.out.println("El bebe tiene un peso de_" + pesoBebe+"_kilos");
        System.out.println("El representante legal del bebe es_"+nombreRepresentante);
        System.out.println("La enfermera encarada de vacunar al bebe es_"+nombreEnfermera);
        System.out.println("La dosis del es de_"+Vacuna+"miligramos");
        //limpiar buffer
        lectura.close();
    }
}

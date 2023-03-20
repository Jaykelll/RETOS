import java.util.Scanner;
//crear clase
public class Reto1 {
    //crear metodo
    public static void main(String[] args){
//declarar variables
        double temperaturaFarenheit=0;
        double temperaturaCentigrados=0;
        double temperaturaKelvin=0;
//instanciar clases
        Scanner lectura=new Scanner(System.in);
    //solicitar datos
        System.out.print("Digite la temperatura para precalentar el horno en grados fahrenheit");
        //capturar datos
        temperaturaFarenheit=lectura.nextDouble();
        temperaturaCentigrados =(temperaturaFarenheit-32)/1.8;
        temperaturaKelvin=(temperaturaFarenheit+459.67)*5/9;
        System.out.println(temperaturaFarenheit+"_los grados fahrenheit son igual a_"+temperaturaCentigrados+"_grados centigrados");
        System.out.println("los grados fahrenheit son iguales a_"+temperaturaKelvin+"_grados kelvin");
        //limpiar buffer
        lectura.close();
}
}
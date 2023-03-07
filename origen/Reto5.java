import java.util.Scanner;
//crear clase
public class Reto5 {
    //crear metodo
    public static void main(String[] args){
//declarar variables
        int numeroProducto;
        int procuctoRegreso= 0;
        int precioProducto; 
        double costoDeLaCompra= 0;
        String producto;
       //instanciar clase
        Scanner lectura=new Scanner(System.in);
//solicitar datos
        System.out.println("Digite cauntos productos va a comprar");
        //capturar datos
        numeroProducto=lectura.nextInt();
//crear bucle
        while(procuctoRegreso<numeroProducto){
        System.out.println("Ingrese el nombre del producto");
        producto=lectura.next();
        System.out.println("El productos es_"+producto);
            System.out.println("Digite el costo del producto");
            precioProducto=lectura.nextInt();
            costoDeLaCompra=precioProducto+costoDeLaCompra;
            costoDeLaCompra=costoDeLaCompra*0.19;
            procuctoRegreso=procuctoRegreso+1;
        }
        System.out.println("Su compra suma un total de_"+costoDeLaCompra);
        //limpiar buffer
        lectura.close();
    }
}


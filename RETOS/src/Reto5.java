import java.util.Scanner;

public class Reto5 {

    public static void main(String[] args) {
        //declarar variables
        int  i,n,suma=0;
        double subtotal=0,total1,total2,iva=0.19,precio;
        String nomEmpleado,nomCliente,producto;
        int docuCliente;

        //instanciar clase
        Scanner lectura=new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado que esta atendiendo: ");
        nomEmpleado=lectura.nextLine();

        System.out.println("Ingrese el nombre del cliente");
        nomCliente=lectura.nextLine();

        System.out.println("Ingrese el documento del cliente ");
        docuCliente=lectura.nextInt();

        System.out.println("Cuantas productos desea digitar");
        n=lectura.nextInt();



        //crear el bucle

       
        for(i=1;i<=n;i++){
            System.out.println("Digite el producto "+i);
            producto=lectura.next();
            System.out.println("Digite el precio del producto: " );
            precio=lectura.nextDouble();

            suma=(int) (suma+precio);

            System.out.println("Su producto número "+i+" es: " +producto +" y vele "+ precio + " pesos");

        }
        

        System.out.println();
        System.out.println("El empleado que atendio su compra es: " +nomEmpleado);
        System.out.println();
        System.out.println("Cliente " +nomCliente);
        System.out.println();
        System.out.println("con numero de documento : " +docuCliente);
        System.out.println();

        subtotal=suma;

        System.out.println("Lleva "+n+ "  productos");
        System.out.println(); 
        System.out.println("El subtotal de su compra es "+subtotal);

        total1=subtotal*iva;

        total2=total1+subtotal;

        System.out.println("El total de su compra es: " +total2);
        System.out.println();
        System.out.println("¡¡Gracias por comprar!!");
        
        lectura.close();

    }
}

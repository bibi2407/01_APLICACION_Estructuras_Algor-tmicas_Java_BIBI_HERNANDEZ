import java.util.Scanner;

public class Reto1 {

    public static void main(String []args) {

        //Declarar variables

        double gradosF,gradosC,gradosK;

        //Instamciamos la clase scanner

        Scanner lectura=new Scanner(System.in);

        //Solicita datos

        System.out.println("Por favor digite los grados fahrenheit: ");
        
        gradosF=lectura.nextDouble();

        //haciendo operaciones

        gradosC=(gradosF-32)/1.8;

        gradosK=((gradosF-32)/1.8)+ 273.15;

        //imprimiendo resultados

        System.out.println("Grados centigrados " + gradosC+ " Grados fahrenheit " + gradosF + " Grados Kelvin " +gradosK );
        
        //limpiar el buffer

        lectura.close();
    }
    
}
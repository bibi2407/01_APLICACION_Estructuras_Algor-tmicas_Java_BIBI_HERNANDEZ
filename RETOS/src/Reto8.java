import java.util.Scanner;

public class Reto8{

public static void main(String[] args){
    
    Scanner lectura = new Scanner(System.in);
    
    int numero=0;
    int intento = 10;
    int intento2 = 0;
    

    System.out.println("Ingrese un numero aleatorio: ");
    numero = lectura.nextInt();

    int numeroSecreto = (int) (Math.random()+100)+1;
    

    if(numero == numeroSecreto){
        System.out.println("Felicidades, el numero secreto es " + numeroSecreto +",acabas de adivinar el numero luego de " + (intento2 + 1)+ " intentos.");
        
    } 
    else if(numero<numeroSecreto){

        System.out.println("El numero que usted digito es menor al numero secreto");

        intento--;

        System.out.println("Le quedan "+intento+ " intentos");

        intento2 = intento2 + 1;
    }
    else if(numero > numeroSecreto){

        System.out.println("El numero que digitado es mayor al numero secreto");

        intento--;

        System.out.println("Te quedan "+intento+ " intentos");

        intento2 = intento2 + 1;

    }


    if(intento == 0) {
          
        System.out.println("Se ha quedado sin intentos");
        System.out.println("¡¡GRACIAS POR JUGAR!!");

            lectura.close();
        

            }
        }

    }

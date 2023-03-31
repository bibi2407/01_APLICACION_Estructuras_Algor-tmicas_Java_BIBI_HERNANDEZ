import java.util.Scanner;

public class Reto6 {
  
    public static void main(String[]args) {

        int numJugador;
        int dado;
        int apuesta=0;
        int minMaquina=1000;
        int cantidadVeces;
        int perdio=1;
        int vida=3,i;
        String nombre;

        Scanner lectura=new Scanner(System.in);

        System.out.println();
        System.out.println("Bienvenido al juego de carisellazo");
        System.out.println();
        System.out.println("Por favor digite su nombre");
        System.out.println();
        nombre=lectura.nextLine();
        System.out.println();
        System.out.println("Si desea escojer cara digite 1 pero si desea escojer sello digite 2");
        numJugador=lectura.nextInt();
        System.out.println();
        System.out.println("Por favor digite cuanto va a apostar: ");
        apuesta=lectura.nextInt();
        System.out.println("La moneda cayo y  ");
        System.out.println();
        dado=(int) (Math.random()*2)+1;

        cantidadVeces=(vida-perdio);

    
        for(i=1;i<=cantidadVeces;i++){
            System.out.println("Usted tiene "+vida + " vidas" );

        if(dado==1 && numJugador==1){
            System.out.println("La maquina saco "+dado + " y "  +nombre + " saco " +numJugador +  " Salio cara han empatado y tu valor final es: " + apuesta +"  le quedan " + (cantidadVeces=(vida)) + " vidas");
        }
        else if(dado==2 && numJugador==2){
            System.out.println("La maquina saco "+dado + " y "  +nombre + " saco " +numJugador + " Salio sello has empatado y tu valor final es: " + apuesta+" le quedan "  + (cantidadVeces=(vida)) + " vidas");
        }
        else if(dado==1 && numJugador==2){
            System.out.println("La maquina saco "+dado + " y "  +nombre + " saco " +numJugador + " Salio cara has perdido tu valor final es: " + (minMaquina-apuesta) +" Le quedan " + (cantidadVeces=(vida-perdio)) + " vidas" );
        }
        else if(dado==2 && numJugador==1){
            System.out.println("La maquina saco "+dado + " y "  +nombre + " saco " +numJugador +" Salio sello has perdido tu valor final es: " + (minMaquina-apuesta) +" Le quedan " + (cantidadVeces=(vida-perdio)) + " vidas");
        
        }
    }
        
        System.out.println();
        System.out.println("¡¡Gracias por jugar!!");
        System.out.println();
        

    lectura.close();
    
    }
}


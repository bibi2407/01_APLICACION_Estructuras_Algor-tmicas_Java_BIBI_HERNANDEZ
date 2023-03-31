import java.util.Scanner;


public class Reto7 {
     
    public static void main(String[]args) {

        Scanner lectura=new Scanner(System.in);

        int numJugador;
        int numMaquina;
        int cantidadVeces;
        int perdio=1;
        int vida=3,i;

        System.out.println();
        System.out.println("Bienvenido al juego piedra, papel o tijera");
        System.out.println();
        System.out.println("si desea tirar piedra elija 1 ");
        System.out.println("Si desea tirar papel elija 2 ");
        System.out.println("Si desea tirar tijera elija 3 ");
        System.out.println();
        numJugador=lectura.nextInt();
        

        
        cantidadVeces=(vida-perdio);
    
        for(i=1;i<=cantidadVeces;i++){
            System.out.println("Usted tiene "+vida + " vidas" );

            System.out.println("La maquina eligio");
        numMaquina=(int) (Math.random()*3)+1;

        if(numMaquina==1 && numJugador==1){
            System.out.println("Salio piedra han empatado");
        }
        else if(numMaquina==2 && numJugador==2){
            System.out.println("Salio papel han empatado");
        }
        else if(numMaquina==3 && numJugador==3){
            System.out.println("Salio tijera han empatado");
        }
        else if(numMaquina==1 && numJugador==2){
            System.out.println("Salio piedra ha ganado el jugador");
        }
        else if(numMaquina==1 && numJugador==3){
            System.out.println("Salio piedra ha perdido el jugador gano la maquina");
        }
        else if(numMaquina==2 && numJugador==1){
            System.out.println("Salio papel ha perdido el jugador gano la maquina");
        }
        else if(numMaquina==2 && numJugador==3){
            System.out.println("Salio papel ha ganado el jugador ");
        }
        else if(numMaquina==3 && numJugador==1){
            System.out.println("Salio piedra ha ganado el jugador");
        }
        else if(numMaquina==3 && numJugador==2){
            System.out.println("Salio piedra ha perdido el jugador gano la maquina");
        }

        }

        System.out.println("¡¡Gracias por jugar!!");

        lectura.close();
    }
}
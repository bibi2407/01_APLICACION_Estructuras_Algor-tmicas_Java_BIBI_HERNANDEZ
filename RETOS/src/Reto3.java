import java.util.Scanner;

public class Reto3 {
  
    public static void main(String[]args) {

        int numJugador;
        int dado;
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
        System.out.println("La moneda cayo y  ");
        System.out.println();
        dado=(int) (Math.random()*2)+1;

        if(dado==1 && numJugador==1){
            System.out.println("La maquina saco "+dado + " y "  +nombre + " saco " +numJugador +  " salio cara han empatado ");
        }
        else if(dado==2 && numJugador==2){
            System.out.println("La maquina saco "+dado + " y "  +nombre + " saco " +numJugador + " salio sello has ganado  "  );
        }
        else if(dado==1 && numJugador==2){
            System.out.println("La maquina saco "+dado + " y "  +nombre + " saco " +numJugador + " salio cara ha perdido " );
        }
        else if(dado==2 && numJugador==1){
            System.out.println("La maquina saco "+dado + " y "  +nombre + " saco " +numJugador +" salio sello ha perdido  ");
        
        }
        
        System.out.println();
        System.out.println("¡¡Gracias por jugar!!");
        System.out.println();
        

    lectura.close();
    }
}

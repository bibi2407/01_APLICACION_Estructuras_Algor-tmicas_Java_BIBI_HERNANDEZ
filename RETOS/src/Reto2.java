import java.util.Scanner;

public class Reto2 {
    
    public static void main(String[]args) {

        Scanner lectura=new Scanner(System.in);

        String nombreBebe , nombreEnfermera;
        double pesoBebe, vacuna;
        int mesBebe;

        System.out.println("Nombre de la enfermera a cargo: ");
        nombreEnfermera=lectura.nextLine();

        System.out.println("Nombre del bebe a vacunar: ");
        nombreBebe=lectura.nextLine();

        System.out.println("Peso del bebe: ");
        pesoBebe=lectura.nextDouble();

        System.out.println("Meses del bebe: ");
        mesBebe=lectura.nextInt();

        vacuna=((pesoBebe+10)/(mesBebe*10)*8);

        System.out.println("El nombre de la enfermera a cargo es: " +nombreEnfermera+ " el bebe " +nombreBebe+ " necesita una dosis de: "+ vacuna);

        lectura.close();

        
    }
}

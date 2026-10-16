import java.util.Scanner;

public class dron {
    static void main() {
        Scanner tecla = new Scanner(System.in);
        final int limite=100;
        final int minimo=0;
        int bateria,minutos=1;
        System.out.println("Un dron inicia con cierto porcentaje de batería.\n" +
                           "Cada minuto de vuelo consume 7%.");
        System.out.print("Con cuanta pila inica:  ");
        bateria= tecla.nextInt();
        if(bateria<=minimo|| bateria>limite){
            System.out.print("pila no aceptada");
            System.exit(0);
        }

        System.out.println("---------------");
        System.out.println("Bateria inical: "+bateria+"%");
        while(bateria>=7){
            bateria=bateria-7;
            System.out.println("Minuto "+minutos+" -> "+bateria+"%");
            minutos++;
        }

    }
}

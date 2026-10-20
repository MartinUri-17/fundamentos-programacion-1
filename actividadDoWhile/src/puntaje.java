import java.util.Scanner;

public class puntaje {
    static void main() {
        Scanner tacle= new Scanner(System.in);
        final int PUNTAJE_INICIAL=100;
        int opc;
        int puntaje=PUNTAJE_INICIAL;
        do {
            System.out.print("Menu de opciones");
            System.out.println("\n" +
                                "1. Ganar 20 puntos\n" +
                                "2. Gastar 15 puntos\n" +
                                "3. Consultar puntos\n" +
                                 "4. Salir");
            opc=tacle.nextInt();
            switch (opc){
                case 1:
                    System.out.println("En hora buena +20 puntos");
                    puntaje=puntaje+20;
                   break;
                case 2:
                    if (puntaje>=15) {
                        System.out.println("Has consumido 15 puntos");
                        puntaje = puntaje - 15;
                    }
                    else{
                        System.out.println("No tienes los puntos suficientes");
                    }
                    break;
                case 3:
                    System.out.println("Tu puntaje actual es");
                    System.out.println(puntaje+" puntos");
                    break;
                case 4:
                    System.out.println("Has terminado");
                    break;
                default:
                    System.out.println("opcion no disponible");
            }

        }while(opc!=4);
        System.out.println("Puntaje funal");
        System.out.println(puntaje+" puntos");
    }
}

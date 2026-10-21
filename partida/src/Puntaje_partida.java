import java.text.DecimalFormat;
import java.util.Scanner;

public class Puntaje_partida {
    static void main() {
        Scanner tecla=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.##");
        int contador=0;
        int mayorDe1000=0;
        int menorDe1000=0;
        int puntaje;
        double promedioPuntaje;
        System.out.println("Checador de puntajde de partidas de Mario kart");
        for (int i = 1; i <=7; i++) {
            System.out.println("Partida numero "+i);
            System.out.println("Cual fue tu puntaje");
            puntaje= tecla.nextInt();
            contador=contador+puntaje;
            if (puntaje>=1000)
                mayorDe1000++;
            else
                menorDe1000++;
            System.out.println("--------------------");
        }
        promedioPuntaje=(double)contador/7;
        System.out.println("Puntos acumulados.       "+contador);
        System.out.println("Promedio de puntuación.  "+df.format(promedioPuntaje));
        System.out.println("Partidas con más de 1000 puntos.   "+mayorDe1000);
        System.out.println("Partidas con 1000 puntos o menos.  "+menorDe1000);

    }
}

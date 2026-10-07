import java.util.Scanner;

public class clasificadorDeClima {
    static void main() {
        //martin uriel Lagunas Rodriguez
        //trabajo para saber el clima
        //06/10/2026
        Scanner tcla=new Scanner(System.in);
        int grados;
        System.out.println("Ingrese los grados Centigrados: ");
        grados= tcla.nextInt();;
        if(grados>30)
            System.out.println("Calor extremo");
        else if (grados>=21)
            System.out.println("Clima agradable");
        else if (grados>=10)
            System.out.println("Clima Fresco");
        else
            System.out.println("Frio extremo");

    }
}

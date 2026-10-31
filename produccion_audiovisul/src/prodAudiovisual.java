import java.util.Scanner;

public class prodAudiovisual {
    static void main() {
        Scanner t =new Scanner(System.in);
        double tarifa, horas;
        System.out.println("Renta de camaras");
        System.out.println("¿Cual es la tarifa?");
        tarifa= t.nextDouble();
        if(tarifa<=0){
            System.out.println("La tarifa no puede ser negativa");
            System.exit(0);
        }
        System.out.println("¿Por cuantas horas la renta?");
        horas= t.nextDouble();
        if(horas<=0){
            System.out.println("Las horas deben ser mayor a 0");
            System.exit(0);
        }
        mostarComprovante(calcularRenta(tarifa,horas));

    }
    public static  double calcularRenta(double trifa, double horas){
        double renta= trifa*horas;
        return renta;
    }
    public static  void  mostarComprovante(double renta){
        System.out.println("El total de la renta es de $"+renta);
    }
}

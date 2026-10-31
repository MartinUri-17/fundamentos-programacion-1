import java.util.Scanner;

public class descarga {
    static void main() {
        Scanner tecal=new Scanner(System.in);
        double tamano, velocidad;
        System.out.println("Calcula el tiempo para descargar tu archivo");
        System.out.println("Ingrese el tamaño del archivo:   ");
        tamano= tecal.nextDouble();
        if(tamano<=0){
            System.out.println("El tamaño no puede ser negativo");
            System.exit(0);
        }
        System.out.println("A que valocidad es la descarga;");
        velocidad= tecal.nextDouble();
        if (velocidad<=0) {
            System.out.println("la velocidad no puede ser negativa");
        }else{
            double tiempo= calcularTiempo(tamano, velocidad);
            System.out.println("El tiempo de descarga es de "+tiempo+" segundos");
        }

    }
    public static double calcularTiempo(double tamano,double velocidad ){
        double tiempo=tamano/velocidad;
        return tiempo;
    }

}

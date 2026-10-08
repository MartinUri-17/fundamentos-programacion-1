import java.util.Scanner;

public class rentaBici {
    static void main() {
        //MARTIN URIEL LAGUNAS RODRIGUEZ
        //RENTA DE BICICLETAS
        //07/10/2026

        Scanner tecla = new Scanner(System.in);
        final int BICI_URBANA =40;
        final int BICI_MONTAÑA=60;
        final int BICI_ELECTRICA=90;
        int subTotal=0;
        double descuento =0.20;
        double total = 0;
        int hora, opcion, mensu, tarifa=0;
        boolean membrecia=false;

        System.out.println("Bienvenido usuario estas son las opcciones de biciletas disponibles");
        System.out.println("1. Bicicleta urbana: $40 por hora\n" +
                           "2. Bicicleta de montaña: $60 por hora\n" +
                           "3. Bicicleta eléctrica: $90 por hora");
        System.out.println(" ¿Cual rentaras?");
        opcion= tecla.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Bicicleta urbana");
                tarifa=BICI_URBANA;
                break;
            case 2:
                System.out.println("Bicicleta de montaña");
                tarifa=BICI_MONTAÑA;
                break;
            case 3:
                System.out.println("Bicicleta eléctrica");
                tarifa=BICI_ELECTRICA;
                break;
            default:
                System.out.println("Opción no válida");
                System.exit(0);
        }

        System.out.println("¿Por cuanto tiempo?");
        hora= tecla.nextInt();
        if (hora>0){
            System.out.println("¿Tienes mensualdad activa? 1=si 0=no");
            mensu= tecla.nextInt();
            if (mensu == 1) {
                membrecia = true;
            } else if (mensu == 0) {
                membrecia = false;
            } else {
                System.out.println("No se encontró la opción");
                System.exit(0);
            }
            subTotal=tarifa*hora;
            if(subTotal>0){
                if (membrecia){
                    System.out.println("Tienes el 20% de descuento ");
                    descuento=subTotal*descuento;
                    total=subTotal-descuento;
                    System.out.println("Subtotal: $"+subTotal);
                    System.out.println("Descuento: $"+ descuento);
                    System.out.println("Total a pagar: $"+total);
                }
                else{
                    System.out.println("No tienes descuento");
                    total=subTotal;
                    System.out.println("Subtotal: $"+subTotal);
                    System.out.println("Descuento: No aplica");
                    System.out.println("Total a pagar: $"+total);
                }
            }
        } else if(hora==0) {
                 System.out.println("No puedes rentar 0 horas");
        }else {
            System.out.println("las horas no pueden ser negativas");
            System.exit(0);
        }
    }
}

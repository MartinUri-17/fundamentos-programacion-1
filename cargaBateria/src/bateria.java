import java.util.Scanner;

public class bateria {
    static void main() {
        final int MINIMO=0;
        final int MAXIMO=100;
        Scanner t=new Scanner(System.in);
        int bateriaInicial,opc, minutos;
        do {
            System.out.println("Opcion a relizar 1=calcular 2=salir");
            opc= t.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Bateria con la que inicas");
                    bateriaInicial=t.nextInt();
                    while(bateriaInicial< MINIMO || bateriaInicial>100){
                        System.out.println("Porcentaje invalido");
                        System.out.println("Bateria con la que inicas");
                        bateriaInicial=t.nextInt();

                    }
                    minutos=calcularMinutos(bateriaInicial);
                    System.out.println("los minutos para completar a 100 son "+minutos);
                    break;
                case 2:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("opcion no encontrada");
            }
            System.out.println("------------------------");
        }while (opc!=2);
    }

    public static int calcularMinutos(int bateriaInicial){
        int minutos=0;
        while (bateriaInicial<100){
            bateriaInicial+=8;
            minutos++;
        }
        return minutos;
    }
}

import java.util.Scanner;

public class elevador {
    static void main() {
        Scanner tecla=new Scanner(System.in);
        final int limite=10;
        int inicio,destino;
        System.out.println("Este elevvador solo va del piso 1 al 10");
        System.out.print("En que piso te encuentras: ");
        inicio= tecla.nextInt();
        if (inicio<=0) {
            System.out.println("piso no existente");
            System.exit(0);
        }else if (inicio>limite){
            System.out.println("piso no existente");
        } else {
            System.out.print("A que piso te dirijes: ");
            destino= tecla.nextInt();
            if (destino==inicio){
                System.out.println("Estas en ese piso");
            } else if (destino==0) {
                System.out.println("no puedes ir al piso 0");
                System.exit(0);
            }else if (destino>limite){
                System.out.println("piso no existente");
                System.exit(0);
            }
            if(inicio<destino){
                System.out.println("Pisos que pasas");
                while(inicio<destino){
                    inicio+=1;
                    System.out.println(inicio);
                }
                System.out.println("Has llegado");
            }
            if(inicio>destino) {
                System.out.println("Pisos que pasas");
                while(inicio>destino){
                    inicio--;
                    System.out.println(inicio);
                }
                System.out.println("Has llegado");
            }

        }
    }
}

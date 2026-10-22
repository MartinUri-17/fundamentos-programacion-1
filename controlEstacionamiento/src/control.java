import java.text.DecimalFormat;
import java.util.Scanner;

public class control {
    static void main() {
        Scanner tecla=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.##");
        final int HORA=15;
        final int DESCUETNO=10;
        int horas, pago, contaCarros, dinero,cantiDescueto;
        double promedio;
        contaCarros=0;
        dinero=0;
        cantiDescueto=0;

        do {
            System.out.println("Control de estacionamiento");
            System.out.println("Cuantas horas estubo este carro");
            horas= tecla.nextInt();;
            if (horas<0){
                System.out.println("no se permiten oras negativas");
                System.exit(0);
            }
            if (horas<=5)
                pago=horas*HORA;
            else {
                pago = horas * HORA - DESCUETNO;
                cantiDescueto++;
            }
            System.out.println("Total a pagar de este carro  $"+pago);
            System.out.println("---------------------------");
            dinero=dinero+pago;
            if (horas!=0)
                contaCarros++;

        }while (horas>0);



        promedio=(double)dinero/contaCarros;
        System.out.println("Resumen del dia");
        System.out.println("Total de automóviles atendidos:  "+contaCarros);
        System.out.println("Total de dinero recaudado:       "+dinero);
        System.out.println("Cantidad de automóviles que recibieron descuento:    "+cantiDescueto);
        System.out.println("Promedio pagado por automóvil."+df.format(promedio));




    }
}


import java.util.Scanner;

public class paqueteria {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        //Examen practico de la unidad 2
        //Martin Uriel Lagunas  Rodriguez
        //1-B DSM
        String tipo="";
        boolean acep=true;
        int  peso, opc, frajil;
        int total_final=0;
        int subtotal=0;
        int cont_rechazado=0;
        int cont_frajil=0;
        int cont_acep=0;


        System.out.println("ingresa el peso del paquete");
        peso= t.nextInt();

        do{

            while (peso<0 || peso>100){
                System.out.println("Peso invalido ingresa correctamente");
                peso= t.nextInt();
            }


            do {
                System.out.println("tu pedido es 1:Local 2:Nacional 3:Expres");
                opc = t.nextInt();
                switch (opc) {
                    case 1:
                        if (peso > 12) {
                            System.out.println("Paquete rechazado");
                            cont_rechazado++;
                            acep=false;
                        } else {
                            subtotal = 30 + 8 * peso;
                            tipo="Local";
                            cont_acep++;

                        }

                        break;
                    case 2:
                        if (peso > 20) {
                            System.out.println("Paquete rechazado");
                            cont_rechazado++;
                            acep=false;
                        } else {
                            subtotal = 50 + 12 * peso;
                            tipo="Nacional";
                            cont_acep++;

                        }
                        break;
                    case 3:
                        if (peso > 5) {
                            System.out.println("Paquete rechazado");
                            cont_rechazado++;
                            acep=false;
                        } else {
                            subtotal = 80 + 20 * peso;
                            tipo="Expres";
                            cont_acep++;

                        }
                        break;

                    default:
                        System.out.println("opcion no valida ingresa una correcta");

                }
                do {
                    System.out.println("Tu paquete es frajil? 1 si, 2 no");
                    frajil = t.nextInt();
                    if (frajil==1){
                        if(acep) {
                            subtotal = subtotal + 25;
                            cont_frajil++;
                        }else
                            subtotal=0;
                    }

                }while (frajil<=0||frajil>2);
                total_final=total_final+subtotal;
                System.out.println("------------------------------------------");
                System.out.println("Resumen del paquete");
                if (cont_rechazado<=0){
                    System.out.println("Tipo de envio "+tipo);
                    System.out.println("Peso: "+ peso+"KG");
                    System.out.println("Total a pagar por este paquete: $"+subtotal);
                    System.out.println("------------------------------------------");

                }else {
                    System.out.println("No hay resumen por quete rechazado");
                }
                System.out.println("------------------------------------------");
                System.out.println("------------------------------------------");
                System.out.println("ingresa el peso del paquete");
                peso= t.nextInt();
            }while (opc<0 || opc>4);
        }while (peso!=0);

        System.out.println("Resumen:");
        System.out.println("Total de Aceptados "+cont_acep);
        System.out.println("Total de rechazadois "+cont_rechazado);
        System.out.println("Total de frajilez "+cont_frajil);
        System.out.println("Dinero recaudado: $"+ total_final);




    }
}

import java.util.Scanner;

public class App {

    static void main() {

        int[] calificaciones= captura_calif();
        mostar_calif(calificaciones);
        int apro=mostrar_aprovados(calificaciones);
        int repro=mostrar_reprobados(calificaciones);

        System.out.println("------------");
        System.out.println("Alumnos aprobados "+ apro);
        System.out.println("Alumnos reprobados "+ repro);

    }

    public static int[] captura_calif() {
        Scanner tcla=new Scanner(System.in);
        int[] calificaciones;
        calificaciones= new int[10];
        int nota;
        System.out.println("Captura de calificaciones");
        for (int i=0; i<calificaciones.length; i++) {
            System.out.println("Ingresa la calificacion del alumno "+(i+1));
            nota= tcla.nextInt();
            while (nota<0||nota>100){
                System.out.println("Calificacion invalidad");
                System.out.println("Ingresa de nuevo");
                nota=tcla.nextInt();
            }
            calificaciones[i]=nota;
        }
        return calificaciones;
    }
    public static  void mostar_calif(int[] calificaciones){
        System.out.println("-------------------------");
        System.out.println("Captura de calificaciones  ");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Alumno "+(i+1)+" :"+calificaciones[i]);
        }

    }
    public static int mostrar_aprovados(int[] calificaciones){
        int aprovados=0;
        for (int i = 0; i <calificaciones.length ; i++) {
            if(calificaciones[i]>= 70){
                aprovados++;
            }
        }
        return aprovados;
    }
    public static int mostrar_reprobados(int[] calificaciones){
        int reprobados=0;
        for (int i = 0; i <calificaciones.length ; i++) {
            if(calificaciones[i]< 70){
                reprobados++;
            }
        }
        return reprobados;
    }
}

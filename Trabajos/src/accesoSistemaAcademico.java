import java.util.Scanner;

public class accesoSistemaAcademico {
    static void main() {

        //martin uriel Lagunas Rodriguez
        //acceso a un sistema academico para saber si pasas o reprubas por algo
        //06/10/2026
        Scanner tcla=new Scanner(System.in);
        final double aprobado=7.0;
        final int asistenciaMinima=80;
        int asistencia;
        double calificacion;
        System.out.println("Recuerda que para pasar nececitas 7.0 como ninimo y 80% de asistencia suerte!!!!!!");
        System.out.print("Ingrese su asistencia   ");
        asistencia= tcla.nextInt();
        if (asistencia<asistenciaMinima)
            System.out.print(" Reprobado por faltas ");
        else {
            System.out.print(" Ingrese su calificacion   ");
            calificacion = tcla.nextDouble();
            if (calificacion < aprobado)
                System.out.print("Reprobado por calificacion ");
            else
                System.out.print("Aprobado regular");
        }
    }
}

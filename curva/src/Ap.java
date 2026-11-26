public class Ap {
    public static void main(String[] args) {
        int[] calificaciones = {55, 68, 72, 90, 61, 98, 45, 77, 83, 59};

        mostrar(calificaciones);
        puntos_extra(calificaciones);
        Nuevas(calificaciones);
        contador(calificaciones);
    }
    public static void mostrar(int[] calificaciones) {
        System.out.println("Calificaciones originales:");

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + calificaciones[i]);
        }
    }
    public static void puntos_extra(int[] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = calificaciones[i] + 5;

            if (calificaciones[i] > 100) {
                calificaciones[i] = 100;
            }
        }
    }
    public static void Nuevas(int[] calificaciones) {
        System.out.println("Calificaciones con curva:");

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + calificaciones[i]);
        }
    }
    public static void contador(int[] calificaciones) {
        int aprobados = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] >= 70) {
                aprobados++;
            }
        }

        System.out.println("Alumnos aprobados después de la curva: " + aprobados);
    }
}
public class app {
    static void main() {
        int[] numeros = {5, 12, 7, 20, 33, 8, 15, 27, 40, 3};
        System.out.print("Original: ");
        mostar(numeros);

        invertir(numeros);

        System.out.print("Invertido: ");
        mostar(numeros);

        int pos20 = buscarNumero(numeros, 20);
        resul(20, pos20);

        // Búsqueda del número 99
        int pos99 = buscarNumero(numeros, 99);
        resul(99, pos99);

    }
    public static void mostar(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ,");
        }
        System.out.println();
    }
    public static void invertir(int[] numeros) {
        int inicio = 0;
        int fin = numeros.length - 1;
        while (inicio < fin) {
            int temporal = numeros[inicio];
            numeros[inicio] = numeros[fin];
            numeros[fin] = temporal;
            inicio++;
            fin--;
        }
    }
    public static int buscarNumero(int[] numeros, int objetivo) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == objetivo) {
                return i + 1;
            }
        }
        return -1;
    }
    public static void resul(int numero, int posicion) {
        if (posicion != -1) {
            System.out.println("El número " + numero + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El número " + numero + " no está en el arreglo (" + posicion + ")");
        }
    }



}

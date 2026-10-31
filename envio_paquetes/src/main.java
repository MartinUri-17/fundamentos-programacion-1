public class main {
    static void main() {
        mostrarEtiqueta("PR1234567890567", "España", 988880.65);
        mostrarEtiqueta("Eu1234567890400", "Inglaterra", 18880923.08);

    }
    public   static void mostrarEtiqueta(String gia, String destino, double peso){
        System.out.println("Etiqueta del paquete:");
        System.out.println("Numero de guia:       "+gia);
        System.out.println("Ciudad de destino:    "+destino);
        System.out.println("Paso del paquete:     "+peso+"KG");
        System.out.println("------------------------------------");

    }
}

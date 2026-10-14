public class app {
    static void main() {
        int a,b,c;
        a=10;
        b=1;
        c=12;
        if(a==0||b==0||c==0){
            System.out.println("numero cero no valido");
        }else if (a>b && a>c){
            System.out.println("El mayor es: "+a);
        }else if (b>a && b>c){
            System.out.println("El mayor es: "+b);
        }else {
            System.out.println("El mayor es: "+b);
        }
        System.out.println("-------------------");
        int num=1;
        while (num<=5){
            System.out.println(num);
            num+=2;
        }
        System.out.println("-------------------");
        System.out.println(num);
        while (num>=0){
            System.out.println(num);
            num--;
        }

    }
}

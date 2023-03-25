import java.util.Scanner;
public class Ej_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("Introduzca los lados del triángulo: ");
        double l1 = entrada.nextDouble();
        double l2 = entrada.nextDouble();
        double l3 = entrada.nextDouble();

        

        if(l1+l2>l3 && l2+l3>l1 && l1+l3>l2 ){
            if(l1==l2 && l2==l3){
                System.out.println("El triángulo es equilátero");

            }else if(l1!=l2 && l2!=l3){
                System.out.println("El triángulo es escaleno");

            }else{
                System.out.println("El triángulo es isósceles");
            }

        }else{
            System.out.println("No es posible conformar un triángulo");
        }
    }
}        
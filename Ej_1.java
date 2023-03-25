import java.util.Scanner;
public class Ej_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double l1,l2,l3;
        System.out.println("Inserte los lados del triángulo: ");
        l1 =entrada.nextFloat();
        l2 =entrada.nextFloat();
        l3 =entrada.nextFloat();

        if(l1+l2>l3 && l2+l3>l1 && l1+l3>l2 ){

            double area = Math.sqrt((l1+l2+l3)*(l2+l3-l1)*(l1+l3-l2)*(l1+l2-l3));
            area /=4;
            System.out.println("El área del triángulo es "+area);
            

        }else{
            System.out.println("Los lados introducidos no conforman un triángulo");
        }


       

    }
    

    
    
}

import java.util.Scanner;
public class Ej_5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a,b;

        System.out.println("Inserte a");
        a = entrada.nextInt();
        System.out.println("Inserte b");
        b = entrada.nextInt();

        for(int i = 0;i < a ;i++){

            System.out.println();

            for(int j =0;j<b;j++){
                System.out.print("*");
            }

        }    

        
    }
    
}

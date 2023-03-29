import java.util.Scanner;
public class Ej_5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a,b;

        System.out.println("Inserte a");
        a = entrada.nextInt();
        System.out.println("Inserte b");
        b = entrada.nextInt();

         for(int i = 1;i <= a ;i++){

            for(int j =1;j<=b;j++){
                if(i==1 || i==a || j==1 || j==b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
                System.out.println();
        }    


        
    }
    
}

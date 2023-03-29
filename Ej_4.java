import java.util.Scanner;
public class Ej_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x;
        System.out.println("Inserte el tamaño del cuadrado: ");
        x = entrada.nextInt();

        for(int i = 1;i <= x ;i++){

            for(int j =1;j<=x;j++){
                if(i==1 || i==x || j==1 || j==x){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
                System.out.println();
        }    
    }
} 

import java.util.Scanner;
public class Ej_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x;
        System.out.println("Inserte el tamaño del cuadrado: ");
        x = entrada.nextInt();

        for(int i = 0;i < x ;i++){

            System.out.println();

            for(int j =0;j<x;j++){
                System.out.print("*");
            }

        }    
    }
} 
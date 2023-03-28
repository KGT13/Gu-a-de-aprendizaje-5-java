import java.util.Scanner;
public class Ej_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = entrada.nextInt();

        int multiplo = num;
        while (multiplo % 2 != 0) {
            multiplo += num;
            
        }
        System.out.println("El mínimo múltiplo de "+num+" que a su vez es múltiplo de 2 es "+multiplo);
    }
}

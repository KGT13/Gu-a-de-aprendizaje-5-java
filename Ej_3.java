import java.util.Scanner;
public class Ej_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Piensa en un número del 1 al 100.");

        int min = 1;
        int max = 100;
        int intentos = 0;

        while(intentos <=7){
            int med =(min + max)/2;
            intentos++;
            System.out.println("¿Tu número es "+med+" ?, (s/n)");
            char respuesta = entrada.next().charAt(0);
            if (respuesta == 's') {
                System.out.println("Adiviné tu número :)");
                return;

                
            } else if(min==max){
                System.out.println("No pude adivinar tu número en menos de 7 intentos :(");
                return;
                
                
            }else if (respuesta == 'n' && intentos == 7) {
                System.out.println("No pude adivinar tu número en menos de 7 intentos :(");
                return;

            }else if(respuesta== 'n' ){
                System.out.println("¿Es tu número mayor que : "+med+" ? (s/n)");
                     respuesta = entrada.next().charAt(0);
                     if (respuesta == 's'){
                        min = med+1;
                     }else{
                        max= med-1;
                     }


            } else{
                System.out.println("Ingrese una respuesta válida (s/n)");
                intentos--;
            }
        }

    }
} 
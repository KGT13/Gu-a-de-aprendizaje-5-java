import java.util.Scanner;
public class Ej_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("***Comprobación para ver si se cumple que existe un 1, un 3, o un 5 en su número***");
        System.out.println("Inserte un número");
        String num = entrada.nextLine();

        boolean cont135= false;

        for(int i = 0;i< num.length();i++){
            char x = num.charAt(i);
            if(x == '1' || x=='3' || x=='5'){
                cont135 = true; 
                break; 
            }           
        }
        if(cont135 == true){
            System.out.println("Se cumple");
        }else{
            System.out.println("No se cumple");
        }



    }
} 
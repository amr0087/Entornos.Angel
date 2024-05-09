import java.util.Scanner;

public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero; // Definimos numero y numero2 como variables
        int numero2;
                    /* Definimos tambien los resultados de las diferentes 
                       operaciones como variables. */
        int sumando;
        
        int resta;
        
        int multi;
        
        int divi;
        
        int rest;
                //Solicitamos los valores al cliente.
        Scanner leer = new Scanner(System.in);
            System.out.println("Introduzca el primer valor");
        numero = leer.nextInt();
            System.out.println("Introduzca el segundo valor");
        numero2 = leer.nextInt();
        //Realizamos todas las operaciones con usando las diferentes variables
        sumando = numero + numero2;
        
        resta = numero - numero2;
        
        multi = numero * numero2;
        
        divi = numero / numero2;
        
        rest = numero % numero2;
        //Mostramos por pantalla los diferentes resultados..
        System.out.println("El resultado de la suma es: " + suma);
        
        System.out.println("El resultado de la resta es: " + resta);
        
        System.out.println("El resultado de la multiplicacion es: " + multi);
        
        System.out.println("El resultado de la division es: " + divi);
        
        System.out.println("El resultado del resto es: " + rest);

    }
}

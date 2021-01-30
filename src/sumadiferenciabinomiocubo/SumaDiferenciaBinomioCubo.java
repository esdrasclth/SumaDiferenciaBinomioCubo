/* 
 *  Programa en Java que permite calcular la suma de un producto al cubo.
 *  @author EsdrasClother
 */
package sumadiferenciabinomiocubo;
import java.util.Scanner;

public class SumaDiferenciaBinomioCubo {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        boolean error = false;
        int valor1 = 0, valor2 = 0, resultado = 0;
        
        System.out.println("BIENVENIDO AL SISTEMA, POR FAVOR ELIJA LA OPERACION QUE DESEA REALIZAR:");
        System.out.println("1 - Suma de un producto al cubo.");
        System.out.println("2 - Diferencia de un producto al cubo.");
        System.out.println("3 - Salir. \n");
        
        do {
            try {        
                System.out.print("ELIJE UNA OPCION: ");
                opcion = entrada.nextInt();
                error = false;
            }catch(Exception e) {
                System.out.println("La opcion no esta dentro del menu, por favor ingrese una opcion valida.");
                error = true;
                entrada.nextLine();
            }
        } while(error == true);
        
        
        switch(opcion){
            
            case 1:
                System.out.println("\nEl siguiente programa le permitira calcular la suma de un producto al cubo: (A+B)^3.");
        
                do {
                    try {        
                        System.out.print("Por favor ingrese el valor de A: ");
                        valor1 = entrada.nextInt();
                        error = false;
                    }catch(Exception e) {
                        System.out.println("Por favor ingrese solo valores numericos");
                        error = true;
                        entrada.nextLine();
                    }
                } while(error == true);
                
                do {
                    try {        
                        System.out.print("Por favor ingrese el valor de B: ");
                        valor2 = entrada.nextInt();
                        error = false;
                    }catch(Exception e) {
                        System.out.println("Por favor ingrese solo valores numericos");
                        error = true;
                        entrada.nextLine();
                    }
                } while(error == true);
        
                //Realizando la operacion logica, del calculo matematico. 
                //(A + B)^3 = A^3 + 3·A^2·B + 3·A·B^2 + B^3)
                resultado = valor1*valor1*valor1 + 3*valor1*valor1*valor2 + 3*valor1*valor2*valor2 + valor2*valor2*valor2;

                System.out.println("\nEl resultado de la operacion: (" +valor1+ "+" +valor2+ ")^3 es de: ");
                System.out.println("(" +valor1+ "+" +valor2+ ")^3 = " +valor1+"^3 + 3·"+valor1+"^2·"+valor2+ " + 3·"+valor1+"·"+valor2+"^2 + "+valor2+"^3");
                System.out.println("(" +valor1+ "+" +valor2+ ")^3 = " +valor1*valor1*valor1+" + "+3*valor1*valor1*valor2+" + "+3*valor1*valor2*valor2+" + "+valor2*valor2*valor2);
                System.out.println("(" +valor1+ "+" +valor2+ ")^3 = " + resultado);  
                break;
                
            case 2:
                System.out.println("\nEl siguiente programa le permitira calcular la diferencia de un producto al cubo: (A-B)^3.");
        
                do {
                    try {        
                        System.out.print("Por favor ingrese el valor de A: ");
                        valor1 = entrada.nextInt();
                        error = false;
                    }catch(Exception e) {
                        System.out.println("Por favor ingrese solo valores numericos");
                        error = true;
                        entrada.nextLine();
                    }
                } while(error == true);
                
                do {
                    try {        
                        System.out.print("Por favor ingrese el valor de B: ");
                        valor2 = entrada.nextInt();
                        error = false;
                    }catch(Exception e) {
                        System.out.println("Por favor ingrese solo valores numericos");
                        error = true;
                        entrada.nextLine();
                    }
                } while(error == true);
        
                //Realizando la operacion logica, del calculo matematico. 
                //(A - B)^3 = A^3 - 3·A^2·B + 3·A·B^2 - B^3)
                resultado = valor1*valor1*valor1 - 3*valor1*valor1*valor2 + 3*valor1*valor2*valor2 - valor2*valor2*valor2;

                System.out.println("\nEl resultado de la operacion: (" +valor1+ "-" +valor2+ ")^3 es de: ");
                System.out.println("(" +valor1+ "-" +valor2+ ")^3 = " +valor1+"^3 - 3·"+valor1+"^2·"+valor2+ " + 3·"+valor1+"·"+valor2+"^2 - "+valor2+"^3");
                System.out.println("(" +valor1+ "-" +valor2+ ")^3 = " +valor1*valor1*valor1+" - "+3*valor1*valor1*valor2+" + "+3*valor1*valor2*valor2+" - "+valor2*valor2*valor2);
                System.out.println("(" +valor1+ "-" +valor2+ ")^3 = " + resultado); 
                break;
                
            default:
                System.out.println("\nGracias por utilizar el sistema, esperamos volver a verte pronto.");
                break;
        }
        
    }
    
}

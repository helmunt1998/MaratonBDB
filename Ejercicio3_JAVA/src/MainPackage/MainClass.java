/*
 Dado un valor n, se creará una cantidad de velas según la edad. Del total de velas,
mostrar cuántas se pueden apagar teniendo en cuenta que solo se pueden apagar las mayores
 */
package MainPackage;

import java.util.Scanner;

public class MainClass {
    
    public static int findMaximum(int[] arrayAlt){
        int maximum = 0; //Valor mínimo de la variable suponiendola desde 0 
        int contadorMax=0;

        for (int i = 0; i < arrayAlt.length; i++) { 
            maximum = Math.max(maximum, arrayAlt[i]); //Método max de la clase Math
        }
        for (Integer max : arrayAlt) {
            if (max == maximum) {
                contadorMax++; //Cuenta la cantidad de máximos
            }          
        }
        
        return contadorMax;
    }
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        int entrada, velas;
        String stringAlt;
        String[] ar;
        
        System.out.println("¿Cuántos años cumple la sobrina?");  
        entrada = input.nextInt();
        input.nextLine();

        do {            
            System.out.println("\nDigita altura de cada vela: ");  
            stringAlt = input.nextLine();
            ar = stringAlt.split("\\D|\\s");
            
            if (ar.length == entrada) {
                int[] altura = new int[ar.length]; 
                                      
                for (int i = 0; i < ar.length; i++) {
                    altura[i] = Integer.valueOf(ar[i]);  //convierte a array de enteros
                }
                velas = findMaximum(altura);                
                System.out.println("\nTu sobrina podrá apagar " + velas + " velas");
            } else {
                System.out.println("\nIngresa la cantidad correcta de velas.");
            }
            
        } while (ar.length!=entrada); //Realiza el ciclo hasta que se ingrese la cantidad esperada
    }   
}

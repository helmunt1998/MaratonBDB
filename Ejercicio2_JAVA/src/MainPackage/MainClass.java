/*
 Dado 5 enteros positivos, encuentre los valores máximo y mínimo que se puede
calcular sumando exactamente 4 de los 5 enteros, imprímalos en una sola línea
de dos enteros largos separados por espacios.

 */
package MainPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    
    public static void calculaSumas(ArrayList<Integer> lista){
        long arr[] = {0,0};
        
        Collections.sort(lista); //Clase collections, método sort
        for (int i = 0; i < lista.size()-1; i++) {
            arr[0] += lista.get(i); //Suma de los máximos
            arr[1] += lista.get(lista.size()-i-1);
        }
        System.out.println(lista);
        System.out.println(arr[0]+" "+arr[1]);
    }
    
    public static void main (String[] args){
        
       ArrayList<Integer> arrList = new ArrayList<>(5); //Lista de 5
       boolean bandera = true; 
       Scanner input = new Scanner(System.in);  
       int numero = 0, in = 0;
       
       System.out.println("Inserta la cadena de cinco valores positivos.");
       
       do {			
         try {
            in = input.nextInt();
            arrList.add(in);

             if (arrList.size()==5) {
                 for (Integer list : arrList) {
                     if (list > 0) {
                         numero++;
                     }   
                 }
                 if (numero==5) {
                     calculaSumas(arrList);
                     bandera = false;
                 } else {
                     System.out.println("Inserta solo enteros positivos.");
                     arrList.removeAll(arrList); 
                 }
                 numero=0;
             } 
         } catch (InputMismatchException ex){
           System.out.println("Solo es válido entrada numérica.");
           arrList.removeAll(arrList);
           input.next();
         } 
       } while (bandera);
    }
    
}

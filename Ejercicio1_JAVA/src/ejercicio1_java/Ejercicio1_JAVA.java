/*
  Dada una matriz de enteros que representa el color de cada calcetín, determinar
cuántos pares de calcetines con colores coincidentes hay.
 */
package ejercicio1_java;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1_JAVA {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String entrada;
        String[] ar; 
        ArrayList<Integer> arVariable = new ArrayList<>();
        ArrayList<Integer> arTotales = new ArrayList<>();
        int count=0,aux; 
        
        System.out.println("Ingresa los 'colores' de calcetines: ");  //9 10 20 20 10 10 30 50 10 20
        entrada = input.nextLine();
        
        ar = entrada.split("\\D|\\s"); //Expresión regular para espacios y cualquier
                                      //caracter que no sea digito
        int[] cont = new int[ar.length]; 
                                      
        for (int i = 0; i < ar.length; i++) {
            cont[i] = Integer.valueOf(ar[i]);  //Transformo a un array de enteros   
                                               //para poder ordenar sus elementos
        }                                   

        for(int i=0;i<(cont.length-1);i++){  //Usar método de ordenamiento, burbuja
            for(int j=0;j<(cont.length-i-1);j++){
                if(cont[j+1] < cont[j]){ //Si numeroSiguiente > numeroActual
                    aux = cont[j+1];
                    cont[j+1] = cont[j];
                    cont[j] = aux;
                }
            }
        }
        
        int valAux0 = cont[0];
        for (int i = 0; i < cont.length; i++) { 
            if (valAux0 == cont[i]) {  //Separar cada elemento según difiera y contar
                count++;
            } else {                
                arVariable.add(valAux0); //Añadir ArrayList con elemento variables de cada indice diferente
                arTotales.add(count); //Añadir lista con conteo de cada elemento diferente               
                count = 1;
                valAux0=cont[i]; 
            }             
        }
        
        arVariable.add(valAux0);  //Añadir los últimos elementos de la lista
        arTotales.add(count);  

        int paresTotal=0;
        for (int i = 0; i < arVariable.size(); i++) {

            int par = arTotales.get(i)/2;
            System.out.println("Hay "+par+" pares "+"en el color "
                    +arVariable.get(i));
            if (par!=0) {
                paresTotal+=par;
            }
        }
        System.out.println("Hay "+paresTotal+" pares en total.");
    }   
}

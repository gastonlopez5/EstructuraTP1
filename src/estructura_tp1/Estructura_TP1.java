/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_tp1;

import java.util.Scanner;

/**
 *
 * @author gaston
 */
public class Estructura_TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Punto 1
        Scanner sc = new Scanner(System.in);
        Integer edades[] = new Integer[3];
        int resultado = 0;
        int aux;
        
        System.out.println("Ingrese la primer edad: ");
        aux = sc.nextInt();
        edades[0] = aux;
        
        System.out.println("Ingrese la segunda edad: ");
        aux = sc.nextInt();
        edades[1] = aux;
        
        System.out.println("Ingrese la tercera edad: ");
        aux = sc.nextInt();
        edades[2] = aux;
        
        for (int i=0; i<edades.length; i++){
            if (edades[i] > resultado){
                resultado = edades[i];
            }
        }
        
        System.out.println("La edad más alta es: "+ resultado);
    }
    
}

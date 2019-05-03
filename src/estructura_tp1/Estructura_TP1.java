/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_tp1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
//        Scanner sc = new Scanner(System.in);
//        Integer edades[] = new Integer[3];
//        int resultado = 0;
//        int aux;
//        
//        System.out.println("Ingrese la primer edad: ");
//        aux = sc.nextInt();
//        edades[0] = aux;
//        
//        System.out.println("Ingrese la segunda edad: ");
//        aux = sc.nextInt();
//        edades[1] = aux;
//        
//        System.out.println("Ingrese la tercera edad: ");
//        aux = sc.nextInt();
//        edades[2] = aux;
//        
//        for (int i=0; i<edades.length; i++){
//            if (edades[i] > resultado){
//                resultado = edades[i];
//            }
//        }
//        
//        System.out.println("La edad más alta es: "+ resultado);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // Punto 2
//        Scanner sc = new Scanner(System.in);
//        Double lados[] = new Double[3];
//        Double lados1[] = new Double[3];
//        int aux = 0;
//        
//        System.out.println("Ingrese las 3 longitudes de los lados de un triángulo: ");
//        lados[0] = sc.nextDouble();
//        lados[1] = sc.nextDouble();
//        lados[2] = sc.nextDouble();
//        
//        lados1 = lados.clone();
//        
//        if ((lados[0]+lados[1] > lados[2]) && (lados[0]+lados[2] > lados[1]) && (lados[2]+lados[1] > lados[0])){
//            
//            for (int j=0; j<lados.length; j++){
//                double a = lados[j];
//                for (int i=0; i<lados.length; i++){
//                    double b = lados1[i];
//                    if (a == b){
//                        aux += 1;
//                    }
//                }
//            }
//            
//            System.out.println("aux= " + aux);
//            
//            switch (aux){
//                case 3:
//                    System.out.println("Es un triangulo escaleno");
//                    aux = 0;
//                    break;
//                    
//                case 5:
//                    System.out.println("Es un triangulo isoceles");
//                    aux = 0;
//                    break;
//                
//                case 9:
//                    System.out.println("Es un triangulo equilátero");
//                    aux = 0;
//                    break;
//                
//                default:
//                    break;
//            }
//        
//        }else{
//            System.out.println("No es posible formar un triángulo con los tres lados ingresados");
//        } 
//        
//    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // Punto 3
        Scanner sc = new Scanner(System.in);
        LocalDate fechaNacimiento;
        LocalDate fechaActual = LocalDate.now();
        int edad;
        
        try{
            System.out.println("Ingresar fecha de nacimiento dd/mm/aaaa: ");
            String fecha = sc.next();
            fechaNacimiento = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
            edad = fechaActual.getYear() - fechaNacimiento.getYear();
            System.out.println("Usted tiene: "+ edad);
        }catch (DateTimeParseException ex){
            System.out.println("Error en el formato con el que ingresó la fecha.");
        }
        
        }
}

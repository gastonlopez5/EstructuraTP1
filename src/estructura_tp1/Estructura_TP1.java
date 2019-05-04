/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_tp1;

import static java.lang.Math.round;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.Vector;

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
//        Scanner sc = new Scanner(System.in);
//        LocalDate fechaNacimiento;
//        LocalDate fechaActual = LocalDate.now();
//        int edad;
//        int mes;
//        int dia;
//        
//        try{
//            System.out.println("Ingresar fecha de nacimiento dd/mm/aaaa: ");
//            String fecha = sc.next();
//            fechaNacimiento = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        
//            edad = fechaActual.getYear() - fechaNacimiento.getYear();
//            
//            if (fechaActual.getDayOfYear() >= fechaNacimiento.getDayOfYear()){
//                System.out.println("Usted tiene: "+ edad);
//            }else{
//                edad -= 1;
//                System.out.println("Usted tiene: " + edad);
//            }
//        }catch (DateTimeParseException ex){
//            System.out.println("Error en el formato con el que ingresó la fecha.");
//        }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // Punto 4
        // Cotizacion de billetes segun el Banco Nacion
//        double dolarCompra = 43.4;
//        double dolarVenta = 45.4;
//        double euroCompra = 50;
//        double euroVenta = 52;
//        double realCompra = 1080; //Por cada 100 unidades
//        double realVenta = realCompra;
//        
//        Scanner sc = new Scanner(System.in);
//        int selec;
//        double billetes;
//        double cambio;
//        
//        System.out.println("Ingrese la cantidad de billetes a cambiar:");
//        billetes = sc.nextDouble();
//        
//        System.out.println("Ingrese el tipo de cambio deseado:");
//        System.out.println("1- peso a dolar");
//        System.out.println("2- dolar a peso");
//        System.out.println("3- peso a euro");
//        System.out.println("4- euro a peso");
//        System.out.println("5- peso a real");
//        System.out.println("6- real a peso");
//        
//        selec = sc.nextInt();
//        
//        switch (selec){
//        
//            case 1:
//                cambio = billetes/dolarVenta;
//                System.out.println("Su cambio en dolares es: " + cambio);
//                break;
//                
//            case 2:
//                cambio = billetes*dolarCompra;
//                System.out.println("Su cambio en pesos es: " + cambio);
//                break;
//                
//            case 3:
//                cambio = billetes/euroVenta;
//                System.out.println("Su cambio en euros es: " + cambio);
//                break;
//                
//            case 4:
//                cambio = billetes*euroCompra;
//                System.out.println("Su cambio en pesos es: " + cambio);
//                break;
//                
//            case 5:
//                cambio = (billetes*100)/realVenta;
//                System.out.println("Su cambio en reales es: " + cambio);
//                break;
//                
//            case 6:
//                cambio = (billetes*realCompra)/100;
//                System.out.println("Su cambio en pesos es: " + cambio);
//                break;
//                
//            default:
//                System.out.println("Ingrese un valor entero entre 1 y 6");
//                break;
//                
//        }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // Punto 5
//        Vector<Integer> vector = new Vector<Integer>(20, 1);
//        Vector<Integer> vectorA = new Vector<Integer>();
//        Vector<Integer> vectorB = new Vector<Integer>();
//        int aux;
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Ingrese 20 nros. enteros:");
//        
//        for (int i=0; i<vector.capacity(); i++){
//            aux = sc.nextInt();
//            vector.add(aux);
//        }
//        
//        for (int i=0; i<vector.size(); i++){
//            if (vector.elementAt(i) >= 0){
//                vectorA.addElement(vector.elementAt(i));
//            }else{
//                vectorB.addElement(vector.elementAt(i));
//            }
//        }
//        
//        System.out.println("El vector con valores positivos es: ");
//        for (int i=0; i<vectorA.size(); i++){
//            System.out.println(vectorA.elementAt(i));
//        }
//        
//        System.out.println("El vector con valores negativos es: ");
//         for (int i=0; i<vectorB.size(); i++){
//            System.out.println(vectorB.elementAt(i));
//        }

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // Punto 6
//        Scanner sc = new Scanner(System.in);
//        String frase;
//        char aux;
//        int aa=0, bb=0, cc=0, dd=0, ee=0;
//        int vocales[] = new int[5];
//        
//        vocales[0] = aa;
//        vocales[1] = bb;
//        vocales[2] = cc;
//        vocales[3] = dd;
//        vocales[4] = ee;
//        
//        System.out.println("Ingrese una frase:");
//        frase = sc.nextLine();
//        
//        for (int i=0; i<frase.length(); i++){
//            aux = frase.charAt(i);
//            
//            if ((aux == 'a') || (aux == 'A')){
//                vocales[0] += 1;
//            }else if ((aux == 'e') || (aux == 'E')){
//                vocales[1] += 1;
//            }else if ((aux == 'i') || (aux == 'I')){
//                vocales[2] += 1;
//            }else if ((aux == 'o') || (aux == 'O')){
//                vocales[3] += 1;
//            }else if ((aux == 'u') || (aux == 'U')){
//                vocales[4] += 1;
//            }
//        }
//            
//        System.out.println("Cantidad de 'a': " + vocales[0]);
//        System.out.println("Fracuencia de aparicion de 'a': " + vocales[0] + "/" + frase.length());
//        System.out.println("Cantidad de 'e': " + vocales[1]);
//        System.out.println("Fracuencia de aparicion de 'e': " + vocales[1] + "/" + frase.length());
//        System.out.println("Cantidad de 'i': " + vocales[2]);
//        System.out.println("Fracuencia de aparicion de 'i': " + vocales[2] + "/" + frase.length());
//        System.out.println("Cantidad de 'o': " + vocales[3]);
//        System.out.println("Fracuencia de aparicion de 'o': " + vocales[3] + "/" + frase.length());
//        System.out.println("Cantidad de 'u': " + vocales[4]);
//        System.out.println("Fracuencia de aparicion de 'u': " + vocales[4] + "/" + frase.length());

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // Punto 8
//        Scanner sc = new Scanner(System.in);
//        double nroInicial = 0;
//        double nroFinal;
//        int nroCol;
//        int nroRow;
//        boolean aux = true;
//        boolean aux2 = true;
//        int nroGrupo;
//        
//        while (aux){
//            System.out.println("Ingrese el nro inicial (>=100): ");
//            nroInicial = sc.nextInt();
//            
//            if (nroInicial >= 100){
//                aux = false;
//            }else{
//                System.out.println("Ingrese el nro inicial nuevamente");
//            }
//        }
//        
//        System.out.println("Ingrese el nro final:");
//        nroFinal = sc.nextInt();
//        System.out.println("Ingrese el nro de columnas: ");
//        nroCol = sc.nextInt();
//        System.out.println("Ingrese el nro de filas: ");
//        nroRow = sc.nextInt();
//        
//        nroGrupo = (int) Math.ceil((nroFinal - nroInicial)/(nroRow * nroCol));
//        int grupo[][][] = new int[nroGrupo][nroRow][nroCol];
//        
//        while (aux2){
//            
//            for (int i=0; i<nroGrupo; i++){
//                for (int j=0; j<nroRow; j++){
//                    for (int k=0; k<nroCol; k++){
//                        if (nroInicial < nroFinal){
//                            grupo[i][j][k] = (int)nroInicial;
//                            nroInicial++;
//                        }
//                    }
//                }
//            }
//            
//            if (nroInicial >= nroFinal){
//                aux2 = false;
//            }
//        }
//        
//        for (int i=0; i<grupo.length; i++){
//            System.out.println();
//            System.out.println("Grupo Nro: " + (i+1));
//            for (int j=0; j<grupo[i].length; j++){
//                for(int k=0; k<grupo[i][j].length; k++){
//                    System.out.print(grupo[i][j][k]);
//                    if (k != grupo[i][j].length-1){
//                        System.out.print("\t");
//                    }else{
//                        System.out.println();
//                    }
//                }
//            }
//        }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // Punto 9
        int vector[] = new int[5];
        Scanner sc = new Scanner(System.in);
        boolean valorCorrecto = false;
        
        for (int i=0; i<vector.length; i++){
            while (!valorCorrecto){
                System.out.println("Ingrese el valor nro " + (i+1));
                vector[i] = sc.nextInt();
                if ((vector[i] >= 0) && (vector[i] <= 30)){
                    valorCorrecto = true;
                }else{
                    System.out.println("Ingrese nuevamente el valor");
                }
            }
            valorCorrecto = false;
        }
        
        System.out.println("");
        for (int i=0; i<vector.length; i++){
            for (int j=0; j<vector[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

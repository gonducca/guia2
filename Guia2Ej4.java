/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ej4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese temperatura en grados centígrados");
        Double temp,tempF;
        temp=leer.nextDouble();
        tempF=32+(9*temp/5);
        System.out.println("La temperatura en Fahrenheit es: "+tempF);
    }
    
}
/*
Dada una cantidad de grados centígrados 
se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5) */
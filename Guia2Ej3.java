/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ej3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese frase:");
        frase=leer.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        
    }
    
}

/*
Escribir un programa que pida una frase 
y la muestre toda en mayúsculas y después toda en minúsculas.
*/
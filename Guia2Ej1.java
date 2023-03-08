/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ej1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese dos nùmeros enteros:");
        int num1,num2;
        num1=leer.nextInt();
        num2=leer.nextInt();
        System.out.println("La suma de "+num1+" y "+num2+" es "+(num1+num2));
    }
    
}
/* Escribir un programa que pida dos números enteros por teclado 
y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ej5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese número");
        int num,doble,triple;
        Double raiz;
        num=leer.nextInt()
        doble=num*2;
        triple=num*3;
        raiz=Math.sqrt(num);
        System.out.println("El doble de "+num+" es "+doble+",el triple es "+triple+" y su raiz cuadrada es "+raiz);
        
    }
    
}
/*
Escribir un programa que lea un número entero por teclado
y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt()
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

/**
 *
 * @author alagoro
 */

import java.util.Scanner;

public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float numero1, numero2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduzca el primer número: ");
        numero1 = sc.nextFloat();
        
        System.out.println("introduzca el segundo número: ");
        numero2 = sc.nextFloat();
        
        System.out.println("suma: "+(numero1+numero2));
        System.out.println("resta: "+(numero1-numero2));
        System.out.println("producto: "+(numero1*numero2));
        System.out.println("Division: "+(numero1/numero2));

    }    

    
}

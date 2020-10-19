/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_3;

/**
 *
 * @author alagoro
 */

import java.util.Scanner;

public class Boletin3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int b100, b20, b5, m1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el número de billetes ");
        System.out.println("de 100: ");
        b100 = sc.nextInt();
        System.out.println("de 20: ");
        b20 = sc.nextInt();
        System.out.println("de 5: ");
        b5 = sc.nextInt();
        System.out.println("y el número de monedas de 1 euro: ");
        m1 = sc.nextInt();
        
        System.out.println("Son un total de "+(b100*100+b20*20+b5*5+m1)+" euros");        
    }
    
}

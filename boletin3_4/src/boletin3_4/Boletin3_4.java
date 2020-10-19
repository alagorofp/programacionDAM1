/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_4;

/**
 *
 * @author alagoro
 */

import java.util.Scanner;

public class Boletin3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total, b100, b20, b5, m1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el total en euros: ");
        total = sc.nextInt();

        b100 = total /100;
        b20 = (total % 100)/20;
        b5 = (total%20)/5;
        m1 = total % 5;
        
        System.out.println("Son un total de "+total+" euros se desglosa en:");                
        System.out.println(b100+" billetes de 100");
        System.out.println(b20+" billetes de 20"); 
        System.out.println(b5+" billetes de 5");
        System.out.println("Y "+m1+" monedas de 1 euro");                
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

/**
 *
 * @author alagoro
 */

import java.util.Scanner;

public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float euros, cambio;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduzca el cambio: ");
        cambio = sc.nextFloat();
        
        System.out.println("introduzca los euros a cambiar: ");
        euros = sc.nextFloat();
        
        System.out.println(euros+" euros son "+euros * cambio+" dólares");

    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_2;

/**
 *
 * @author alagoro
 */

import java.util.Scanner;

public class Boletin3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        float tempC;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduzca la temperatura en grados centígrados: ");
        tempC = sc.nextFloat();
               
        System.out.println(tempC+"ºC son "+(tempC+273.15)+"ºK o "+(tempC*1.8+32)+"ºF");

    }
    
}

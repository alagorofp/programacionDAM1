/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

/**
 *
 * @author alagoro
 */
import java.util.Scanner;

public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int RELACION = 1852;
        float millas;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduzca las millas: ");
        millas = sc.nextFloat();
        
        System.out.println(millas+" millas son "+millas * RELACION+" metros");
    }
    
}

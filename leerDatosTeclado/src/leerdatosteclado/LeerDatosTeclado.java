/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerdatosteclado;

/**
 *
 * @author alagoro
 */

import java.util.Scanner;

public class LeerDatosTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduzca la base: ");
        float base = sc.nextFloat();
        
        System.out.println("introduzca la altura: ");
        float altura = sc.nextFloat();
        
        System.out.println("Área de rectángulo: "+base * altura);

    }
    
}

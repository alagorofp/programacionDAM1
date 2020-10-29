/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjeto;

/**
 *
 * @author alagoro
 */

import java.util.Scanner;

public class Ejemploobjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instancia objeto rectángulo
        Rectangulo  obxRec1 = new Rectangulo();
        obxRec1.setBase(10);
        obxRec1.amosar();
        
        Rectangulo obxRec2 = new Rectangulo(3f, 5.0f);
        obxRec2.amosar();
        System.out.println(obxRec2.getAltura());
        
        obxRec1.setAltura(10);
        obxRec1.setBase(11);
        obxRec1.amosar();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir valor de base:");
        float base = sc.nextFloat();
        System.out.println("Introducir altura: ");
        float altura = sc.nextFloat();
        System.out.println("Area: "+obxRec1.calculararea(base, altura));
    }
    
}

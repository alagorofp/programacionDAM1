/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploinscodigo;

/**
 *
 * @author alagoro
 */
import java.util.Scanner;

public class ExemploInsCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca características del coche: ");
        System.out.println("velocidad: ");
        float velocidad = sc.nextFloat();

        System.out.println("Color: ");
        String color = sc.next();

        System.out.println("Precio: ");
        float precio = sc.nextFloat();

        Coche coche1 = new Coche(velocidad, color, precio);
        coche1.amosar();

        System.out.println(coche1);

    }

}

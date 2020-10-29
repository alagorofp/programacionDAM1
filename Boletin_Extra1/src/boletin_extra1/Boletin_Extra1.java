/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_extra1;

/**
 *
 * @author alagoro
 */
public class Boletin_Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Probar clase Conta
        
        Conta cuenta1 = new Conta("Perico de los palotes", "123-12", 0.25, 100.25);
        System.out.println("Saldo inicial = " + cuenta1.getSaldo());
        System.out.println("Saldo despues del ingreso = " + cuenta1.ingreso(25.25));
        System.out.println("Saldo despues del reintegro = " + cuenta1.ingreso(25.25));
    }
    
}

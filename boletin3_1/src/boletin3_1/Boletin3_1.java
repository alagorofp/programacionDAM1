/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_1;

/**
 *
 * @author alagoro
 */
import java.util.Scanner;

public class Boletin3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float precioTarifa, precioPagado;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduzca el precio de tarifa: ");
        precioTarifa = sc.nextFloat();
        
        System.out.println("introduzca el precio pagado: ");
        precioPagado = sc.nextFloat();
        
        System.out.println("Descuento = "+((precioPagado/precioTarifa-1) * 100)+"%");
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_5;

/**
 *
 * @author alagoro
 */
import java.util.Scanner;

public class Boletin3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float COMVEN = 0.05f,
                IRPF = 0.18f;
        int KILOMETRAJE = 2,
                RETSS = 36,
                DIETADIA = 30;

        float sueldoFijo,
                ventas,
                kilometros,
                diasDesplazamiento;
        double sueldoBruto, sueldoLiquido;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca los siguientes datos: ");
        
        System.out.println("Sueldo fijo (euros): ");
        sueldoFijo = sc.nextFloat();
        
        System.out.println("Ventas (euros): ");
        ventas = sc.nextFloat();
        
        System.out.println("Kilómetros recorridos: ");
        kilometros = sc.nextFloat();
        
        System.out.println("Días de desplazamiento: ");
        diasDesplazamiento = sc.nextFloat();
   
        sueldoBruto = sueldoFijo + ventas*COMVEN + kilometros*KILOMETRAJE 
                + diasDesplazamiento*DIETADIA;
        
        sueldoLiquido = sueldoBruto - RETSS - (sueldoBruto * IRPF);
        
        System.out.println("Sueldo bruto: "+ sueldoBruto + " euros");
        System.out.println("Sueldo líquido: "+ sueldoLiquido + " euros");
    }

}

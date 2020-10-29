/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author alagoro
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Consumo consume1 = new Consumo();
        consume1.setLitros(50);
        consume1.setpGas(1.57f);
        
        Consumo consume2 = new Consumo(66, 4, 90, 1.09f);
        System.out.println("Consumo medio (l/100Km): "+consume2.getConsumoMedio());
        consume2.setLitros(35);
        System.out.println("Velocidad media:"+consume2.getvMed());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1;

/**
 *
 * @author alagoro
 * 
 * 1- Temos a seguinte clase Coche:

public class Coche {
     private int velocidade ;

    public Coche(){
    velocidade =0 ;
}

Engade a clase Coche os seguintes métodos :

public int getVelocidade() . Este método devolve a velocidade actual

public void acelerar (int valor) .Este método incrementa a velocidade na cantidade valor

public void frenar (int menos).Este método diminue a velocidade na cantidade menos.

Crea a clase Boletin 6_1 para comprobar que o programa se executa ben .dandolle os valores que precises.
 */
public class Boletin6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche seat = new Coche();
        System.out.println("Velocidad inicial: "+seat.getVelocidade());

        //incremento la velocidad en 25
        seat.acelerar(50);
        System.out.println("Velocidad actual: "+seat.getVelocidade());

        //reduzco en 15
        seat.frenar(15);
        System.out.println("Velocidad actual: "+seat.getVelocidade());
        
    }
    
}

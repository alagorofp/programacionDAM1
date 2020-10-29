/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;

/**
 *
 * @author alagoro
 * 2- A seguinte clase ten problemas de compilación . 
 * Corríxeos e ,de seguido, implementa unha clase principal ( Boletin 6₂ ), 
 * co metodo main() para testear e verificar os métodos da clase Satelite.

public class Satelite ( )   {
 
     private double meridiano ;
     private double paralelo
     private double distanciaTerra ;

 public Satelite ( ) {

  meridiano = paralelo = distanciaTerra = 0 
}

public Satelite ( double m; double p ; double d ) ; {

meridiano = m ;
paralelo = p;
distanciaTerra = d ;

}
public void verPosicion ( ) {

System.out.println (“ o satelite atopase  no paralelo “ paralelo + “meridiano ” + meridiano “ a unha distancia da terra “ +“ distanciaTerra )     
 */
public class Boletin6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Satelite meteoSat = new Satelite(5.6,8.3,10000) ;
        meteoSat.verPosicion();
    }
    
}

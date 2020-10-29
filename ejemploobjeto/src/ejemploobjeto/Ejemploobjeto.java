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
public class Ejemploobjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instancia objeto rectángulo
        Rectangulo  obxRec1 = new Rectangulo();
        float altura = obxRec1.altura ;
        System.out.println("altra --->"+altura);
        obxRec1.amosar();
    }
    
}

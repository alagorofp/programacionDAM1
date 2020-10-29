/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

/**
 *
 * @author alagoro
 * 
 * 
 * Implementa unha aplicación que nos permita traballar con circulos e circunferencias .Para eso crea a clase Circulo cas seguintes características :

atributos : radio ( tipo double )
Pi ( constante de tipo double e valor 3.14 )

métodos : *   constructores, sen e con parámetros
                 *  métodos de acceso
                 *   calcularArea : Non recibe nada e devolve o valor da área . Para calcular radio ^ 2 utiliza a clase Math e o método pow (….)
                 *  calcularLonxitude : Non recibe nada e devolve o valor da lonxitude da circunferencias
   
     Crea unha clase principal para comprobar que todo funciona ben
 * 
 */
public class Boletin6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(1);
        System.out.println("Longitud circunferencia: "+circulo1.calcularLonxitude());
        
        Circulo circulo2 = new Circulo(2);
        System.out.println("Área del circulo de radio "+circulo2.getRadio()+" es: "+circulo2.calcularArea());
    }
    
}

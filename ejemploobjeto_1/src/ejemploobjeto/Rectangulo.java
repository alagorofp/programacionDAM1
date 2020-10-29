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
public class Rectangulo {
    //atributos
    private float base;

    private float altura;
    
    //constructor
    public Rectangulo(){
        
    }
    
    public Rectangulo(float base, float al){
        this.base = base;
        altura = al;
    }
    
    //metodos de acceso
    public void setBase(float base){
        this.base = base;
    }
    
    public float getAltura() {
        return altura;
    }

    public float getBase() {
        return base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //metodos
    public void amosar(){
        System.out.println("base = "+base+" altura = "+altura);
    }

    public float calculararea(float base, float altura){
        return base * altura;
    }
    
}

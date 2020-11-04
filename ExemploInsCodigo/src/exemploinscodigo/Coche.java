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
public class Coche {

    private float velocidade;
    private String cor;
    private float prezo;

    public Coche() {
    }

    public Coche(float velocidade, String cor, float prezo) {
        this.velocidade = velocidade;
        this.cor = cor;
        this.prezo = prezo;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public void amosar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "velocidad = " + velocidade + " color=" + cor + " precio = " + prezo;
    }

}

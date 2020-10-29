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
public class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;

    public Consumo() {
    }

    public Consumo(float km, float litros, float vMed, float pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public void setKms(float km) {
        this.km = km;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public void setvMed(float vMed) {
        this.vMed = vMed;
    }

    public void setpGas(float pGas) {
        this.pGas = pGas;
    }

    public float getvMed() {
        return vMed;
    }
    
    
    public float getTempo(){
        return km / vMed;
    }
    
    public float getConsumoMedio(){
        return litros*100/km;
    }
    
    public float getConsumoEuros(){
        return getConsumoMedio()*pGas;
    }
}

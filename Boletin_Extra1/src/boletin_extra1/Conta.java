/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_extra1;

/**
 *
 * @author alagoro
 */
public class Conta {

    /* atributos :
    nome do cliente ( String), 
    número de conta ( String) 
    tipo de interese ( double) 
    e saldo ( double). 
     */
    private String clienteNome;
    private String conta;
    private double tipoInterese;
    private double saldo;

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getTipoInterese() {
        return tipoInterese;
    }

    public void setTipoInterese(double tipoInterese) {
        this.tipoInterese = tipoInterese;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Construtor por defecto Construtor con todos os parámetros .
    public Conta() {
    }

    public Conta(String clienteNome, String conta, double tipoInterese, double saldo) {
        this.clienteNome = clienteNome;
        this.conta = conta;
        this.tipoInterese = tipoInterese;
        this.saldo = saldo;
    }

    /**
     * Métodos ingreso e reintegro. Un ingreso consiste en aumentar o saldo na
     * cantidade que se indique. Un reintegro consiste en diminuír o saldo nunha
     * cantidade A cantidade non pode ser negativa.
     */
    public double ingreso(double cantidad) {
        if (cantidad >= 0) {
            this.saldo += cantidad;
        }
        return this.saldo;
    }
    
    public double reintegro(double cantidad){
      if (cantidad >= 0) {
          this.saldo -= cantidad;
      }   
      return this.saldo;
    }
    
    /**
     * Método transferencia que permita pasar diñeiro dunha conta a outra 
     * Exemplo de uso do método transferencia:
     * cuentaOrigen.transferencia( cuentaDestino, importe); 
     * que indica que queremos facer unha transferencia desde cuentaOrigen a cuentaDestino do importe indicado. 
     * @param cuentaDestino Conta
     * @param importe double
     */
    public void transferencia( Conta cuentaDestino, double importe){
        if(this.saldo >= importe){
            this.saldo -= importe;
            cuentaDestino.ingreso(importe);
        }
    }
}

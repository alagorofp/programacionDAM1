/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

/**
 *
 * @author alagoro
 */
public class Libro {
// declaracion atributos

    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    // métodos de acceso (getters)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public float getValoracion() {
        return valoracion;
    }

    // metodos de acceso (setters)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

// constructores
    public Libro() {

    }

    public Libro(String titulo, String autor, int ano, short numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
    }

    //metodos
    public void amosar() {
        System.out.println("titulo = " + this.titulo);
        System.out.println("autor = " + this.autor);
        System.out.println("ano = " + this.ano);
        System.out.println("Número de paginas = " + this.numPaginas);
        System.out.println("Valoracion = " + this.valoracion);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

import java.util.Scanner;

/**
 *
 * @author alagoro
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un libro con cada construtor e mostrar por consola a súa información. 
        // Modificar os datos do libro creado co construtor por defecto

        Libro libro1 = new Libro();
        libro1.amosar();
        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", 1605, (short) 10);

        //Modificar os datos do libro creado co construtor por defecto
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir el título de un libro:");
        libro1.setTitulo(sc.nextLine());
        System.out.println("Introducir el Autor:");
        libro1.setAutor(sc.nextLine());
        System.out.println("Introducir el año de publicación:");
        libro1.setAno(sc.nextInt());
        System.out.println("Introducir el número de páginas:");
        libro1.setNumPaginas(sc.nextShort());
        System.out.println("Introducir la valoracion:");
        libro1.setValoracion(sc.nextFloat());
        libro1.amosar();
    }

}

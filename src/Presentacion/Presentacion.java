/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica_De_Negocios.Obtener;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author serzu
 */
public class Presentacion {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String nombre;

        Obtener obtener = new Obtener();

        System.out.println("Dime el nombre de la persona: ");
        nombre = teclado.nextLine();
        obtener.DatoCoche(nombre);
        System.out.println("El Coche es: " + obtener.incrementarContador());
    }

}

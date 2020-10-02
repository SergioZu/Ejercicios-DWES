/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_De_Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author serzu
 */
public class ConsultaDatos {

    List<String> listadoCoches;

    public ConsultaDatos() {
        listadoCoches = new ArrayList<>();
    }

    public void consultaFichero(String nombre) throws FileNotFoundException, IOException {
        String linea;

        File fichero = new File("D://Daw//Ejercicios Java//Ejercicio1 DWES//Coches.txt");

        BufferedReader lector = new BufferedReader(new FileReader(fichero));

        while ((linea = lector.readLine()) != null) {
            if (linea.contains(nombre)) {
                descomponerCoches(linea);
            }
        }
    }

    public void descomponerCoches(String linea) {
        String[] arrayPersona = linea.split("-");
        listadoCoches.add(arrayPersona[1]);
    }

    public List<String> getListadoCoches() {
        return listadoCoches;
    }

}

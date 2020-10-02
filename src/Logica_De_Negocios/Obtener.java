/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica_De_Negocios;

import Acceso_De_Datos.ConsultaDatos;
import java.io.IOException;

/**
 *
 * @author serzu
 */
public class Obtener {

    ConsultaDatos consultaDatos;

    public Obtener() {

    }

    public void DatoCoche(String nombre) throws IOException {
        consultaDatos = new ConsultaDatos();
        consultaDatos.consultaFichero(nombre);

    }

    public int incrementarContador() {

        return consultaDatos.getListadoCoches().size();
    }

}

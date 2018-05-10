/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesCine;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Milton
 */
public class Pelicula {
    private int añoEstreno;
    private boolean disponible;
    private float duracion;
    private Date fechaIngreso;
    private String nombre;
    private String tituloOriginal; 
    
    //relaciones
    private List<Personaje> personajes;
    private PaisDeOrigen pais;
    private Genero genero;
    private Calificacion calificacion;
    private Funcion funciones;
}

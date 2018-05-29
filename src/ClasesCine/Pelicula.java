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
    private int anioEstreno;
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
    
    
    //ctor
    public void Pelicula(int unAnio, boolean disponible, float unaDuracion,Date unaFecha, String unNombre, String unTitulo)
    {
        this.anioEstreno = unAnio;
        this.disponible = disponible;
        this.duracion = unaDuracion;
        this.nombre = unNombre;
        this.tituloOriginal = unTitulo;
        this.fechaIngreso = unaFecha;
    }
}

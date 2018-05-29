/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesCine;

import java.util.Date;

/**
 *
 * @author Milton
 */
public class Cine {
    private String direccion;
    private Date fechaInauguracion;
    private String nombre;
    private float precioEntrada;
    
    //Relaciones
    private Sala salas;
    private Programacion programaciones;
    private HorarioFuncion horarios;
    
    //constructor
    public void Cine (String unaDireccion, Date unaFecha, String unNombre, float unPrecio)
    {
        this.direccion = unaDireccion;
        this.fechaInauguracion = unaFecha;
        this.nombre = unNombre;
        this.precioEntrada = unPrecio;
    }
}

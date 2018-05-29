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
public class Funcion {
    private int numero;
    private String diaSemana;
    private int duracion;
    private Date horaInicio;
    
    //Relaciones
    private Pelicula pelicula;
    private TipoFuncion tipo;
    private Entrada entradas;
    private Sala sala;
    private Programacion programacion;
    
    
    //Constructor
    public void Funcion (int unNumero, String unDia, int unaDuracion, Date unaHora)
    {
        this.diaSemana = unDia;
        this.numero = unNumero;
        this.duracion = unaDuracion;
        this.horaInicio = unaHora;
    }
}

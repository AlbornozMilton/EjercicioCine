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
public class Programacion {
    private Date fechaFin;
    private Date fechaHoraCreada;
    private Date fechaInicio;
    
    
    //ctor
    public void Programacion(Date unaFechaInicio, Date unaFechaFin, Date unDateCreacion)
    {
        this.fechaInicio = unaFechaInicio;
        this.fechaFin = unaFechaFin;
        this.fechaHoraCreada = unDateCreacion;
    }
}

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
public class Entrada {
    private int ticketNro;
    private TipoEntrada tipo;
    private Date fechaHoraFuncion;
    private Date fechaHoraVenta;
    private float precioCobrado;
    
    //Constructor
    public void Entrada(int unNro, TipoEntrada unTipo, Date unDateFuncion, Date unDateVenta, float unPrecio)
    {
        this.ticketNro = unNro;
        this.tipo = unTipo;
        this.fechaHoraFuncion = unDateFuncion;
        this.fechaHoraVenta = unDateVenta;
        this.precioCobrado = unPrecio;
    }
}

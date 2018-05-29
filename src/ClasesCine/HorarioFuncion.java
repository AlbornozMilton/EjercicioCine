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
public class HorarioFuncion {
    private String diaDeSemana;
    private int duracionIntervalo;
    private int duracionPublicidad;
    private boolean esTrasnoche;
    private Date horaPrimeraFuncion;
    private Date horaUltimaFuncion;
    
    
    //ctor
    public void HorarioFuncion (String unDia, int unaDuracIntervalo, int unaDuracPublicidad, boolean esTrasnoche, Date unaHoraPrimera, Date unaHoraUltima)
    {
       this.diaDeSemana = unDia;
       this.duracionIntervalo = unaDuracIntervalo;
       this.duracionPublicidad = unaDuracPublicidad;
       this.esTrasnoche = esTrasnoche;
       this.horaPrimeraFuncion = unaHoraPrimera;
       this.horaUltimaFuncion = unaHoraUltima; 
    }
}

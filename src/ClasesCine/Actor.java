/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesCine;

/**
 *
 * @author Milton
 */
public class Actor {
    private boolean animado;
    private String apellido;
    private String nombre;
    private Sexo sexo;
    
    
    //constructor
    public void Actor (String unNombre, String unApellido, Sexo unSexo, boolean animado)
    {
        this.nombre = unNombre;
        this.apellido = unApellido;
        this.sexo = unSexo;
        this.animado = animado;
    }
}

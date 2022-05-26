/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.prestamos.objects;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public abstract class Prestamo {
   private Double monto;
   private Integer cantidadCuotas;
   private ArrayList<Cuota> cuotas;
   private Persona persona;
   
   // cargar el arraylist de cuotas con los datos correspondientes
   // a cada tipo de prestamos
   public abstract void generarCuotas();
   
   // Mostrar el monto de cada cuotas del prestamo
   public abstract void mostrarCuotas();

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
   
    
}

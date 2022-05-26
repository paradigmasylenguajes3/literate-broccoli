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
public class PrestamoFijo extends Prestamo{

    @Override
    public void generarCuotas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarCuotas() {
        ArrayList<Cuota> cuotas = this.getCuotas();
        
       cuotas.stream().forEach((c)->{
           System.out.println(c.getMonto());
           System.out.println("Nurmero de cuota"+c.getDescripcion());
        }); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

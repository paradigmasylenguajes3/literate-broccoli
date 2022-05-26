/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.prestamos.objects;

/**
 *
 * @author Administrador
 */
class Cuota {
    private Double capitalAdeudado;
    private Double interes;
    private Double monto;
    private String descripcion;

    public Double getCapitalAdeudado() {
        return capitalAdeudado;
    }

    public void setCapitalAdeudado(Double capitalAdeudado) {
        this.capitalAdeudado = capitalAdeudado;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return this.descripcion; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

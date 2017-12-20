/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LEARNING CENTER
 */
public class Venta {
    private int id;
    private String fechaContratacion;
    private String fechaTerminoOp;
    private String fechaTerminoCon;
    private int tipoVenta;
    private int valorFecha;
    private String rut;

    public Venta() {
    }

    public Venta(int id, String fechaContratacion, String fechaTerminoOp, String fechaTerminoCon, int tipoVenta, int valorFecha, String rut) {
        this.id = id;
        this.fechaContratacion = fechaContratacion;
        this.fechaTerminoOp = fechaTerminoOp;
        this.fechaTerminoCon = fechaTerminoCon;
        this.tipoVenta = tipoVenta;
        this.valorFecha = valorFecha;
        this.rut = rut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getFechaTerminoOp() {
        return fechaTerminoOp;
    }

    public void setFechaTerminoOp(String fechaTerminoOp) {
        this.fechaTerminoOp = fechaTerminoOp;
    }

    public String getFechaTerminoCon() {
        return fechaTerminoCon;
    }

    public void setFechaTerminoCon(String fechaTerminoCon) {
        this.fechaTerminoCon = fechaTerminoCon;
    }

    public int getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(int tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public int getValorFecha() {
        return valorFecha;
    }

    public void setValorFecha(int valorFecha) {
        this.valorFecha = valorFecha;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", fechaContratacion=" + fechaContratacion + ", fechaTerminoOp=" + fechaTerminoOp + ", fechaTerminoCon=" + fechaTerminoCon + ", tipoVenta=" + tipoVenta + ", valorFecha=" + valorFecha + ", rut=" + rut + '}';
    }
    
    
}

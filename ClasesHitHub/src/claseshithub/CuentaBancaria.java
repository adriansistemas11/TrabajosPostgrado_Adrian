/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package claseshithub;

import java.util.Date;

/**
 *
 * @author
 */
public class CuentaBancaria {
    
    Date fechaApertura;
    long idCuentaBancaria;
    String numeroCuenta;
    
    TipoCuenta tipoCuenta;
    Cliente cliente;

    public CuentaBancaria() {
    }

    public CuentaBancaria(Date fechaApertura, long idCuentaBancaria, String numeroCuenta, TipoCuenta tipoCuenta, Cliente cliente) {
        this.fechaApertura = fechaApertura;
        this.idCuentaBancaria = idCuentaBancaria;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public long getIdCuentaBancaria() {
        return idCuentaBancaria;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public void setIdCuentaBancaria(long idCuentaBancaria) {
        this.idCuentaBancaria = idCuentaBancaria;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    
    
}

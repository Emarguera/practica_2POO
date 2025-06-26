/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bancoapp.model;

import java.util.Objects;

/**
 *
 * @author Emarguera
 */
public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, Cliente cliente, double tasaInteres) {
        super(numeroCuenta, cliente);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "numeroCuenta='" + getNumeroCuenta() + '\'' +
                ", saldo=" + getSaldo() +
                ", cliente=" + getCliente() +
                ", tasaInteres=" + tasaInteres +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CuentaAhorro)) return false;
        CuentaAhorro other = (CuentaAhorro) obj;
        return Objects.equals(this.getNumeroCuenta(), other.getNumeroCuenta());
    }
}
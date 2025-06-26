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
public abstract class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private Cliente cliente;

    public CuentaBancaria(String numeroCuenta, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CuentaBancaria)) return false;
        CuentaBancaria other = (CuentaBancaria) obj;
        return Objects.equals(this.numeroCuenta, other.numeroCuenta);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bancoapp.model;

import com.bancoapp.interfaces.Identificable;
import com.bancoapp.interfaces.Registrable;

import java.util.Objects;

/**
 *
 * @author Emarguera
 */
public class CuentaAhorro extends CuentaBancaria implements Identificable, Registrable {

    public CuentaAhorro(String numeroCuenta, Cliente cliente) {
        super(numeroCuenta, cliente);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CuentaAhorro)) return false;
        CuentaAhorro other = (CuentaAhorro) obj;
        return Objects.equals(this.getNumeroCuenta(), other.getNumeroCuenta());
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "numeroCuenta='" + getNumeroCuenta() + '\'' +
                ", saldo=" + getSaldo() +
                ", cliente=" + getCliente().getNombre() +
                '}';
    }

    @Override
    public String obtenerIdentificador() {
        return this.getNumeroCuenta();
    }

    @Override
    public void registrar() {
        System.out.println("Cuenta registrada: " + this);
    }

    @Override
    public void eliminar() {
        System.out.println("Cuenta eliminada: " + this.getNumeroCuenta());
    }

    @Override
    public void listar() {
        System.out.println(this);
    }
}
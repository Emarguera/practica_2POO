/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bancoapp.model;

import com.bancoapp.interfaces.Identificable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emarguera
 */
public class SistemaBanco {
    private List<Cliente> clientes;
    private List<CuentaAhorro> cuentas;

    public SistemaBanco() {
        this.clientes = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }

    // ---------- CLIENTES ----------

    public boolean agregarCliente(Cliente cliente) {
        for (Cliente c : clientes) {
            if (c.obtenerIdentificador().equals(cliente.obtenerIdentificador())) {
                return false; // Ya existe
            }
        }
        clientes.add(cliente);
        return true;
    }

    public Cliente buscarCliente(String id) {
        for (Cliente c : clientes) {
            if (c.obtenerIdentificador().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public boolean eliminarCliente(String id) {
        Cliente encontrado = buscarCliente(id);
        if (encontrado != null) {
            clientes.remove(encontrado);
            return true;
        }
        return false;
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    // ---------- CUENTAS DE AHORRO ----------

    public boolean agregarCuenta(CuentaAhorro cuenta) {
        for (CuentaAhorro c : cuentas) {
            if (c.obtenerIdentificador().equals(cuenta.obtenerIdentificador())) {
                return false; // Ya existe
            }
        }
        cuentas.add(cuenta);
        return true;
    }

    public CuentaAhorro buscarCuenta(String numeroCuenta) {
        for (CuentaAhorro c : cuentas) {
            if (c.obtenerIdentificador().equals(numeroCuenta)) {
                return c;
            }
        }
        return null;
    }

    public boolean eliminarCuenta(String numeroCuenta) {
        CuentaAhorro encontrada = buscarCuenta(numeroCuenta);
        if (encontrada != null) {
            cuentas.remove(encontrada);
            return true;
        }
        return false;
    }

    public List<CuentaAhorro> listarCuentas() {
        return cuentas;
    }
}
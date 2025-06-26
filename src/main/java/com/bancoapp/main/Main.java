/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bancoapp.main;

import com.bancoapp.model.Cliente;
import com.bancoapp.model.CuentaAhorro;
import com.bancoapp.model.SistemaBanco;

/**
 *
 * @author Emarguera
 */
public class Main {
    public static void main(String[] args) {
        SistemaBanco banco = new SistemaBanco();

        // Crear un cliente
        Cliente cliente1 = new Cliente("C001", "Esteban Ruiz", "esteban@correo.com");
        cliente1.registrar(); // método de la interfaz Registrable

        // Agregar cliente al sistema
        boolean clienteAgregado = banco.agregarCliente(cliente1);
        if (clienteAgregado) {
            System.out.println("Cliente agregado correctamente.");
        } else {
            System.out.println("El cliente ya existe.");
        }

        // Crear cuenta de ahorro para ese cliente
        CuentaAhorro cuenta1 = new CuentaAhorro("CA12345", cliente1);
        cuenta1.setSaldo(500.00);
        cuenta1.registrar(); // método de la interfaz Registrable

        // Agregar cuenta al sistema
        boolean cuentaAgregada = banco.agregarCuenta(cuenta1);
        if (cuentaAgregada) {
            System.out.println("Cuenta agregada correctamente.");
        } else {
            System.out.println("La cuenta ya existe.");
        }

        // Listar todos los clientes y cuentas
        System.out.println("\nClientes registrados:");
        for (Cliente c : banco.listarClientes()) {
            c.listar();
        }

        System.out.println("\nCuentas registradas:");
        for (CuentaAhorro c : banco.listarCuentas()) {
            c.listar();
        }
    }
}

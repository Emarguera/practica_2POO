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
public class Cliente implements Identificable, Registrable {
    private String id;
    private String nombre;
    private String correo;

    public Cliente(String id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cliente)) return false;
        Cliente other = (Cliente) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    @Override
    public String obtenerIdentificador() {
        return this.id;
    }

    // Métodos de la interfaz Registrable (implementación básica de ejemplo)
    @Override
    public void registrar() {
        System.out.println("Cliente registrado: " + this);
    }

    @Override
    public void eliminar() {
        System.out.println("Cliente eliminado: " + this.id);
    }

    @Override
    public void listar() {
        System.out.println(this);
    }
}
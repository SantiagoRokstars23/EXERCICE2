/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise2_programation;

/**
 *
 * @author sgrue
 */
public abstract class Vehiculo {

    protected int velocidadActual;
    protected int velocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void imprimir() {
        System.out.println("Velocidad Actual: " + velocidadActual + " | Velocidad Máxima: " + velocidadMaxima);
    }

    public abstract void acelerar(int velocidad);

    public abstract void frenar(int velocidad);
}

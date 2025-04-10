/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise2_programation;

/**
 *
 * @author sgrue
 */
public class Acuatico extends Vehiculo implements Vela, Motor {

    public Acuatico(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }

    @Override
    public double calcularRevolucionesMotor(int fuerza, int radio) {
        return (double) fuerza / radio;
    }

    @Override
    public int recomendarVelocidad(int velocidadViento) {
        return velocidadViento < 20 ? 40 : 25;
    }

    @Override
    public void acelerar(int velocidad) {
        velocidadActual += velocidad;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    @Override
    public void frenar(int velocidad) {
        velocidadActual -= velocidad;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }
}

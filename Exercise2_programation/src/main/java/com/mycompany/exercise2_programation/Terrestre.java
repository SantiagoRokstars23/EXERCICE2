/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise2_programation;

/**
 *
 * @author sgrue
 */
public class Terrestre extends Vehiculo implements Motor {

    public Terrestre(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }

    @Override
    public double calcularRevolucionesMotor(int fuerza, int radio) {
        return (double) fuerza / radio;
    }

}

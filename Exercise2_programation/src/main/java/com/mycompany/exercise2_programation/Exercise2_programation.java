/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercise2_programation;

import javax.swing.JOptionPane;

/**
 *
 * @author sgrue
 */
public class Exercise2_programation {

    public static void main(String[] args) {

        String[] opciones = {"Terrestre", "Acuático"};
        String tipoVehiculo = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de vehículo:",
                "Tipo de Vehículo", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        int velocidadActual = Integer.parseInt(JOptionPane.showInputDialog("Velocidad actual:"));
        int velocidadMaxima = 0;
        Vehiculo vehiculo;

        if (tipoVehiculo.equalsIgnoreCase("Terrestre")) {
            velocidadMaxima = Integer.parseInt(JOptionPane.showInputDialog("Velocidad máxima:"));
            vehiculo = new Terrestre(velocidadActual, velocidadMaxima);

            int fuerza = Integer.parseInt(JOptionPane.showInputDialog("Fuerza del motor:"));
            int radio = Integer.parseInt(JOptionPane.showInputDialog("Radio del motor:"));
            double revoluciones = ((Terrestre) vehiculo).calcularRevolucionesMotor(fuerza, radio);
            JOptionPane.showMessageDialog(null, "Revoluciones del motor: " + revoluciones);
        } else {
            velocidadMaxima = Integer.parseInt(JOptionPane.showInputDialog("Velocidad máxima:"));
            vehiculo = new Acuatico(velocidadActual, velocidadMaxima);

            int fuerza = Integer.parseInt(JOptionPane.showInputDialog("Fuerza del motor:"));
            int radio = Integer.parseInt(JOptionPane.showInputDialog("Radio del motor:"));
            int viento = Integer.parseInt(JOptionPane.showInputDialog("Velocidad del viento:"));

            double revoluciones = ((Acuatico) vehiculo).calcularRevolucionesMotor(fuerza, radio);
            int recomendacion = ((Acuatico) vehiculo).recomendarVelocidad(viento);

            JOptionPane.showMessageDialog(null,
                    "Revoluciones del motor: " + revoluciones + "\nVelocidad recomendada: " + recomendacion);
        }

        vehiculo.imprimir();
    }
}

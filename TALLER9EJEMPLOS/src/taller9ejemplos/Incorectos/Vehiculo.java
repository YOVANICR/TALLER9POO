/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9ejemplos.Incorectos;

/**
 *
 * @author yoven
 */

public class Vehiculo {
    protected String tipo;

    
    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    // Método para mostrar el tipo de vehículo
    public void mostrarTipo() {
        System.out.println("Tipo de vehiculo: " + tipo);
    }
}

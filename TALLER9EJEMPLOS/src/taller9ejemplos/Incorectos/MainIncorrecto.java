/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9ejemplos.Incorectos;

/**
 *
 * @author yoven
 */
// Clase Main
public class MainIncorrecto {
    public static void main(String[] args) {
        // No se puede usar super aquí porque Main no hereda de Planta
        // super.tipo = "Orquídea";  // Esto genera un error de compilación
        System.out.println("No se puede usar super fuera de una clase derivada.");
    }
}

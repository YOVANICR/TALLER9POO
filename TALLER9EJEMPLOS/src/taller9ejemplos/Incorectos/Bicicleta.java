/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9ejemplos.Incorectos;

/**
 *
 * @author yoven
 */

public class Bicicleta extends Vehiculo {

    
    public Bicicleta(String tipo) {
        super(tipo);  // Llama al constructor de la clase base
    }

    // Método sobrescrito para mostrar el tipo de bicicleta
    @Override
    public void mostrarTipo() {
        super.mostrarTipo();  // Llama al método de la clase base (innecesario aquí)
        System.out.println("Este es un tipo de bicicleta.");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9ejemplos.Correctos;

/**
 *
 * @author yoven
 */


// Clase base Animal
public class Animal {
    protected String especie;

   
    public Animal(String especie) {
        this.especie = especie;
    }

    // Método para mostrar la especie del animal
    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}

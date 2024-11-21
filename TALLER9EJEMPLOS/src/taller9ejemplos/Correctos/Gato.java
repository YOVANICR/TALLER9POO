/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9ejemplos.Correctos;

/**
 *
 * @author yoven
 */

public class Gato extends Animal {
    private String color;

    // Constructor que inicializa especie usando super y color
    public Gato(String especie, String color) {
        super(especie);  // Llama al constructor de la clase base
        this.color = color;
    }

    // Sobrescribe el método para mostrar la especie e incluye el color del gato
    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();  // Llama al método de la clase base
        System.out.println("Color: " + color);
    }
}

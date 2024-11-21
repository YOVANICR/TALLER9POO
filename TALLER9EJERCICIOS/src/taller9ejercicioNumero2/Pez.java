/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9ejercicioNumero2;

/**
 *
 * @author yoven
 */

public class Pez extends Animal {
    private String tipoDeAgua;

    // Constructor que inicializa especie y tipoDeAgua
    public Pez(String especie, String tipoDeAgua) {
        super(especie);  // Llama al constructor de Animal
        this.tipoDeAgua = tipoDeAgua;
    }

    // Método sobrescrito para mostrar más detalles, incluyendo el tipo de agua
    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();  // Llama al método de Animal
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}

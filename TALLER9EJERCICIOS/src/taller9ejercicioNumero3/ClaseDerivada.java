/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9ejercicioNumero3;

/**
 *
 * @author yoven
 */

// Clase derivada que intenta acceder al atributo privado
public class ClaseDerivada extends ClaseBase {


    public ClaseDerivada(String atributo) {
        super(atributo);  // Llama al constructor de ClaseBase
    }

    public void mostrarAtributo() {
        // Error: No se puede acceder al atributo privado de la clase base
        // System.out.println(super.atributoPrivado);
        System.out.println("No se puede acceder a un atributo privado con super.");
    }
}

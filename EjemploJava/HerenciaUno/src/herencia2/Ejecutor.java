/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudiantePresencial;
import herencia1.EstudianteDistancia;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        //
        EstudiantePresencial e1 = new EstudiantePresencial();
        e1.establecerNombresEstudiante("Joe");
        e1.establecerApellidoEstudiante("Churo");
        e1.establecerIdentificacionEstudiante("1104479231");
        e1.establecerEdadEstudiante(18);
        e1.establecerNumeroCreditos(30);
        e1.establecerCostoCredito(15);
        e1.calcularMatriculaPresencial();
        System.out.printf("Nombre: %s\n"
                + "Apellido: %S\n"
                + "Identificacion: %s\n"
                + "Edad: %d\n"
                + "Numero de Creditos: %d\n"
                + "Costo de Creditos: %.2f\n"
                + "Costo Matricula: %.2f\n",
                e1.obtenerNombresEstudiante(),
                e1.obtenerApellidoEstudiante(),
                e1.obtenerIdentificacionEstudiante(),
                e1.obtenerEdadEstudiante(),
                e1.obtenerNumeroCreditos(),
                e1.obtenerCostoCredito(),
                e1.obtenerMatriculaPresencial());
    }
}

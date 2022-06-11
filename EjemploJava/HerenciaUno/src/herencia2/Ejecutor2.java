/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        EstudianteDistancia e1 = new EstudianteDistancia();
        
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        e1.establecerNombresEstudiante(nombre);
        System.out.println("Ingrese el apelldio: ");
        String apellido = sc.nextLine();
        e1.establecerApellidoEstudiante(apellido);
        System.out.println("Ingrese la identificacion: ");
        String identificacion = sc.nextLine();
        e1.establecerIdentificacionEstudiante(identificacion);
        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();
        e1.establecerEdadEstudiante(edad);
        System.out.println("Ingrese el numero de asignaturas");
        int nAsignaturas = sc.nextInt();
        e1.establecerNumeroAsginaturas(nAsignaturas);
        System.out.println("Ingrese el costo de las asignaturas");
        double cMatricula = sc.nextDouble();
        e1.establecerCostoAsignatura(cMatricula);
        e1.calcularMatriculaDistancia();
        
        System.out.println("\n------------------\n");
        
        System.out.printf("%s",e1);
    }
   
}

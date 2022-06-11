/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.Estudiante;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("     DESEA INGRESAR");
        System.out.println("1. Estudiante Distancia");
        System.out.println("2. Estudiante Presencial");
        int opcion = sc.nextInt();
        sc.nextLine();
        System.out.println("___________________________________________________");
        if (opcion == 1 || opcion == 2) {
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el apelldio: ");
            String apellido = sc.nextLine();
            System.out.println("Ingrese la identificacion: ");
            String identificacion = sc.nextLine();
            System.out.println("Ingrese la edad: ");
            int edad = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (opcion == 1) {
                        EstudianteDistancia ed = new EstudianteDistancia();
                        System.out.println("Ingrese el numero de asignaturas: ");
                        int nAsignaturas = sc.nextInt();
                        ed.establecerNumeroAsginaturas(nAsignaturas);
                        System.out.println("Ingrese el costo de las asignaturas: ");
                        double cMatricula = sc.nextDouble();
                        ed.establecerCostoAsignatura(cMatricula);
                        ed.calcularMatriculaDistancia();
                        ed.establecerNombresEstudiante(nombre);
                        ed.establecerApellidoEstudiante(apellido);
                        ed.establecerIdentificacionEstudiante(identificacion);
                        ed.establecerEdadEstudiante(edad);
                        System.out.println("___________________________________________________");
                        System.out.printf("\n%s", ed);
                    }
                    break;
                case 2:
                    if (opcion == 2) {
                        EstudiantePresencial ep = new EstudiantePresencial();
                        System.out.println("Ingrese el numero de creditos: ");
                        int nCreditos = sc.nextInt();
                        ep.establecerNumeroCreditos(nCreditos);
                        System.out.println("Ingrese el costo del credito: ");
                        double cCredito = sc.nextDouble();
                        ep.establecerCostoCredito(cCredito);
                        ep.calcularMatriculaPresencial();
                        ep.establecerNombresEstudiante(nombre);
                        ep.establecerApellidoEstudiante(apellido);
                        ep.establecerIdentificacionEstudiante(identificacion);
                        ep.establecerEdadEstudiante(edad);
                        System.out.printf("\n%s", ep);
                        System.out.println("___________________________________________________");

                    }
                    break;
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA I
 */
public class Vehiculo {
    private String tipo;
    private String matricula;
    private double costo;
    
    public Vehiculo(String t, String m, double c){
        tipo = t;
        matricula = m;
        costo = c;
    }
    public void establecerTipo(String a){
    tipo = a;
    }
    public void establecerMatricula(String a){
    matricula = a;
    }
    public void establecerCostoVehiculo(double a){
    costo = a;
    }
    public String obtenerTipo(){
    return tipo;
    }
    public String obtenerMatricula(){
    return matricula;
    }
    public double obtenerCostoVehiculo(){
    return costo;
    }
    @Override
    public String toString(){
    String cars = String.format("Tipo: %s\nMatricula: %s\nCosto: %.2f", 
            tipo, 
            matricula, 
            costo);
    return cars;
    }
}

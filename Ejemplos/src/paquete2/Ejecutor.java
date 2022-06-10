/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Edificio edf1 = new Edificio("Edificio Central");
        edf1.establecerCostos(20000);

        Edificio edf2 = new Edificio("Edificio Norte");
        edf2.establecerCostos(30000);

        Edificio edf3 = new Edificio("Edificio Sur");
        edf3.establecerCostos(10000);

        Edificio edf4 = new Edificio("Edificio Secundario");
        edf4.establecerCostos(5000);

        Edificio[] listaEdificios = {edf1, edf2, edf3, edf4};
        
        Empresa miempresa = new Empresa();
        miempresa.establecerNombre("Empresa de Hojas");
        miempresa.establecerEdificios(listaEdificios);
        miempresa.establecerCostoBienesInmuebles();
        
        Vehiculo v1 = new Vehiculo("Auto","LBB0011",10000);
        Vehiculo v2 = new Vehiculo("Camioneta","LCB0011",20000);
        Vehiculo v3 = new Vehiculo("Auto","LBD0012", 6000);
        Vehiculo v4 = new Vehiculo("Camioneta","LBC0011", 6000);
        Vehiculo v5 = new Vehiculo("Camioneta","LBC0011", 6000);
        
        Vehiculo[] listaVehiclulos = {v1, v2, v3, v4, v5};
        miempresa.establecerVehiculos(listaVehiclulos);
        miempresa.establecerCostoTotalBienes();
        
        System.out.printf("%s/n",miempresa);
        
    }
}

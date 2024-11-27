/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listas;

/**
 *
 * @author camper
 */
public class Listas {

    public static void main(String[] args) {
        ListaDoble <Double> listaDobles = new ListaDoble <>();
        listaDobles.agregarInicio(10.0); 
        ListaDoble <Integer> listaEntero = new ListaDoble<>();
        listaEntero.agregarInicio(80);
        listaEntero.agregarInicio(40);
        listaEntero.agregarInicio(12);
        listaEntero.mostrarOrden();
        listaEntero.mostrarTamano();
        listaEntero.mostrarInverso();
        System.out.println("Prueba del nuevo metodo");
        listaEntero.agregarFinal(14);
        listaEntero.agregarFinal(25); 
        listaEntero.agregarFinal(76);
        listaEntero.mostrarOrden();
        listaEntero.mostrarInverso();
        listaEntero.mostrarTamano();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package campuslands.listas;

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
    }
}

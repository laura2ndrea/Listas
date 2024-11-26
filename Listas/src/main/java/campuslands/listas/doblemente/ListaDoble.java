/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campuslands.listas.doblemente;

/**
 *
 * @author camper
 */
public class ListaDoble {
    private Nodo<T> cabeza; 
    private int tamano; 
    
    public ListaDoble() {
        this.cabeza = null; 
        this.tamano = 0; 
    }
    
    public void mostrarTamano(){
        System.out.println(tamano);
    }
    
    public void mostrarOrden(){
        Nodo <T> actual = cabeza; 
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente(); 
        }
        System.out.println();
    }
    
    public void mostrarInverso(){
        Nodo <T> actual = cabeza; 
        while (actual != null && actual.getSiguiente() != null){
            actual = actual.getSiguiente(); 
        }
        
        
        
    }
    
    public void agregarInicio(T dato){
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza != null){
            cabeza.setAnterior(nuevoNodo);
            nuevoNodo.setSiguiente(cabeza);
        }
        cabeza = nuevoNodo; 
        tamano +=1; 
    }
}

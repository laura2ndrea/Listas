/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campuslands.listas.doblemente;

/**
 *
 * @author camper
 */
public class Nodo<T> {
    T dato; 
    Nodo<T> siguiente; 
    Nodo<T> anterior; 
    
    public Nodo(T dato){
        this.dato = dato; 
        this.siguiente = null; 
        this.anterior = null; 
    }
    
    public T getDato() {
        return dato;
    }
    
    public void setDato (T dato){
        this.dato = dato; 
    }
    
    public Nodo<T> getSiguiente(){
        return siguiente; 
    }
    
    public void setSiguiente (Nodo<T> siguiente){
        this.siguiente = siguiente; 
    }
    
    public Nodo<T> getAnterior(){
        return anterior; 
    }
    
    public void setAnterior (Nodo<T> anterior){
        this.anterior = anterior; 
    }
}

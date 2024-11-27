package com.mycompany.listas;

public class ListaDoble<T> {
    private Nodo<T> cabeza; 
    private int tamano; 
    
    public ListaDoble() {
        this.cabeza = null; 
        this.tamano = 0; 
    }
    
    // Método para mostrar el tamaño de la lista 
    public void mostrarTamano(){
        System.out.println(tamano);
    }
    
    // Método para mostrar la lista en orden
    public void mostrarOrden(){
        Nodo <T> actual = cabeza; 
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente(); 
        }
        System.out.println();
    }
    
    // Método para mostrar la lista en orden inverso 
    public void mostrarInverso(){
        Nodo <T> actual = cabeza; 
        // Para recorrer hasta llegar al último nodo
        while (actual != null && actual.getSiguiente() != null){
            actual = actual.getSiguiente(); 
        }
        while (actual != null){
            System.out.print(actual.getDato() + " ");
            actual = actual.getAnterior();
        }
        System.out.println();
    }
    
    // Método para agregar elementos al inicio de la lista
    public void agregarInicio(T dato){
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza != null){
            cabeza.setAnterior(nuevoNodo);
            nuevoNodo.setSiguiente(cabeza);
        }
        cabeza = nuevoNodo; 
        tamano +=1; 
    }
    
    // Método para agregar elementos al final de la lista 
    public void agregarFinal (T dato){
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        Nodo<T> actual= cabeza;
        while (actual != null && actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nuevoNodo);
        nuevoNodo.setAnterior(actual);
        tamano +=1;  
    }
    
    // Método para agregar elementos en un posición especifica 
    public void agregarPosicion (T dato, int posicion){
        // Validación que la posición es válida 
        if (posicion < 0){
            throw new IndexOutOfBoundsException("La posición no es válida");
        }
        // Para agregar en la posición 0 usamos el método agregarInicio()
        if (posicion == 0){
            agregarInicio(dato);
            return;
        }
        else {
            Nodo<T> nuevoNodo = new Nodo<>(dato);
            int mitad = (int) tamano / 2; 
            // Comprobar si la posición esta más cerca del inicio o de la mitad
            if (posicion <= mitad){
                Nodo<T> actual = cabeza; 
                int contador = 0; 
                while (actual != null && posicion < contador - 1){
                    actual = actual.getSiguiente();
                    contador++;
                }
            } else {
                //
            }
        }
//        int mitad = (int) tamano / 2; 
//        if (posicion <= mitad){
//            Nodo<T> actual = cabeza;
//            int contador = 0; 
//            while (actual != null){
//                if (posicion == contador){
//                    actual.setAnterior(nuevoNodo);
//                    nuevoNodo.setSiguiente(actual);
//                }
//            }
//        }
        
    }
    
    // Método para buscar un elemento por su posición
    
    // Método para buscar un elemento por su valor
    
    // Método para eliminar un elemento por su posición
    
    // Método para eliminar un elemento por su valor
    
    // Método para modificar un elemento por su posición 
    
    // Método para modificar un elemento por su valor 

}

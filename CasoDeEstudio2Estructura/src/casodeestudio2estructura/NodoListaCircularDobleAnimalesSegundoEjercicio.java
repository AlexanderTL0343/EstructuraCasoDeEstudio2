/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio2estructura;

/**
 *
 * @author alext
 */
public class NodoListaCircularDobleAnimalesSegundoEjercicio {

    private AnimalListaCircularDobleAnimalesSegundoEjercicio dato;
    private NodoListaCircularDobleAnimalesSegundoEjercicio anterior;
    private NodoListaCircularDobleAnimalesSegundoEjercicio siguiente;

    public NodoListaCircularDobleAnimalesSegundoEjercicio(AnimalListaCircularDobleAnimalesSegundoEjercicio dato) {
        this.dato = dato;
    }

    public AnimalListaCircularDobleAnimalesSegundoEjercicio getDato() {
        return dato;
    }

    public void setDato(AnimalListaCircularDobleAnimalesSegundoEjercicio dato) {
        this.dato = dato;
    }

    public NodoListaCircularDobleAnimalesSegundoEjercicio getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaCircularDobleAnimalesSegundoEjercicio anterior) {
        this.anterior = anterior;
    }

    public NodoListaCircularDobleAnimalesSegundoEjercicio getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaCircularDobleAnimalesSegundoEjercicio siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}
    


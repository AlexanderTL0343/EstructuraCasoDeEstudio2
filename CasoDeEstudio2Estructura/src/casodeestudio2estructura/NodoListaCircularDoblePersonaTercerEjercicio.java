/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio2estructura;

/**
 *
 * @author alext
 */
public class NodoListaCircularDoblePersonaTercerEjercicio {
    private PersonaListaCircularDoblePersonaTercerEjercicio dato;
    private NodoListaCircularDoblePersonaTercerEjercicio anterior;
    private NodoListaCircularDoblePersonaTercerEjercicio siguiente;

    public NodoListaCircularDoblePersonaTercerEjercicio(PersonaListaCircularDoblePersonaTercerEjercicio dato) {
        this.dato = dato;
    }

    public PersonaListaCircularDoblePersonaTercerEjercicio getDato() {
        return dato;
    }

    public void setDato(PersonaListaCircularDoblePersonaTercerEjercicio dato) {
        this.dato = dato;
    }

    public NodoListaCircularDoblePersonaTercerEjercicio getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaCircularDoblePersonaTercerEjercicio anterior) {
        this.anterior = anterior;
    }

    public NodoListaCircularDoblePersonaTercerEjercicio getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaCircularDoblePersonaTercerEjercicio siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}
    


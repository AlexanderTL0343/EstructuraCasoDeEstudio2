/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio2estructura;

/**
 *
 * @author alext
 */
public class NodoListaPrimerEjercicio {

    private DatoListaPrimerEjercicio dato;
    private NodoListaPrimerEjercicio siguiente;

    public NodoListaPrimerEjercicio(DatoListaPrimerEjercicio dato) {
        this.dato = dato;
    }

    public DatoListaPrimerEjercicio getDato() {
        return dato;
    }

    public void setDato(DatoListaPrimerEjercicio dato) {
        this.dato = dato;
    }

    public NodoListaPrimerEjercicio getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaPrimerEjercicio siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return this.dato.toString();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio2estructura;

/**
 *
 * @author alext
 */
public class ListaCircularDobleAnimalesSegundoEjercicio {
    
    private NodoListaCircularDobleAnimalesSegundoEjercicio cabeza;
    private NodoListaCircularDobleAnimalesSegundoEjercicio ultimo;

    public void inserta(AnimalListaCircularDobleAnimalesSegundoEjercicio p) {
        //Paso 1, de la presentación
        if (cabeza == null) {
            cabeza = new NodoListaCircularDobleAnimalesSegundoEjercicio(p);
            ultimo = cabeza;
            cabeza.setAnterior(ultimo);
            cabeza.setSiguiente(ultimo);
            ultimo.setSiguiente(cabeza);
            ultimo.setAnterior(cabeza);
        } else {
            //Paso 2, de la presentación
            if (cabeza.getDato().getId() > p.getId()) {
                NodoListaCircularDobleAnimalesSegundoEjercicio aux = new NodoListaCircularDobleAnimalesSegundoEjercicio(p);
                aux.setSiguiente(cabeza);
                cabeza.setAnterior(aux);
                cabeza = aux;
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);

            } else {
                //Paso 3, de la presentación
                if (p.getId() > ultimo.getDato().getId()) {
                    NodoListaCircularDobleAnimalesSegundoEjercicio aux = new NodoListaCircularDobleAnimalesSegundoEjercicio(p);
                    aux.setAnterior(ultimo);
                    ultimo.setSiguiente(aux);
                    ultimo = aux;
                    ultimo.setSiguiente(cabeza);
                    cabeza.setAnterior(ultimo);
                } else {
                    //Paso 4, de la presentación

                    NodoListaCircularDobleAnimalesSegundoEjercicio aux = cabeza.getSiguiente();
                    while (aux.getDato().getId() < p.getId()) {
                        aux = aux.getSiguiente();
                    }

                    NodoListaCircularDobleAnimalesSegundoEjercicio temp = new NodoListaCircularDobleAnimalesSegundoEjercicio(p);
                    temp.setAnterior(aux.getAnterior());
                    temp.setSiguiente(aux); //Acá aux.getAnterior está apuntando (en su siguiente) a aux
                    aux.setAnterior(temp);
                    temp.getAnterior().setSiguiente(temp);

                    
                }
            }
        }
    }
    public void SiguienteSiguienteDelNodo(int id) {
       
    } 

    @Override
    public String toString() {
        String respuesta = "Lista doble circular: \n";

        if (cabeza != null) {
            NodoListaCircularDobleAnimalesSegundoEjercicio aux = cabeza;

            respuesta += aux.toString() + "\n";

            aux = aux.getSiguiente();

            while (aux != cabeza) {
                respuesta += aux.toString() + "\n";
                aux = aux.getSiguiente();
            }
        } else {
            respuesta += "Vacía";
        }

        return respuesta;
    }
    
}

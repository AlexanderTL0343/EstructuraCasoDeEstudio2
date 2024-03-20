/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio2estructura;

/**
 *
 * @author alext
 */
public class ListaPrimerEjercicio {

    private NodoListaPrimerEjercicio cabeza;

    public void insertar(DatoListaPrimerEjercicio p) {
        //1. La lista está vacía.
        if (cabeza == null) //Lista vacía
        {
            //Cualquier elemento que insertemos se va a convertir en la cabeza
            cabeza = new NodoListaPrimerEjercicio(p);
        } else {
            //2.
            //La persona a insertar tiene un id menor al que
            //referencia la cabeza (el primero y menor de la lista),
            //por lo que se debe insertar a la izquierda de la cabeza.
            //Aquí el id de la persona es menor a el id de la cabeza
            if (p.getCedula() < cabeza.getDato().getCedula()) {
                //Entonces inserto el nuevo elemento en la cabeza
                NodoListaPrimerEjercicio auxiliar = new NodoListaPrimerEjercicio(p);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
            } else {
                //3.
                //La lista sólo tiene un elemento y se debe insertar la
                //nueva persona a la derecha de la cabeza.
                //Aquí el id de la persona es mayor al id de la cabeza
                if (cabeza.getSiguiente() == null) {
                    NodoListaPrimerEjercicio nuevo = new NodoListaPrimerEjercicio(p);
                    //cabeza.setSiguiente(new Nodo(p));
                    cabeza.setSiguiente(nuevo);
                } else {
                    //4.
                    //Si no se tienen las condiciones anteriores entonces se
                    //debe insertar en el medio o al final de la lista.
                    NodoListaPrimerEjercicio auxiliar = cabeza;
                    while (auxiliar.getSiguiente() != null
                            && auxiliar.getSiguiente().getDato().getCedula() < p.getCedula()) {
                        auxiliar = auxiliar.getSiguiente();
                    }

                    NodoListaPrimerEjercicio otroAuxiliar = new NodoListaPrimerEjercicio(p); //Vamos a almacenar el nodo nuevo, 
                    //para mantener las referencias
                    otroAuxiliar.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(otroAuxiliar);
                }
            }
        }
    }

    public void eliminarSegunOrden(int cedula) {
        NodoListaPrimerEjercicio auxiliar = cabeza;
        NodoListaPrimerEjercicio anterior = null;

        while (auxiliar != null) {
            if (auxiliar.getDato().getCedula() == cedula) {
                //Aquí eliminamos
                if (auxiliar == cabeza) {
                    cabeza = cabeza.getSiguiente();
                    auxiliar.setSiguiente(null);
                    break;
                } else {
                    anterior.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(null);
                    break;
                }
            } else {
                //No encontramos el dato a eliminar
                anterior = auxiliar;
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }

    @Override
    public String toString() {
        NodoListaPrimerEjercicio auxiliar = cabeza;
        String respuesta = "Lista: \n";

        while (auxiliar != null) {
            respuesta += auxiliar.toString() + "\n";
            auxiliar = auxiliar.getSiguiente();
        }

        return respuesta;
    }

}

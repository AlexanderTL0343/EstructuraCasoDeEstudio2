/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio2estructura;

/**
 *
 * @author alext
 */
public class ListaCircularDoblePersonaTercerEjercicio {
     private NodoListaCircularDoblePersonaTercerEjercicio cabeza;
    private NodoListaCircularDoblePersonaTercerEjercicio ultimo;

    public void inserta(PersonaListaCircularDoblePersonaTercerEjercicio p) {
        //Paso 1, de la presentación
        if (cabeza == null) {
            cabeza = new NodoListaCircularDoblePersonaTercerEjercicio(p);
            ultimo = cabeza;
            cabeza.setAnterior(ultimo);
            cabeza.setSiguiente(ultimo);
            ultimo.setSiguiente(cabeza);
            ultimo.setAnterior(cabeza);
        } else {
            //Paso 2, de la presentación
            if (cabeza.getDato().getId() > p.getId()) {
                NodoListaCircularDoblePersonaTercerEjercicio aux = new NodoListaCircularDoblePersonaTercerEjercicio(p);
                aux.setSiguiente(cabeza);
                cabeza.setAnterior(aux);
                cabeza = aux;
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);

            } else {
                //Paso 3, de la presentación
                if (p.getId() > ultimo.getDato().getId()) {
                    NodoListaCircularDoblePersonaTercerEjercicio aux = new NodoListaCircularDoblePersonaTercerEjercicio(p);
                    aux.setAnterior(ultimo);
                    ultimo.setSiguiente(aux);
                    ultimo = aux;
                    ultimo.setSiguiente(cabeza);
                    cabeza.setAnterior(ultimo);
                } else {
                    //Paso 4, de la presentación

                    NodoListaCircularDoblePersonaTercerEjercicio aux = cabeza.getSiguiente();
                    NodoListaCircularDoblePersonaTercerEjercicio auxi = ultimo.getAnterior();
                    while (aux.getDato().getId() < p.getId() && auxi.getDato().getId() > p.getId()) {
                        aux = aux.getSiguiente();
                        auxi = auxi.getAnterior();
                    }
                    if(aux.getDato().getId() < p.getId()== true && auxi.getDato().getId() > p.getId() == false){

                    NodoListaCircularDoblePersonaTercerEjercicio temp = new NodoListaCircularDoblePersonaTercerEjercicio(p);
                    temp.setAnterior(aux.getAnterior());
                    temp.setSiguiente(aux); //Acá aux.getAnterior está apuntando (en su siguiente) a aux
                    aux.setAnterior(temp);
                    temp.getAnterior().setSiguiente(temp);
                    }else{
                        if(aux.getDato().getId() < p.getId()== false && auxi.getDato().getId() > p.getId() == true){

                    NodoListaCircularDoblePersonaTercerEjercicio r = new NodoListaCircularDoblePersonaTercerEjercicio(p);
                    r.setSiguiente(auxi.getSiguiente());
                    r.setAnterior(auxi); //Acá aux.getSiguente está apuntando (en su anterior) a auxi
                    auxi.setSiguiente(r);
                    r.getSiguiente().setAnterior(r);
                        }
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        String respuesta = "Lista doble circular: \n";

        if (cabeza != null) {
            NodoListaCircularDoblePersonaTercerEjercicio aux = cabeza;

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
    


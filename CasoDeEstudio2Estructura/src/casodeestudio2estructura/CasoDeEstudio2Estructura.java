/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casodeestudio2estructura;

/**
 *
 * @author alext
 */
public class CasoDeEstudio2Estructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1 Pruebas

        ListaPrimerEjercicio lista1 = new ListaPrimerEjercicio();
        lista1.insertar(new DatoListaPrimerEjercicio("Fernado", "Kennedy", 01262007, 1));
        lista1.insertar(new DatoListaPrimerEjercicio("Alfonso", "Gutierez", 02242006, 2));
        lista1.insertar(new DatoListaPrimerEjercicio("Santiago", "Quesada", 03012005, 3));
        lista1.insertar(new DatoListaPrimerEjercicio("Alexander", "Torres", 04152005, 4));
        lista1.insertar(new DatoListaPrimerEjercicio("Jordy", "Wild", 04102002, 5));

        System.out.println(lista1.toString());
        //imprimimos la lista con el eliminado
        lista1.eliminarSegunOrden(3);

        System.out.println(lista1.toString());

        // pruebas Ejecicio 2
        ListaCircularDobleAnimalesSegundoEjercicio l = new ListaCircularDobleAnimalesSegundoEjercicio();

        l.inserta(new AnimalListaCircularDobleAnimalesSegundoEjercicio("Leon", 1, 2005));
        System.out.println(l.toString());

        l.inserta(new AnimalListaCircularDobleAnimalesSegundoEjercicio("Gato", 2, 2006));
        System.out.println(l.toString());

        l.inserta(new AnimalListaCircularDobleAnimalesSegundoEjercicio("Perro", 3, 2007));
        System.out.println(l.toString());

        l.inserta(new AnimalListaCircularDobleAnimalesSegundoEjercicio("Tiburon", 4, 2008));
        System.out.println(l.toString());

        l.inserta(new AnimalListaCircularDobleAnimalesSegundoEjercicio("Avestruz", 5, 2009));
        System.out.println(l.toString());

        l.inserta(new AnimalListaCircularDobleAnimalesSegundoEjercicio("Pez Globo", 6, 2010));
        System.out.println(l.toString());
        
        


        //prubas 3 ejercicio
        ListaCircularDoblePersonaTercerEjercicio L2 = new ListaCircularDoblePersonaTercerEjercicio();

        L2.inserta(new PersonaListaCircularDoblePersonaTercerEjercicio("Santiago", 1));
        System.out.println(L2.toString());

        L2.inserta(new PersonaListaCircularDoblePersonaTercerEjercicio("Fernado", 3));
        System.out.println(L2.toString());

        L2.inserta(new PersonaListaCircularDoblePersonaTercerEjercicio("Jordy", 4));
        System.out.println(L2.toString());

        L2.inserta(new PersonaListaCircularDoblePersonaTercerEjercicio("Alfonso", 2));
        System.out.println(L2.toString());

        L2.inserta(new PersonaListaCircularDoblePersonaTercerEjercicio("Alexander", 8));
        System.out.println(L2.toString());

        L2.inserta(new PersonaListaCircularDoblePersonaTercerEjercicio("Esteban", 6));
        System.out.println(L2.toString());

        L2.inserta(new PersonaListaCircularDoblePersonaTercerEjercicio("Ignacio", 7));
        System.out.println(L2.toString());

        L2.inserta(new PersonaListaCircularDoblePersonaTercerEjercicio("Justin", 5));
        System.out.println(L2.toString());

        L2.inserta(new PersonaListaCircularDoblePersonaTercerEjercicio("Jeremy", 9));
        System.out.println(L2.toString());

        L2.inserta(new PersonaListaCircularDoblePersonaTercerEjercicio("Hector", 10));
        System.out.println(L2.toString());

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio2estructura;

/**
 *
 * @author alext
 */
public class AnimalListaCircularDobleAnimalesSegundoEjercicio {

    private String nombre;
    private int id;
    private int fechaDeNacimiento;

    public AnimalListaCircularDobleAnimalesSegundoEjercicio() {
    }

    public AnimalListaCircularDobleAnimalesSegundoEjercicio(String nombre, int id, int fechaDeNacimiento) {
        this.nombre = nombre;
        this.id = id;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return this.nombre + " - " + this.fechaDeNacimiento + " - " + this.id;
    }

}

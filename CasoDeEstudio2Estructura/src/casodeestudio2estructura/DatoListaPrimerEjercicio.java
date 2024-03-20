/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio2estructura;

/**
 *
 * @author alext
 */
public class DatoListaPrimerEjercicio {

    private String nombre;
    private String apellido;
    private int FechaDeNacimiento;
    private int cedula;

    // se crea un constructor para que sea mas facil anadir los  atributos a la hora de generar la cola
    public DatoListaPrimerEjercicio(String nombre, String apellido, int FechaDeNacimiento, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechaDeNacimiento = FechaDeNacimiento;
        this.cedula = cedula;
    }

    //Se crean los setters and getters para la accesar la infirmacion del codigo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " " + FechaDeNacimiento + " " + cedula;
    }

}

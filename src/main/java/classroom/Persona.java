package classroom;

import javax.swing.*;

public class Persona {

    long cedula=1;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        //cedula = 3;
    }
    public Persona(){
        this.cedula=0;
    }
    public Persona(final long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre,final long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(final long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

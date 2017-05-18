/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public abstract class Usuarios {
    
    private String nombre;
    private String apellido;
    private ArrayList<Compradores>compra;
    private ArrayList<Artistas>artistas;
    
    public void agregarArtista(Artistas a){
        this.artistas.add(a);
    }
    public void agregarComprador(Compradores c){
        this.compra.add(c);
    }
    public Usuarios(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

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
 
}

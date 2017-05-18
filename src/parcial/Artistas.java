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
public abstract class Artistas extends Usuarios{
   private String info;
      private String distinciones;
      private ArrayList<Obras>obras;


     public Artistas(String info, String distinciones, String nombre, String apellido) {
        super(nombre, apellido);
        this.info=info;
        this.distinciones=distinciones;
        this.obras= new ArrayList<>();
    }
     public void agregarObra(Obras ob){
         this.obras.add(ob);
     }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDistinciones() {
        return distinciones;
    }

    public void setDistinciones(String distinciones) {
        this.distinciones = distinciones;
    }

   
  
    
}

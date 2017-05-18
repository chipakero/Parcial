/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Estudiante
 */
public class Compradores extends Usuarios{
     private String coleccion;
    private String obra_interesada;

    public Compradores(String coleccion, String obra_interesada, String nombre, String apellido) {
      
        this.coleccion = coleccion;
        this.obra_interesada = obra_interesada;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public String getObra_interesada() {
        return obra_interesada;
    }

    public void setObra_interesada(String obra_interesada) {
        this.obra_interesada = obra_interesada;
    }

}

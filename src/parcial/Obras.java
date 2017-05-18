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
public class Obras {
     private String nom_obra;
    private String descripcion;
    private String estilo;
    private double valor;

    public Obras(String nom_obra, String descripcion, String estilo, double valor) {
        this.nom_obra = nom_obra;
        this.descripcion = descripcion;
        this.estilo = estilo;
        this.valor = valor;
    }

    public String getNom_obra() {
        return nom_obra;
    }

    public void setNom_obra(String nom_obra) {
        this.nom_obra = nom_obra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
   
}

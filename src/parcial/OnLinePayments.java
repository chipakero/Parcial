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
public class OnLinePayments {

    public OnLinePayments(String tipo_pago, boolean validacion) {
        this.tipo_pago = tipo_pago;
        this.validacion = validacion;
        this.compradores=new ArrayList<>();
    }
    public void agregarcomprador(Compradores co){
        this.compradores.add(co);
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public boolean isValidacion() {
        return validacion;
    }

    public void setValidacion(boolean validacion) {
        this.validacion = validacion;
    }
    private String tipo_pago;
    private boolean validacion;
    private ArrayList<Compradores> compradores;
}

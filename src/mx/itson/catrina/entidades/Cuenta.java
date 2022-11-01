/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;
import com.google.gson.Gson;
import java.util.List;

/**
 * Aqui se tienes todo los metodos de cuenta.
 * @author Angel Fierros
 */

public class Cuenta {

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
   private String producto; 
   private Cliente cliente;
   private String cuenta;
   private String clabe;
   private String moneda;
   private List<Movimientos> movimientos;
   public Cuenta deserealizar(String json){
    Cuenta c = new Cuenta();   
   try{
        c = new Gson().fromJson(json, Cuenta.class);
       
       
   }catch(Exception ex){
     
       System.out.print("Ocurrio un error: " + ex.getMessage());
   }
   return c;
   }
  

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public List<Movimientos> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimientos> movimientos) {
        this.movimientos = movimientos;
    }

    
   
   
   
   
}

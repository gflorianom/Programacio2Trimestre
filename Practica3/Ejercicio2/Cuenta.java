/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author Tarda
 */
public class Cuenta {

  private  String IBAN="1532648G";
  private  Double saldo;
  private Titular propietario;
    
    public Cuenta() {
        
    }

    public Cuenta(String IBAN, Double saldo, String nombre, String apellidos, String dni) {
        this.IBAN = IBAN;
        this.saldo = saldo;
        ponerTitular(nombre, apellidos, dni);
    }
    public void ponerTitular(String nombre, String apellidos, String dni){
     this.propietario=new Titular(nombre, apellidos, dni);
}
    public void ingresarSaldo (double saldo){
        this.saldo += saldo;
    }
    public double mostrarSaldo(){            
           return this.saldo;        
    }
    public double retirarSaldo (double saldo){
        if (this.saldo <saldo){
            System.out.println("Saldo insuficiente. Transacción cancelada D:>");
        }
        else{
            this.saldo=this.saldo-saldo;
        }
        return this.saldo;
    }
    
    public String numeroCuenta(){
        return "El número de cuenta es :" +IBAN;
    }
    
    public String getNombreTitular(){
        return propietario.getNombre();
    }
    
    public String getApellidosTitular(){
        return propietario.getApellidos();
    }
    
    public String getDniTitular(){
        return propietario.getDni();
    }
    
    

}

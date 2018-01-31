/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;
import java.util.Scanner;

/**
 *
 * @author Tarda
 */
public class Titular {
    
    String nombre;
    String apellidos;
    String dni;
    Scanner sc = new Scanner(System.in);

    public Titular(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public String getDni(){
        return dni;
    }
    
}

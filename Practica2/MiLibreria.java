/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraybidimensional;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ISA
 */
public class MiLibreria {
    
    public MiLibreria() {
    }
    
    public int leerEntero() {
        Scanner sc = new Scanner(System.in);
        int valor;
        valor=sc.nextInt();
        return valor;
    }

    public String leerString(){
        Scanner sc=new Scanner(System.in);
        String valor;
        valor=sc.nextLine();
        return valor;
    }
    
    public void mostrarMensaje(String mensaje){
        String sms=mensaje;
        System.out.println(sms);
    }

}

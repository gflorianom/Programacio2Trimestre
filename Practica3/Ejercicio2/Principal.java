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
public class Principal {

    private int opcion;
    private boolean salir = true;
    Scanner sc = new Scanner(System.in);
    Cuenta c;
    private String nombre, apellidos, dni;
    private double saldo;

    public Principal() {
        try {
            do {
                menu();
                tratarMenu();

            } while (salir);
        } catch (Exception e) {//control de errores del menú
            System.out.println("No has introducido ninguna opción válida");
        }

    }

    private void menu() {
        System.out.println("Introduce una opción para acceder al programa deseado");
        System.out.println("1.Crear cuenta");
        System.out.println("2.Mostrar el nombre del titular de la cuenta");
        System.out.println("3.Mostrar los apellidos del titular de la cuenta");
        System.out.println("4.Mostrar el dni del titular de la cuenta");
        System.out.println("5.Mostrar el saldo disponible");
        System.out.println("6.Ingresar saldo");
        System.out.println("7.Retirar saldo");
        System.out.println("8.Salir");
        System.out.println();
    }

    private void tratarMenu() {
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Introduce el nombre del titular");
                nombre=sc.next();
                System.out.println("Introduce el apellido del titular");
                apellidos=sc.next();
                System.out.println("Introduce el dni del titular");
                dni=sc.next();
                System.out.println();
                
                c= new Cuenta("123456789",saldo,nombre,apellidos,dni);
                
                break;
            case 2:
                System.out.println("El nombre del titular de la cuenta es: " +c.getNombreTitular());
                break;
            case 3:
                System.out.println("El apellido del titular de la cuenta es: " + c.getApellidosTitular());
                break;
            case 4:
                System.out.println("El dni del titular es: " + c.getDniTitular());
                break;
            case 5:
                System.out.println(c.mostrarSaldo());
                break;
            case 6:
                System.out.println("Introduce la cantidad de saldo que deseas añadir a tu cuenta: ");
                saldo=sc.nextDouble();
                c.ingresarSaldo(saldo);
                break;
            case 7:
                System.out.println("Introduce la cantidad de saldo que deseas retirar de tu cuenta: ");
                saldo=sc.nextDouble();
                c.retirarSaldo(saldo);
                break;
            case 8:
                salir = false;//con esta booleana el programa finaliza
                break;
            default:
                System.out.println("No has introducido un valor válido");
                break;
        }

    }

}

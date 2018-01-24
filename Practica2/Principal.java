/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraybidimensional;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ISA
 */
public class Principal {
    private int opcion;
    private boolean salir = true;
    private MiLibreria mi = new MiLibreria();
    public Principal(){
        
        try{
            do{
                menu();
                tratarMenu();
            }while (salir);
            
            }catch(Exception p){
                mi.mostrarMensaje("No has introducido un valor válido");
        }
    }
    private void menu() {
        mi.mostrarMensaje("Introduce la opción deseada");
        mi.mostrarMensaje("1. Ejercicio1: Crear una tabla bidimensional de tamaño 5x5 \n"
+ "y rellenarla de la siguiente forma: la posición T[n,m] debe contener n+m\n");
        mi.mostrarMensaje("2. Ejercicio2: Crear y cargar una tabla de tamaño 4x4 y decir \n"
+ "si es simétrica o no, es decir, si se obtiene la misma tabla al cambiar filas por columnas.\n");
        mi.mostrarMensaje("3. Ejercicio3: Crear y cargar dos matrices de tamaño 3x3, sumarlas y \n"
+ "mostrar su suma.\n");
        mi.mostrarMensaje("4. Ejercicio4: Crear una tabla de tamaño 7x7 y rellenarla de forma que \n"
+ "los elementos de la diagonal principal sean 1 y el resto 0. \n");
        mi.mostrarMensaje("5. Ejercicio5: Crear una matriz “marco” de tamaño 8x6: todos sus elementos \n"
+ "deben ser 0 salvo los de los bordes que deben ser 1. Mostrar la matriz.\n");
        mi.mostrarMensaje("6. Ejercicio6: Crear una matriz “marco” cuyo tamaño se pedirá al usuario por \n"
+ "teclado. Todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1. Mostrar la matriz. \n");
        mi.mostrarMensaje("7. Salir");
    }
    private void tratarMenu(){
        
        opcion=mi.leerEntero();
                switch(opcion){
                    case 1:
                        Ejercicio1();
                        break;
                    case 2:
                        Ejercicio2();
                        break;
                    case 3:
                        Ejercicio3();
                        break;
                    case 4:
                        Ejercicio4();
                        break;
                    case 5:
                        Ejercicio5();
                        break;
                    case 6:
                        Ejercicio6();
                        break;
                    case 7:
                        salir = false;
                        break;
                    default:
                        mi.mostrarMensaje("No has introducido un valor válido");
                        break;
                }
        }
    
    private void Ejercicio1() {
        int[][] num = new int[5][5];
        Scanner num1=new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {//Dimensión Uno.
            for (int j = 0; j < num.length; j++) {//Dimensión Dos.
                mi.mostrarMensaje("Introduce un numero: ");
                num[i][j]=num1.nextInt() +(i+j);              
            }            
        }
        System.out.println("La tabla queda de la siguiente forma:");
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                  System.out.print(num[i][j] + " ");              
            }            
        }
        mi.mostrarMensaje(" ");
    }
    
    private void Ejercicio2() {
        int[][] num = new int[4][4];
        boolean simetrico;
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese los números.");
        for (int i = 0; i < num.length; i++) {//Dimensión Uno.
            for (int j = 0; j < num.length; j++) {//Dimensión Dos.
                  System.out.print("["+i+"]"+"["+j+"]"+"=");
                  num[i][j]=numero.nextInt();              
            }            
        }
        System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                  System.out.print(num[i][j] + " ");              
            }            
        }
        System.out.println("\nComprobando Simetria.");
        simetrico = true;
        int control = num.length -1;
        int i=0;
        while (i < control && simetrico == true) {            
            int j=0;
            while (j < control && simetrico == true) {                
                if(num[i][j] != num[j][i]){
                    simetrico = false;
                }
                j++;
            }
          i++;
        }
        if(simetrico){
            System.out.println("La tabla resulta Simétrica.");
        }
        else{
            System.out.println("La tabla no es Simétrica.");
        }
        System.out.println (" ");
    }
    
    private void Ejercicio3() {
        int[][] numUno = new int[3][3];
        int[][] numDos = new int[3][3];
        Scanner numero = new Scanner(System.in);
        System.out.println("Cargando Tabla Uno.");
        for (int i = 0; i < numUno.length; i++) {//Dimensión Uno.
            for (int j = 0; j < numUno.length; j++) {//Dimensión Dos.
                System.out.print("["+i+"]"+"["+j+"]"+"=");
                numUno[i][j]=numero.nextInt();              
            }            
        }
        System.out.println("Cargando Tabla Dos.");
        for (int i = 0; i < numDos.length; i++) {//Dimensión Uno.
            for (int j = 0; j < numDos.length; j++) {//Dimensión Dos.
                System.out.print("["+i+"]"+"["+j+"]"+"=");  
                numDos[i][j]=numero.nextInt();              
            }            
        }
        System.out.println("Imprimiendo Tabla Uno.");
        for (int i = 0; i < numUno.length; i++) {
            System.out.println();
            for (int j = 0; j < numUno.length; j++) {
                  System.out.print(numUno[i][j] + " ");              
            }            
        }
        System.out.println("\nImprimiendo Tabla Dos.");
        for (int i = 0; i < numDos.length; i++) {
            System.out.println();
            for (int j = 0; j < numDos.length; j++) {
                  System.out.print(numDos[i][j] + " ");              
            }            
        }
        int[][] suma = new int[3][3];
        System.out.println("\nSumando las dos Tablas.");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma.length; j++) {
                  suma[i][j]=  numUno[i][j] + numDos[i][j];            
            }            
        }
        System.out.println("\nImprimiendo Suma.");
        for (int i = 0; i < suma.length; i++) {
            System.out.println();
            for (int j = 0; j < suma.length; j++) {
                  System.out.print(suma[i][j] + " ");              
            }            
        }
        System.out.println (" ");
    }
    
    private void Ejercicio4() {
        int[][] matriz = new int[7][7];
        int fila;
         
        //Relleno la diagonal principal con 1
        //Solo tengo que recorrer las casillas en las que el número de fila es
        //igual que el número de columna:  matriz[0][0]=matriz[1][1]...=matriz[6][6]=1
        for (fila=0 ; fila < matriz.length ; fila++){
            matriz[fila][fila]=1;                           
        }
         
        //Muestro las filas de la matriz haciendo uso de la libreria "Arrays"
        for (fila=0 ; fila < matriz.length ; fila++){
            System.out.println(Arrays.toString(matriz[fila]));
        }
        System.out.println (" ");
    }
    
    private void Ejercicio5() {
        int i,j; //i=columna j=fila
        int t[][]; //tabla

        t = new int[8][6]; // se inicializa toda la tabla a 0.
        // rellenamos la matriz marco
        for (i=0;i<8;i++){
            for (j=0;j<6;j++) {
                if(i==0 || i==7 || j==0 || j==5){ // si nos encontramos en la primera o última columna, o fila
                    t[i][j]=1;
                }
            }
        }

        mi.mostrarMensaje("Asi queda la tabla: ");
        for (i=0;i<8;i++){
            System.out.println();
            for (j=0;j<6;j++){
                System.out.print(t[i][j]+" ");
            }
        }
        System.out.println (" ");
    }
    
    private void Ejercicio6() {
        int i,j;
        Scanner entrada=new Scanner(System.in);
        mi.mostrarMensaje("¿Cuantas filas tendrá la tabla?");
        int f=entrada.nextInt();
        mi.mostrarMensaje("¿Cuantas columnas tendrá la tabla?");
        int c=entrada.nextInt();
        int [][] num=new int[f][c];
        
        for (i=0;i<f;i++){
            for (j=0;j<c;j++) {
                if(i==0 || i==f-1 || j==0 || j==c-1){ // si nos encontramos en la primera o última columna, o fila
                    num[i][j]=1;
                }
            }
        }

        mi.mostrarMensaje("Así queda tu tabla: ");
        for (i=0;i<f;i++){
            System.out.println();
            for (j=0;j<c;j++){
                System.out.print(num[i][j]+" ");
            }
        }
        System.out.println (" ");
    }
}
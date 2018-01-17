/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrays;

import java.util.ArrayList;
import java.util.Collections;
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
        mi.mostrarMensaje("1. Ejercicio1: 5 numeros en orden\n");
        mi.mostrarMensaje("2. Ejercicio2: 5 numeros en orden inverso\n");
        mi.mostrarMensaje("3. Ejercicio3: Media Negativos, Positivos y Ceros\n");
        mi.mostrarMensaje("4. Ejercicio4: 10 numeros en orden: el primero, el\n" +
"último, el segundo, el penúltimo, el tercero, etc.\n");
        mi.mostrarMensaje("5. Ejercicio5: 2 listas de 10 numeros y una tercera\n" +
"en orden: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.\n");
        mi.mostrarMensaje("6. Ejercicio6: 2 listas de 12 numeros y una tercera\n" +
"3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.\n");
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
        Scanner reader = new Scanner(System.in);
        int numero = 0;
        mi.mostrarMensaje("Introduce 5 numeros");
        ArrayList listaNum=new ArrayList();
        for (int i=0; i<5; i++){
            numero = reader.nextInt();
            mi.mostrarMensaje("Introduce siguiente numero");
            listaNum.add(numero);
        }
        mi.mostrarMensaje("Tu lista es:"+listaNum);
        
        mi.mostrarMensaje(" ");
    }
    
    private void Ejercicio2() {
        Scanner reader = new Scanner(System.in);
        int numero = 0;
        mi.mostrarMensaje("Introduce 5 numeros");
        ArrayList listaNum=new ArrayList();
        for (int i=0; i<5; i++){
            numero = reader.nextInt();
            mi.mostrarMensaje("Introduce siguiente numero");
            listaNum.add(numero);
        }
        mi.mostrarMensaje("Tu lista en orden inverso es:");
        Collections.reverse(listaNum);
        System.out.println(listaNum);
        
        mi.mostrarMensaje(" ");
    }
    
    private void Ejercicio3() {
        int num[]=new int [5];
        double SumaPositivo=0;
        double SumaNegativo=0;
        int SumaNegativoCont=0;
        int SumaPositivoCont=0;
        int ceros=0;
        double MediaPositivo=0;
        double MediaNegativo=0;
        Scanner numero=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            mi.mostrarMensaje("Introduce un número");
            num[i]=numero.nextInt();
        }
        for(int i=0; i<num.length; i++){
            if(num[i]>0){
                SumaPositivo += num[i];
                SumaPositivoCont++;
            }else if(num[i]<0){
                SumaNegativo += num[i];
                SumaNegativoCont++;
            }else if(num[i]==0){
                ceros++;
            }
            MediaPositivo=SumaPositivo/SumaPositivoCont;
            MediaNegativo=SumaNegativo/SumaNegativoCont;
        
        }
        mi.mostrarMensaje("Media de positivos: " +MediaPositivo+ " Media de negativos " +MediaNegativo+ " Cantidad de ceros: " +ceros);
        
        mi.mostrarMensaje(" ");
    }
    
    private void Ejercicio4() {
        int num[]=new int [10];
        Scanner numero=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            System.out.println("Introduce un número");
            num[i]=numero.nextInt();
        }
        System.out.println("En el array, el primer número es: " +num[0]+ " el último es "+num[9]+ " el segundo es "+num[1]+" el penúltimo es "+num[8]+" el tercero es "+num[2]);   
        
        mi.mostrarMensaje(" ");
    }
    
    private void Ejercicio5() {
        Scanner teclado=new Scanner(System.in);
        int lista[], lista2[], listaFinal[];
        int contador1, contador2;
        lista=new int[10];
        lista2=new int[10];
        // la tabla c tendrá que tener el doble de tamaño que a y b.
        listaFinal = new int [20];
        // leemos la tabla a
        System.out.println("Leyendo la primera tabla:");
        for (contador1=0;contador1<10;contador1++){
            System.out.print("número: ");
            lista[contador1]=teclado.nextInt();
        }
        // leemos la tabla b
        System.out.println("Leyendo la segunda tabla:");
        for (contador1=0;contador1<10;contador1++){
            System.out.print("número: ");
            lista2[contador1]=teclado.nextInt();
        }
        // asignaremos los elementos de la tabla c
        // para las tablas a y b utilizaremos como índice i
        // y para la tabla c utilizaremos como índice j.
        contador2=0;
        contador1=0;
        while (contador1<10){
        // copiamos 1 de a
            for (int k=0;k<1; k++){
                listaFinal[contador2]=lista[contador1+k];
                contador2++;
            }
            // copiamos 1 de b
            for (int k=0;k<1;k++){
                listaFinal[contador2]=lista2[contador1+k];
                contador2++;
            }
            // como hemos copiado 1 de a y b, incrementamos la i en 1.
            contador1+=1;
            // la j se incrementa cada vez que se añade un elemento a la tabla c.
        }
        System.out.println("La tercera tabla queda: ");
        for (contador2=0;contador2<20;contador2++) // seguimos utilizando j, para la tabla c. Aunque se podría utilizar i.
        System.out.print(listaFinal[contador2]+" ");
        
        mi.mostrarMensaje(" ");
    }
    
    private void Ejercicio6() {
        Scanner teclado=new Scanner(System.in);
        int lista[], lista2[], listaFinal[];
        int contador1, contador2;
        lista=new int[12];
        lista2=new int[12];
        // la tabla c tendrá que tener el doble de tamaño que a y b.
        listaFinal = new int [24];
        // leemos la tabla a
        System.out.println("Leyendo la primera tabla:");
        for (contador1=0;contador1<12;contador1++){
            System.out.print("número: ");
            lista[contador1]=teclado.nextInt();
        }
        // leemos la tabla b
        System.out.println("Leyendo la segunda tabla:");
        for (contador1=0;contador1<12;contador1++){
            System.out.print("número: ");
            lista2[contador1]=teclado.nextInt();
        }
        // asignaremos los elementos de la tabla c
        // para las tablas a y b utilizaremos como índice i
        // y para la tabla c utilizaremos como índice j.
        contador2=0;
        contador1=0;
        while (contador1<12){
        // copiamos 3 de a
            for (int k=0;k<3; k++){
                listaFinal[contador2]=lista[contador1+k];
                contador2++;
            }
            // copiamos 3 de b
            for (int k=0;k<3;k++){
                listaFinal[contador2]=lista2[contador1+k];
                contador2++;
            }
            // como hemos copiado 1 de a y b, incrementamos la i en 3.
            contador1+=3;
            // la j se incrementa cada vez que se añade un elemento a la tabla c.
        }
        System.out.println("La tercera tabla queda: ");
        for (contador2=0;contador2<24;contador2++) // seguimos utilizando j, para la tabla c. Aunque se podría utilizar i.
        System.out.print(listaFinal[contador2]+" ");
        
        mi.mostrarMensaje(" ");
    }
    
    
}


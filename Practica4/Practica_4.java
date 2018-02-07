
package Practica_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Practica_4 {

        public static void main(String[]args){
            
            Scanner read = new Scanner(System.in);
            Coleccion lista = new Coleccion();
            int opcion = 0;
            do{
                System.out.println("");
                System.out.println("===========MENU==========");
                System.out.println("=   1. Añadir libro     =");
                System.out.println("=   2. Prestar libro    =");
                System.out.println("=   3. Devolver libro   =");
                System.out.println("=   4. Mostrar libro    =");
                System.out.println("=   5. Localizar libro  =");
                System.out.println("=   6. Salir            =");
                System.out.println("=========================");
                System.out.println("Selecciona una opción: "); 
                opcion = read.nextInt();
                System.out.println("");
                
                switch (opcion){
                    case 1://AÑADIR LIBRO
                        Scanner añadir = new Scanner(System.in);                        
                        Libro libro_nuevo = new Libro();
                        System.out.println("Introduce los datos del libro que deseas añadir: ");                       
                        libro_nuevo.añadir_libro();
                        lista.addBook(libro_nuevo);
                        System.out.println("");
                        //System.out.println(lista+("/"));//PRINTEAR LOS LIBROS
                        System.out.println("");
                        System.out.println("===============LIBRO===============");
                        System.out.println(" Titulo: "+libro_nuevo.getTitulo());
                        System.out.println(" Nombre: "+libro_nuevo.getAutor());
                        System.out.println(" Nª Ejemplares: "+libro_nuevo.getEjem_libro());
                        System.out.println(" Nª Ejemplares Disponibles: "+libro_nuevo.getEjem_prestado());
                        System.out.println("");
                        break;
                        
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5://LOCALIZAR LIBRO
                        lista.localizarLibro();                      
                        break;
                    default:
                         System.out.println("Volver Atras.");
                }
            }while (opcion < 7);
        }
}


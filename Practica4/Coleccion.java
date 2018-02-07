
package Practica_4;

import java.util.ArrayList;
import java.util.Scanner;


public class Coleccion {
    int ejemTotales;
    int ejemPrestados;
    ArrayList<Libro> libros = new ArrayList<>();
    
    //CONSTRUCTOR POR DEFECTO
    public Coleccion (){
    }
    
    //CONSTRUCTOR COPIA
    public Coleccion(final Coleccion copia) {
        ejemTotales = copia.ejemTotales;
        ejemPrestados = copia.ejemPrestados;
    }
    
    //SETTERS
    public void setEjemTotales(int ejemTotales) {
        this.ejemTotales = ejemTotales;
    }

    public void setEjemPrestados(int ejemPrestados) {
        this.ejemPrestados = ejemPrestados;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    //GETTERS
    public int getEjemTotales() {
        return ejemTotales;
    }

    public int getEjemPrestados() {
        return ejemPrestados;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
    
    public void addBook (Libro libro){
        libros.add(libro);
    }
    
    //METODOS
    
    //LOCALIZAR LIBRO
    public void localizarLibro(){
        Scanner localizar = new Scanner(System.in);
        System.out.println("Como se llama el libro que quieres buscar: ");
        String buscar = localizar.nextLine();
        Boolean bookExists = false;
        for(Libro libro : libros){
            if (buscar.equals(libro.getTitulo())){
               bookExists = true;
               System.out.println("Existe"); 
               System.out.println("El ISBN del libro es: "+libro.getIsbn());
            }else{
                bookExists = false;
            }                              
        }                       
    }

    private Object libro(String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

   

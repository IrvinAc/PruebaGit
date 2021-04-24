/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad1;

/**
 *
 * @author Irvin
 */
public class Basica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animales objeto = new Animales (5, "patos", "Hombre", 9.43, " Pekin");
        objeto.Saludar();
        
        objeto.getEdad();
        objeto.getGenero();
        objeto.getRaza();
        objeto.getPeso();
        String nombreAnimal = objeto.getNombre();
        
    }
    
}

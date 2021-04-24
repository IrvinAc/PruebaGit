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
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar objeto
       Animal datos = new Animal();
        datos.edad=3;
        datos.nombre="mamut";
        datos.peso=5000;
        datos.Saludar();
        datos.getNombre();
        datos.getEdad();
        datos.getPeso();
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad1;

import javax.swing.JOptionPane;

/**
 *
 * @author Irvin
 */
public class Animal {
    int edad;
    double peso;
    String nombre;
    public void Saludar(){
        System.out.println("hola");
        JOptionPane.showMessageDialog(null, "Hola");
}
    public void getNombre(){
        System.out.println(nombre);
        JOptionPane.showMessageDialog(null,"el animal es un " + nombre);
    }
    public void getEdad (){
        System.out.println(edad);
        JOptionPane.showMessageDialog(null, "la edad del " + nombre + " es de " + edad + " años " );
    }
    public void getPeso (){
            JOptionPane.showMessageDialog(null, "el " + nombre + " tien un peso de " + peso + "K.G.");
            if (peso>=3000){
                JOptionPane.showMessageDialog(null, "el " + nombre + " tiene un mal peso");
            }else{
                JOptionPane.showMessageDialog(null, "el " + nombre + "tiene un buen peso");
            }
            }
    
    
}

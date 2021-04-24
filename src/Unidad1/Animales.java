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
public class Animales {
    private int edad;
    private String nombre, gen, raza;
    private double peso;
    public Animales (int edadAnimal, String nombreAnimal, String genAnimal, double pesoAnimal, String razaAnimal){
        edad= edadAnimal;
        nombre=nombreAnimal;
        gen=genAnimal;
        peso= pesoAnimal;
        raza=razaAnimal;
    }
    public void Saludar (){
    JOptionPane.showMessageDialog(null, "hola");
}
    public void getEdad(){
        JOptionPane.showMessageDialog(null, "la edad de los " +nombre + " es de " + edad + " años");
    }
    public String getNombre(){
        return nombre;
    }
    public void getGenero(){
        JOptionPane.showMessageDialog(null, "el paso es " + gen);
    }
    public void getPeso(){
        JOptionPane.showMessageDialog(null, "el "+nombre + " pesa: " + peso);
        if (peso<=3){
            JOptionPane.showMessageDialog(null, "el peso es regular");
        }else{
            JOptionPane.showMessageDialog(null, "el " + nombre + " esta gordo :v ");
        }  
    }
    public void getRaza(){
        JOptionPane.showMessageDialog(null, "el " + nombre+ " es de la raza " + raza);
    }
   
    

    
    
}

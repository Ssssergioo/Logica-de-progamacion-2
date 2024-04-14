/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumadores;

/**
 *
 * @author User
 */
public class Suma {
    public int numero1;
    public int numero2;

    public Suma(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public int resultado(){
        return this.numero1 + this.numero2;
    }
    public static void main(String[] args) {
        Suma sumador = new Suma(5,5);
        System.out.println(sumador.resultado());
    
  
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumadores;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CalculadoraEdades {
    private double edad[];
    
    public CalculadoraEdades(double edad[]){
       this.edad=edad;
    }
    public double promediar(){
        double resultado = 0, aux, pasar;
        for(int i = 0; i<edad.length; i++){
            aux = edad[i];
            resultado = aux + resultado;
        }
        pasar = resultado/edad.length;
        
        return pasar;
    }
    public double cantidad(){
        return this.edad.length;
    }
    
    public double calcularPromedioMenoresEdad(){
        double menores = 0, cantidad = 0, aux;
        double promedio;
        for(int i = 0; i < edad.length; i++){
            if(edad[i]<18){
                menores += edad[i];
                cantidad++;
                 
            }
        } 
        promedio = menores/cantidad;
        return promedio;
    }
        public double calcularProemdioMayoresEdad(){
        double mayores = 0, cantidad = 0;
        double promedio;
        for(int i = 0; i < edad.length; i++){
            if(edad[i]>=18){
                mayores += edad[i];
                cantidad++;
                 
            }
        } 
        promedio = mayores/cantidad;
        return promedio;
    }
    
    public static void main(String[] args){
        int tamano;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas personas hay en el grupo, ingrese la cantidad: ");
        tamano = sc.nextInt();
        
        double edades[] = new double [tamano];
        for(int i = 0; i<edades.length; i++){
        System.out.print("Ingrese la edad de la persona Nro " + (i+1) + ": ");
        edades[i] = sc.nextDouble();
        }
        CalculadoraEdades  calculadoraEdades = new CalculadoraEdades(edades);
        
        
        System.out.println("El promedio de edad de los menores en la lista es de " + calculadoraEdades.calcularPromedioMenoresEdad());
        System.out.println("El promedio de edad de los menores en la lista es de " + calculadoraEdades.calcularProemdioMayoresEdad());
        
        
        
    }   
}

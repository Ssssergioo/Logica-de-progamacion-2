/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase1503;

import java.io.InputStream;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Scanne {
    public static void main(String[] args){
        //crear un objeto scanner para ingresar datos
    Scanner scanner = new Scanner(System.in); 
    //Declaracion de la lista de edades
    
    int[] edades = new int[5];
    
    int sumaMayores = 0;
    int cantidadMayores = 0;
    int sumaMenores = 0;
    int cantidadMenores = 0;
    
    //cargar los valores en el array
    
    System.out.println("Ingrese el valor de las edades");
    
    for (int i = 0; i < edades.length; i++){
        edades[i] = scanner.nextInt();
    }
    //determina que edad es menor o mayor de edad
    for(int i = 0; i < edades.length; i++){
            switch(edades[i] >= 18 ?1 :0){
                case 1:
               sumaMayores += edades[i];
               cantidadMayores++;
             break;
             default :
                 sumaMenores +=edades[i];
                 cantidadMenores++;
            }   
        }
    
    double promedioMayores = (double) sumaMayores / cantidadMayores;
    double promedioMenores = (double) sumaMenores / cantidadMenores;
        
        //Imprime los resultados
    System.out.println("El promedio de la edad de los mayores es: " + promedioMayores);
    System.out.println("El promedio de la edad de los menores es: " + promedioMenores); 

    }
}


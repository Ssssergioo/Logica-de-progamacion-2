/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase1503;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Clase1503 {

    public static void main(String[] args) {
        
        int edad1 = 12;
        int edad2 = 13;
        int edad3 = 15;
        int edad4 = 14;
        int edad5 = 45;
        int edad6 = 34;
        int edad7 = 21;
        
        int sumaMayores = 0;
        int cantidadMayores = 0;
        int sumaMenores = 0;
        int cantidadMenores = 0;
        
        //clasifica si es mayor o menor a 18 y devuelve al caso correspondiente
        switch(edad1>=18  ?1 :0){
            case 1 -> { 
              sumaMayores += edad1;
              cantidadMayores++;
            }
            default -> {
                sumaMenores += edad1;
                cantidadMenores++;
            }  
        }
        
        switch(edad2>=18  ?1 :0){
            case 1 -> { 
              sumaMayores += edad2;
              cantidadMayores++;
            }
            default -> {
                sumaMenores += edad2;
                cantidadMenores++;
            }  
        }
        
        switch(edad3>=18  ?1 :0){
            case 1 -> { 
              sumaMayores += edad3;
              cantidadMayores++;
            }
            default -> {
                sumaMenores += edad3;
                cantidadMenores++;
            }  
        }
        switch(edad4>=18  ?1 :0){
            case 1 -> { 
              sumaMayores += edad4;
              cantidadMayores++;
            }
            default -> {
                sumaMenores += edad4;
                cantidadMenores++;
            }  
        }
        switch(edad5>=18  ?1 :0){
            case 1 -> { 
              sumaMayores += edad5;
              cantidadMayores++;
            }
            default -> {
                sumaMenores += edad5;
                cantidadMenores++;
            }  
        }
        switch(edad6>=18  ?1 :0){
            case 1 -> { 
              sumaMayores += edad6;
              cantidadMayores++;
            }
            default -> {
                sumaMenores += edad6;
                cantidadMenores++;
            }  
        }
        switch(edad7>=18  ?1 :0){
            case 1 -> {
               sumaMayores += edad7;
              cantidadMayores++;

            }
                            
            default -> {
                sumaMenores += edad7;
                cantidadMenores++;
            }
        }
        
        //Calcula los promedios de edad
        double promedioMayores = (double) sumaMayores / cantidadMayores;
        double promedioMenores = (double) sumaMenores / cantidadMenores;
        
        //Imprime los resultados
        System.out.println("El promedio de la edad de los mayores es: " + promedioMayores);
        System.out.println("El promedio de la edad de los menores es: " + promedioMenores);
        
    }
}

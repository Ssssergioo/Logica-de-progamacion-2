/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase1503;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class array {
    public static void main(String[] args){
        int[] edades={25,17,38,12,31};
        int sumaMayores = 0;
        int cantidadMayores = 0;
        int sumaMenores = 0;
        int cantidadMenores = 0;
        int z = 0;
        
        
        
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

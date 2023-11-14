/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unittestexample;

/**
 *
 * @author nicov
 */
public class Operations {
    
public static int NextNumber(int userNumber){
    
    
 return userNumber+1;   
}    

public static boolean IsDivisible(int FirstNumber, int SecondNumber){
    
 int moduleResult=SecondNumber%FirstNumber;
    
  return   moduleResult==0;
    
    
    
}



    
public static double calcularVolumen(double radio, double altura) {
    double resultadovolumen;
        return resultadovolumen=Math.PI * Math.pow(radio, 2) * altura;
    }   

public static String Determinarnumero(double typenumber) {
        if (typenumber > 0) {
            return "Positive";
        } else if (typenumber < 0) {
            return "Negative";
        } else {
            return "Null (Zero)";
        }
    }

}

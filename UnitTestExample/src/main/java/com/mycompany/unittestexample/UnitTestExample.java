/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unittestexample;

import java.util.Scanner;
import com.mycompany.unittestexample.Operations;
/**
 *
 * @author nicov
 */
public class UnitTestExample {

    public static void main(String[] args) {
        System.out.println("Select one of the option below");
        System.out.println("1. Add next number");
        System.out.println("2. Based two numbers return devisible");
        System.out.println("3. Volume of a cylinder");
        System.out.println("4. Number entered positive, negative or zero");
        
        
        Scanner in=new Scanner (System.in);
        String userResult=in.next();
        
        
        switch (userResult){
            
            case "1":    
            
                System.out.println("Type an integer number");    
                String userNumber=in.next();
                int userNumberInt=Integer.parseInt(userNumber);
                int nexResult=Operations.NextNumber(userNumberInt);
                System.out.println(nexResult);
                
                break;
                
                 case "2":    
            
                System.out.println("Type an integer number");    
                String FirstDivisibleNumber=in.next();
                System.out.println("Type a second integer number");
                String SecondDivisibleNumber=in.next();
                boolean result=Operations.IsDivisible(Integer.parseInt(FirstDivisibleNumber), 
                        Integer.parseInt(SecondDivisibleNumber));
               if(result){
                   
                   System.out.println(SecondDivisibleNumber+" 2is divisible into "+FirstDivisibleNumber);   
                   
                   
               }else{
                   
                System.out.println(SecondDivisibleNumber+" is not divisible into "+FirstDivisibleNumber);      
                   
               }
               
                break;
                
                
                
                
                
                
                
                
                
                
                case "3":
                
                System.out.print("Enter the value of the cylinder radius: ");
               double radio = in.nextDouble();
                
                System.out.print("Enter the value of the cylinder height: ");
                double altura = in.nextDouble();

               double resultadofinal=Operations.calcularVolumen(radio, altura);
               
                    System.out.println("The volume of the cylinder with radius " + radio + " and height " + altura + " is: " + resultadofinal);
               
                break;
                
                 case "4":
                System.out.println("Type an number");    
                double typenumber=in.nextDouble();
                
                String resultadotipo=Operations.Determinarnumero(typenumber);
                
                     System.out.println("The number entered is " + resultadotipo + ".");
                
                break;
                
                case "5":
                
                    System.out.println("Commit Branch2");    
                    
                
                    break;
                
            default:
                throw new AssertionError();
                       
            
        }
        
        
    }
}

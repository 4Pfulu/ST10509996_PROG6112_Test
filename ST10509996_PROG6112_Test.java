/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10509996_prog6112_test;



/**
 *
 * @author Student
 */
public class ST10509996_PROG6112_Test {

   public static void main(String[] args){
       
      
       
       String[]cities  = {"Cape Town" , "Port elizabeth", "Pretoria"};
               
       String[]Console={"PS5","XBOX", "SWITCH"};
       
        int[][]Sales = {
            {1000 ,2000,3000}, //cape town
            {2000, 3000, 4000},//port elizabeth
            {1500 ,1100 ,1200},//Pretoria
        };
       int [] CityTotals = new int[cities.length];
        System.out.println("-------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------");
        
         System.out.print("\t \t \t");
          for (int j = 0; j < Console.length; j++){
              System.out.print(Console[j] + "\t");
          }
          System.out.println();
           for (int i = 0 ;i < cities.length;  i++) {
       System.out.print(cities[i] + "\t");
        if (cities[i].length() < 8){
             System.out.print("\t");
             
        }
         for  ( int  j = 0; j  < Console .length;j++) {
              System.out.print(Sales[i][j] + "\t") ;
         }
          System.out.println();
   }
            int highestIndex = 0; for (int i = 0 ; i < cities.length; i++) {
                 int sum = 0;
                 
                 for ( int j =0 ; j < Console.length; j++){
                      sum = sum + Sales[i][j];
                 }
                 CityTotals[i] = sum;
                  if  (CityTotals [i] > CityTotals[highestIndex]) {
                       highestIndex = i;
                  }
            }
            
             System.out.println ("------------------------------------------------");
              System.out.println("CONSOLE SALES TOTAL FOR EACH CITY");
              System.out.println("--------------------------------------------------");
               for ( int i = 0 ; i < cities.length; i++){ System.out.println(cities[i] + "\t" + CityTotals[i]);}
               
               System.out.println();
                System.out.println("CITY WITH THE MOST SALES:" + cities[highestIndex]);
                 System.out.println("-------------------------------------------------------------------------------------");
    } 
}
 

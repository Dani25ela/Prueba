/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamatriz;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class PruebaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    final int FILAS = 4, COLUMNAS = 4;
        Scanner sc = new Scanner (System.in);
        int i,j;
        int C [][]=new int[4][4];
   
    int[][] A = new int [FILAS] [COLUMNAS];
        System.out.println("Introduzca los numeros para la matriz A: ");
    for(i = 0; i < 4; i++){
        for( j = 0; j < 4 ; j++){
            System.out.print(" | ");

            System.out.println("A[" + i + "] [" + j + "]= ");
            A[i][j] = sc.nextInt();
        }
    }
    
    System.out.println("VALORES INTRODUCIDOS MATRIZ A:");
        for (i = 0; i < A.length; i++) { 
                 
                         
            for (j = 0; j < A[i].length; j++) {
                System.out.print(" | ");
                System.out.print(A[i][j] + " ");
               
            }
            System.out.println();
        }
    
    int[][] B = new int [FILAS] [COLUMNAS];
        System.out.println("Introduzca los numeros para la matriz B: ");
    for(i = 0; i < 4; i++){
        for( j = 0; j < 4 ; j++){
            System.out.print(" | ");

            System.out.println("B[" + i + "] [" + j + "]= ");
            B[i][j] = sc.nextInt();
        }
    }
    
    System.out.println("VALORES INTRODUCIDOS DE LA MATRIZ B:");
        for (i = 0; i < B.length; i++) { 
            for (j = 0; j < B[i].length; j++) {
                System.out.print(" | ");
                System.out.print(B[i][j] + " ");
               
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");
        
     System.out.println("Suma de las dos matrices:");
                for(i = 0; i < 4; i++){
                    for( j = 0; j < 4 ; j++){
                        System.out.print(" | ");
                        C [i][j]= A[i][j] + B [i][j];                            
                        System.out.print(C[i][j]+" ");
                        }
                        System.out.println();
                }
        System.out.println("------------------------------------------------------");
        
        System.out.println("Resta de las dos matrices:");
                for(i = 0; i < 4; i++){
                    for( j = 0; j < 4 ; j++){
                        System.out.print(" | ");
                        C [i][j]= A[i][j] - B [i][j];                            
                        System.out.print(C[i][j]+" ");
                        }
                        System.out.println();
                }
        System.out.println("------------------------------------------------------");
    }
    
}
  
    
   

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exo3;

import java.util.Scanner;

/**
 * @author 33768
 * Nom:Morotti
 * Group:TDC
 * rôle: TP0
 * Date:18/09/2023
 */
public class Exo3 {

    public static void main(String[] args) {
        int operateur;
        int operande1;
        int operande2;
        double result = 0;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("""
                           Please enter the operator:
                           1) add
                           2) substract
                           3) multiply
                           4) divide
                           5) modulo""");
        operateur = sc.nextInt();
        while ( operateur>5 || operateur<1) {
            for (int i = 1 ; 1<=5 ; i++) {
                if (operateur == i) {
                    break;
                }
                if (i == 5){
                    System.out.println("Error please choose a nuber between 1 and 5");
                operateur = sc.nextInt();
                }
            }
              
        }
        System.out.println("Give me your first operator value");
        operande1 = sc.nextInt();
        System.out.println("Give me your second operator value");
        operande2 = sc.nextInt();
        
        if( operateur == 1){
            result = operande1 + operande2;
        }
        if( operateur == 2){
            result = operande1 - operande2;
        }
        if( operateur == 3){
            result = operande1 * operande2;
        }
        if( operateur == 4){
            result = operande1 / (operande2 * 1.0);
        }
        if( operateur == 5){
            result = operande1 % (operande2 * 1.0);
        }
        System.out.println("the result is : " + result); 
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_morotti;

import java.util.Scanner;

/**
 *
 * @author 33768
 */
public class TP1_manipNombresInt_MOROTTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int operande1;
         int operande2;
         int product;
         int sum;
         int sub;
         int div;
         int mod;
         Scanner sc;
         sc = new Scanner(System.in);
         System.out.println("Give me your first int number value");
         operande1 = sc.nextInt();
         System.out.println("Give me your second int number value");
         operande2 = sc.nextInt();
         sum = operande1 + operande2;
         sub = operande1 - operande2;
         product = operande1 * operande2;
         div = operande1 / operande2;
         mod = operande1 % operande2;
         System.out.println("this is the adition of your numbers: " + sum);
         System.out.println("this is the substraction of your numbers: " + sub);
         System.out.println("this is the product of your numbers: " + product);
         System.out.println("this is the division of your numbers: " + div);
         System.out.println("this is the rest of your numbers division: " + mod);
         
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_morotti;

import java.util.Scanner;

/**
 * @author 33768
 * Nom:Morotti
 * Group:TDC
 * rôle: TP0
 * Date:06/10/2023
 */
public class TP2_convertisseurObjet_MOROTTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        double Te;
        double TeTransfo;
        Convertisseur capteur = new Convertisseur();
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur :");
        Te = sc.nextDouble();
        System.out.println("""
                           Saisissez la conversion que vous souhaiter effectuer :
                                    1) De Celcius vers Kelvin
                                    2) De Kelvin vers Celcius
                                    3) De Celcius vers Farenheit
                                    4) De Farenheit vers Celcius
                                    5) De Kelvin vers Farenheit
                                    6) De Farenheit vers Kelvin""");
        choice = sc.nextInt();
        TEST_ERROR_INT(choice);
        if (choice == 1){
             TeTransfo = capteur.CelciusVersKelvin(Te);
             System.out.println(Te + "degres Celcius est egal a " + TeTransfo + " degres Kelvin.");
        }
        if (choice == 2){
            TeTransfo = capteur.KelvinVersCelcius(Te);
            System.out.println(Te + "degres Kelvin est egal a " + TeTransfo + " degres Celcius.");
        }
        if (choice == 3){
            TeTransfo = capteur.CelciusVersFarenheit(Te);
            System.out.println(Te + "degres Celcius est egal a " + TeTransfo + " degres Farenheit.");
        }
        if (choice == 4){
            TeTransfo = capteur.FarenheitVersCelcius(Te);
            System.out.println(Te + "degres Farenheit est egal a " + TeTransfo + " degres Celcius.");
        }
        if (choice == 5){
            TeTransfo = capteur.KelvinVersFarenheit(Te);
            System.out.println(Te + "degres Kelvin est egal a " + TeTransfo + " degres Farenheit.");
        }
        if (choice == 6){
            TeTransfo = capteur.FarenheitVersKelvin(Te);
            System.out.println(Te + "degres Farenheit est egal a " + TeTransfo + " degres Kelvin.");
    
        }
    }   
    public static double TEST_ERROR_INT(int test){
    Scanner sc;
    sc = new Scanner(System.in);
    while ( test>6 || test<1) {
            for (int i = 1 ; 1<=6 ; i++) {
                if (test == i) {
                    break;
                }
                if (i == 5){
                    System.out.println("Erreur veillez choisire un nombre entre 1 et 6");
                test = sc.nextInt();
                }
            }
              
        }
    return (test);
}
         
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_morotti;

import java.util.Scanner;


/**
 *
 * @author 33768
 */
public class TP1_convertisseur_MOROTTI {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double Te;
         double TeTransfo;
         int choice;
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
             TeTransfo = CelciusVersKelvin(Te);
             System.out.println(Te + "degres Celcius est egal a " + TeTransfo + " degres Kelvin.");
         }
         if (choice == 2){
             TeTransfo = KelvinVersCelcius(Te);
             System.out.println(Te + "degres Kelvin est egal a " + TeTransfo + " degres Celcius.");
         }
         if (choice == 3){
             TeTransfo = CelciusVersFarenheit(Te);
             System.out.println(Te + "degres Celcius est egal a " + TeTransfo + " degres Farenheit.");
         }
         if (choice == 4){
             TeTransfo = FarenheitVersCelcius(Te);
             System.out.println(Te + "degres Farenheit est egal a " + TeTransfo + " degres Celcius.");
         }
         if (choice == 5){
             TeTransfo = KelvinVersFarenheit(Te);
             System.out.println(Te + "degres Kelvin est egal a " + TeTransfo + " degres Farenheit.");
         }
         if (choice == 6){
             TeTransfo = FarenheitVersKelvin(Te);
             System.out.println(Te + "degres Farenheit est egal a " + TeTransfo + " degres Kelvin.");
         }
    }
public static double CelciusVersKelvin (double tCelcius) {
        tCelcius += 273.15;
        return( tCelcius);
}
public static double KelvinVersCelcius (double tCelcius) {
        tCelcius = tCelcius - 273.15;
        return( tCelcius);
}
public static double FarenheitVersCelcius (double tFarenheit) {
        tFarenheit = (tFarenheit - 32) / 1.8;
        return( tFarenheit);
}
public static double CelciusVersFarenheit (double tCelcius) {
        tCelcius = (tCelcius * 1.8) + 32;
        return( tCelcius);
}
public static double KelvinVersFarenheit (double tKelvin) {
        tKelvin = CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
        return( tKelvin);
}
public static double FarenheitVersKelvin (double tFarenheit) {
        tFarenheit =  CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
        return( tFarenheit);
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


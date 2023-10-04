/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_morotti;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 33768
 */
public class TP1_guessMyNumber_MOROTTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Guess;
        int Compt=1;
        String dif = "";
        Scanner sc;
        sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        System.out.println("Bonjour, choisissez votre niveau de difficulté: \n-F pour Facile (tentative ilimité)  \n-M pour Moyen (20 tentative) \n-D pour Difficile (5 tentative) ");
        dif = sc.nextLine();
        dif = test_dif (dif);
        int n = generateurAleat.nextInt(100);
        System.out.println("Saisissez un entier entre 0 et 100 non compris: ");
        Guess = sc.nextInt();
        Guess =  test_interval (Guess);
        
        if (Guess == n){
            System.out.println("Gagné en " + Compt + " essai!");
            
        }
        while (Guess != n){
            if (Guess > n ){
                System.out.println("Trop Grand");
            }
            else if (Guess < n ){
                System.out.println("Trop petit");
            }
            if (dif == "M"){
                if (Compt > 20){
                    System.out.println("Tentative expirée Perdu!");
                }
            }
            if (dif == "D"){
                if (Compt > 5){
                    System.out.println("Tentative expirée Perdu!");
                }
            }
            Compt += 1;
            Guess = sc.nextInt();
            Guess = test_interval(Guess);
        }
        System.out.println("Gagné en " + Compt + " essai!");
        

        
    }

    /**
     *
     * @param nb
     * @return
     */
    public static int test_interval (int nb) {
        Scanner sc;
        sc = new Scanner(System.in);
        if (nb>=0 && nb<100){
            return (nb);
        }
        else{
            while (nb<0 || nb>=100){
                System.out.println("Erreur votre nombre n'est pas compris entre 0 et 100 (non compris) veillez réessayer ");
                nb = sc.nextInt();
                
            }
            
            
        }
        return (nb);
    }
    public static String test_dif (String dif) {
        Scanner sc;
        sc = new Scanner(System.in);
        dif = dif.toUpperCase();
        if (dif == "F" || dif == "M" || dif == "D"){
            return (dif);
        }
        else{
            while (!"F".equals(dif) && !"M".equals(dif) && !"D".equals(dif)){
                System.out.println("Erreur votre demande de difficulté n'est pas conforme: \n-F pour Facile  \n-M pour Moyen \n-D pour Difficile  ");
                dif = sc.nextLine();
                dif = dif.toUpperCase();
            }
        }
        return (dif);
    }
}


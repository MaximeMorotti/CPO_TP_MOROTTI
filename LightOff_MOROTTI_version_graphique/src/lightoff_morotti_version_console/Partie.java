/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_morotti_version_console;
import java.util.Scanner;
/**
 *
 * @author 33768
 * Nom:Morotti
 * Group:TDC
 * rôle: Partie Miniprojet 
 * Date:25/10/2023
 * 
 */
public class Partie {

    GrilleDeCellules grille; 
    int nbCoups;
    
    /**
     * Constructeur qui initialise le nombre de coup a 0 et crée un grille de jeux.
     */
    public Partie() {
        String Dif;
        Scanner sc;
        sc = new Scanner(System.in);
        this.nbCoups = 0;
        System.out.println("Choisire la dificulte de taille: \n-Facile: F \n-Moyen: M \n-Difficile: D");
        Dif = sc.nextLine();
        while (!Dif.equals("F") && !Dif.equals("M") && !Dif.equals("D")){
            System.out.println("Erreur de syntaxe Choisire la dificulte de taille a partire de: \n-Facile: F \n-Moyen: M \n-Difficile: D");
            Dif = sc.nextLine();
        }
        if (Dif.equals("F")){
            grille = new GrilleDeCellules(3,3);
        }
        if (Dif.equals("M")){
            grille = new GrilleDeCellules(5,5);
        }
        if (Dif.equals("D")){
            grille = new GrilleDeCellules(7,7);
        }
        
    }
    
    /**
     * Mélange la grille de la partie pour qu' il y ai plus de 15 lumière allumer
     */
    public void initialiserPartie(){
        String Dif;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Choisire la dificulte de Melange: \n-Facile: F \n-Moyen: M \n-Difficile: D");
        Dif = sc.nextLine();
        while (!Dif.equals("F") && !Dif.equals("M") && !Dif.equals("D")){
            System.out.println("Erreur de syntaxe Choisire la dificulte de Melange a partire de: \n-Facile: F \n-Moyen: M \n-Difficile: D");
            Dif = sc.nextLine();
        }
        if (Dif.equals("F")){
            grille.melangerMatriceAleatoirement(4);
        }
        if (Dif.equals("M")){
            grille.melangerMatriceAleatoirement(6);
        }
        if (Dif.equals("D")){
            grille.melangerMatriceAleatoirement(9);
        }
        }
    
    /**
     * - La méthode permetant de jouer au jeu LightOff
     *   en affichant l'état initial de la grille, puis en entrant dans une boucle de jeu qui continue
     *   tant que toutes les cellules ne sont pas éteintes. À chaque tour de la boucle :
     *   a. Un coup est demandé au joueur sous la forme d’une saisie au clavier
     *   b. La ligne, colonne, ou diagonale correspondante est activée
     *   c. Le nombre de coups est incrémenté et affiché
     *   d. l'état mis à jour de la grille est affiché.
     *   e. Une fois que toutes les cellules sont éteintes, le jeu se termine, et le nombre de
     *   coups nécessaires pour éteindre toutes les cellules est affiché. Cette méthode
     *   peut éventuellement être décomposée en plusieurs sous-méthodes.
     */
    public void lancerPartie(){
        String Pose;
        int nb=1000;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print(grille);
        while(grille.cellulesToutesEteintes()!= true){
            System.out.println("choisire : \n-Ligne: L\n-Colonne: C\n-Diagonale dessendante: Dd\n-Diagional montante: Dm");
            Pose = sc.nextLine();
            System.out.println(Pose);
            while (!Pose.equals("L") && !Pose.equals("C") && !Pose.equals("Dd") && !Pose.equals("Dm")){
                System.out.println("Erreur de syntaxe Choisire dans : \n-Ligne: L\n-Colonne: C\n-Diagonale dessendante: Dd\n-Diagional montante: Dm");
                Pose = sc.nextLine();
                System.out.println(Pose);
            }
            if (Pose.equals("Dd")){
                grille.activerDiagonaleDescendante();
                this.nbCoups++;
            }
            if (Pose.equals("Dm")){
                grille.activerDiagonaleMontante();
                this.nbCoups++;
            }
            if (Pose.equals("L")){
                System.out.println( "choisire le nombre de la ligne:");
                for(int i = 0; i < grille.nbLignes; i++){
                    System.out.println("- " + i);
                }
                nb = sc.nextInt();
                while ( nb > grille.nbLignes){
                    System.out.println( "Erreur de syntaxe choisire le nombre de la ligne:");
                    for(int i = 0; i < grille.nbLignes; i++){
                        System.out.println("- " + i);
                    }    
                    nb = sc.nextInt();
                }
                grille.activerLigneDeCellules(nb);
                this.nbCoups++;
            }
            if (Pose.equals("C")){
                System.out.println( "choisire le nombre de la ligne:");
                for(int i = 0; i < grille.nbColonnes; i++){
                    System.out.println("- " + i);
                }
                nb = sc.nextInt();
                while ( nb > grille.nbColonnes){
                    System.out.println( "Erreur de syntaxe choisire le nombre de la ligne:");
                    for(int i = 0; i < grille.nbColonnes; i++){
                        System.out.println("- " + i);
                    }  
                    nb = sc.nextInt();
                }
                grille.activerColonneDeCellules(nb);
                this.nbCoups++;
            }
            if (this.nbCoups == 1){
                System.out.println("Vous etes au: "+this.nbCoups+"er coup.");
            }
            else System.out.println("Vous etes au: "+this.nbCoups+"eme coup.");
            System.out.print(grille);
        
        }
        System.out.print("BRAVOS vous avez réussi en: "+this.nbCoups+" coup.");
    }
}
    

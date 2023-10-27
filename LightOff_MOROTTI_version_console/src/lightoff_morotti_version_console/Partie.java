/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_morotti_version_console;
import java.util.Scanner;
import lightoff_morotti_version_console.CelluleLumineuse;
import lightoff_morotti_version_console.GrilleDeCellules;
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
        this.nbCoups = 0;
        grille = new GrilleDeCellules(6,6);
    }
    
    /**
     * Mélange la grille de la partie pour qu' il y ai plus de 15 lumière allumer
     */
    public void initialiserPartie(){
        int testéta=0;
        while (testéta < 15)
            grille.melangerMatriceAleatoirement(10);
            for (int i = 0; i < grille.nbLignes; i++) {
                for (int j = 0; j < grille.nbColonnes; j++) {
                    if (grille.matriceCellules[i][j].estEteint()== false){
                      testéta++;
                    }
                }
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
            while (Pose!="L"||Pose!="C"||Pose!="Dd"||Pose!="Dm"){
                System.out.println("Erreur de syntaxe Choisire dans : \n-Ligne: L\n-Colonne: C\n-Diagonale dessendante: Dd\n-Diagional montante: Dm");
                Pose = sc.nextLine();
            }
            if (Pose == "Dd"){
                grille.activerDiagonaleDescendante();
                this.nbCoups++;
            }
            if (Pose == "Dm"){
                grille.activerDiagonaleMontante();
                this.nbCoups++;
            }
            if (Pose == "L"){
                System.out.println( "choisire le nombre de la ligne:");
                for(int i = 0; i < grille.nbLignes; i++){
                    System.out.println("- L" + i);
                    nb = sc.nextInt();
                }
                while ( nb > grille.nbLignes){
                    System.out.println( "Erreur de syntaxe choisire le nombre de la ligne:");
                    for(int i = 0; i < grille.nbLignes; i++){
                        System.out.println("- L" + i);
                        nb = sc.nextInt();
                    }    
                }
                grille.activerLigneDeCellules(nb);
                this.nbCoups++;
            }
            if (Pose == "G"){
                System.out.println( "choisire le nombre de la ligne:");
                for(int i = 0; i < grille.nbColonnes; i++){
                    System.out.println("- L" + i);
                    nb = sc.nextInt();
                }
                while ( nb > grille.nbColonnes){
                    System.out.println( "Erreur de syntaxe choisire le nombre de la ligne:");
                    for(int i = 0; i < grille.nbColonnes; i++){
                        System.out.println("- L" + i);
                        nb = sc.nextInt();
                    }    
                }
                grille.activerColonneDeCellules(nb);
                this.nbCoups++;
            }
            System.out.print("Vous êtes au: "+this.nbCoups+"eme coup.");
            System.out.print(grille);
        
        }
        System.out.print("BRAVOS vous avez réussi en: "+this.nbCoups+" coup.");
    }
    

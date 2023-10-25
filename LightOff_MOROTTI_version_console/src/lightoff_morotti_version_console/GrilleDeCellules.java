/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_morotti_version_console;
import java.util.Random;
import lightoff_morotti_version_console.CelluleLumineuse;

/**
 *
 * @author 33768
 * Nom:Morotti
 * Group:TDC
 * rôle: Grille Miniprojet 
 * Date:25/10/2023
 * 
 */
public class GrilleDeCellules {
    Random r = new Random();
    int nbLignes;
    int nbColonnes;
    CelluleLumineuse[][] matriceCellules;

    /**
     * Méthode permettant de crée un tableau remplie de cellulue luineuse.
     * @param nbLignes Permet d' initialiser le nombre de ligne du tableau.
     * @param nbColonnes Permet d' initialiser le nombre de colone du tableau.
     */
    public GrilleDeCellules(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
                
    }
    
    /**
     * Méthode permetant modifier l'état de tout les cellule 
     * en les passent en éteinte ( etat = false).
     */
    public void eteindreToutesLesCellule (){
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    
    /**
     * Méthode qui allume une ligne ou une colode ou une diagonalle alléatoirement.
     */
    public void  activerLigneColonneOuDiagonaleAleatoire(){
        int Possibilité;
        int Ln;
        int Cl;
        int Dg;
        Possibilité = r.nextInt(3);
        if (Possibilité == 0){
            Ln = r.nextInt(nbLignes);
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[Ln][j].activerCellule();
            }
        }
        if (Possibilité == 1){
            Cl = r.nextInt(nbColonnes);
                    for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][Cl].activerCellule();
            }
        }
        if (Possibilité == 2){
            Dg = r.nextInt(2);
            if (Dg == 0){
                for (int i = 0; i < nbLignes; i++) {
                    for (int j = 0; j < nbColonnes; j++) {
                        if (i == j){
                            matriceCellules[i][j].activerCellule();
                        }
                
                    }
           
                }
            
            }
            else {
                for (int i = 0; i < nbLignes; i++) {
                    for (int j = 0; j < nbColonnes; j++) {
                        if (nbLignes - i == j){
                            matriceCellules[i][j].activerCellule();
                        }
                
                    }
           
                }
            }
                
            }
        
        
    }
}
"""



- La méthode activerLigneColonneOuDiagonaleAleatoire() active de manière aléatoire
soit une ligne, soit une colonne, soit une diagonale de cellules dans la grille. La logique
de l'activation est basée sur un nombre aléatoire.
- La méthode melangerMatriceAleatoirement(int nbTours) permet de générer un
plateau de cellules lumineuses de manière aléatoire à partir d’un nombre spécifié de
tours. Partant d’une matrice existante – c.-à-d. la matriceCellules stockée en tant
qu’attribut - cette méthode commence par éteindre toutes les cellules, et ensuite, pour
chaque tour, active de manière aléatoire une ligne, une colonne ou une diagonale de
cellules de la matrice. Générer une grille ainsi permet de s’assurer que la grille dispose
bien d’une solution réalisable.
- Les méthodes activerLigneDeCellules(int idLigne) et activerColonneDeCellules(int
idColonne) activent toutes les cellules d'une ligne ou d'une colonne spécifique de la
grille, dont le numéro est passé en paramètre.
- Les méthodes activerDiagonaleDescendante() et activerDiagonaleMontante()
activent respectivement la diagonale descendante et la diagonale montante de la grille
en allumant les cellules correspondantes.
- La méthode cellulesToutesEteintes() vérifie si toutes les cellules de la grille sont
éteintes. Elle retourne true si toutes les cellules sont éteintes, et false sinon.
- Enfin, la méthode toString() est redéfinie pour afficher l'état de la grille sous forme
d'une représentation visuelle organisée. Elle crée une chaîne de caractères avec des
indices pour les lignes et les colonnes, ainsi que des caractères "X" et "O" pour
représenter l'état des cellules. Idéalement, cette méthode doit afficher la grille selon
le format ci-dessous (exemple avec 7 lignes et 7 colonnes). Cette méthode doit
s’adapter quelle que soit les dimensions de la grille.
 | 0 | 1 | 2 | 3 | 4 | 5 | 6 |
--------------------------------
0 | O | X | X | O | O | X | O |
--------------------------------
1 | X | O | O | X | X | O | X |
--------------------------------
2 | O | X | X | O | O | X | O |
--------------------------------
3 | X | O | O | X | X | O | X |
--------------------------------
4 | X | O | O | X | X | O | X |
--------------------------------
5 | O | X | X | O | O | X | O |
--------------------------------
6 | O | X | X | O | O | X | O |
--------------------------------
En combinant ces fonctionnalités, la classe GrilleDeJeu offre un moyen pratique de gérer et de
représenter des grilles de cellules lumineuses dans un programme Java.

"""
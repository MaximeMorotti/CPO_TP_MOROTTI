/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_morotti_version_console;
import java.util.Random;
import lightoff_morotti_version_console.CelluleLumineuse;

/**
 *
 * @author 33768 Nom:Morotti Group:TDC rôle: Grille Miniprojet Date:25/10/2023
 *
 */
public class GrilleDeCellules {

    Random r = new Random();
    int nbLignes;
    int nbColonnes;
    CelluleLumineuse[][] matriceCellules;

    /**
     * Méthode permettant de crée un tableau remplie de cellulue luineuse.
     *
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
     * Méthode permetant modifier l'état de tout les cellule en les passent en
     * éteinte ( etat = false).
     */
    public void eteindreToutesLesCellule() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    /**
     * Méthode qui allume une ligne ou une colode ou une diagonalle
     * alléatoirement.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        int Possibilité;
        int Ln;
        int Cl;
        int Dg;
        Possibilité = r.nextInt(3);
        if (Possibilité == 0) {
            Ln = r.nextInt(nbLignes);
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[Ln][j].activerCellule();
            }
        }
        if (Possibilité == 1) {
            Cl = r.nextInt(nbColonnes);
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][Cl].activerCellule();
            }
        }
        if (Possibilité == 2) {
            Dg = r.nextInt(2);
            if (Dg == 0) {
                for (int i = 0; i < nbLignes; i++) {
                    for (int j = 0; j < nbColonnes; j++) {
                        if (i == j) {
                            matriceCellules[i][j].activerCellule();
                        }
                    }
                }

            } else {
                for (int i = 0; i < nbLignes; i++) {
                    for (int j = 0; j < nbColonnes; j++) {
                        if (nbLignes - i == j) {
                            matriceCellules[i][j].activerCellule();
                        }
                    }
                }
            }

        }

    }

    /**
     * Méthode permettant dengénérer un tableau de Cellule lumineuse mélanger au
     * nbTours fois choisie.
     *
     * @param nbTours nombre choisie de mélange fait sur la grille.
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        GrilleDeCellules GrCl = new GrilleDeCellules(6, 6);
        GrCl.eteindreToutesLesCellule();
        for (int i = 0; i < nbTours; i++) {
            GrCl.activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    /**
     * Méthode qui active tout une ligne donnée.
     * @param idLigne ligne a activée.
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();

        }
    }    
    
    /**
     * Méthode qui active tout une colone donnée.
     * @param idColonne colanne a activé.
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }
    
    /**
     * Méthode qui active tout la Diagonale Descendante.
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (i == j) {
                    matriceCellules[i][j].activerCellule();
                }
            }
        }  
    }
    
    /**
     * Méthode qui active tout la Diagonale Montante.
     */
    public void activerDiagonaleMontante() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (nbLignes - i == j) {
                    matriceCellules[i][j].activerCellule();
                }
            }
        }
    }
    
    /**
     * Méthode permettant de vériffier si tout les cellule du tableau sont éteintes.
     * @return true si elles sont bien tout éteintes sinon false.
     */
    public boolean cellulesToutesEteintes(){
        boolean éteint = true;
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if ( matriceCellules[i][j].estEteint() == false){
                    éteint = false;
                }
            }
        }
        return éteint;
    }
    
    /**
     * Méthode permettant d' adapter l' affichage de la cellule selon son état.
     * @return X si allumer O si éteinte.
     */
    @Override
    public String toString() {
        String chaine_a_retourner;
        String L1 = " | ";
        String espassement = "";
        String LnGr = "";
        for (int j = 0; j < nbColonnes; j++) {
            L1 += j + " | ";
        }
        for (int i = 0; i < L1.length(); i++) {
            espassement += "-";
        }
        for (int j = 0; j < nbColonnes; j++) {
            L1 += j + " | ";
        }
        return chaine_a_retourner ;
    }
    
}
"""


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

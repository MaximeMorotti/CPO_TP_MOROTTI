/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_morotti_version_console;

/**
 *
 * @author 33768
 * Nom:Morotti
 * Group:TDC
 * rôle: Cellule Miniprojet 
 * Date:25/10/2023
 * 
 */
public class CelluleLumineuse {
    private boolean etat;

    /**
     *Constructeur de cellule lumineuse qui initialise un cellule éteinte.
     */
    public CelluleLumineuse() {
        this.etat = false;
    }
    
    /**
     * Méthode permettant de changer l'état d'une cellule éteinte en allumer.
     * Si la cellule était déjà allumer, cette méthode n'a aucun effet.
     */
    public void activerCellule(){
        if (this.etat == true){
            this.etat = false;
        }
        else this.etat = true;
    }
    
    /**
     * Méthode permettant de changer l'état d'une cellule allumer en éteinte.
     * Si la cellule était déjà éteinte, cette méthode n'a aucun effet.
     */
    public void eteindreCellule(){
        this.etat = false;
    }
    
    
    /**
     * Méthode permettant de vérifier si une cellule est éteinte ou allumer.
     * @return true si la cellule est éteinte et false si elle est allumer.
     */
    public boolean estEteint(){
        if (this.etat == false){
            return true;
        }
        else return false;
    }
    
    
    
    /**
     * Méthode qui permet de récupérer l'état d' une cellule.
     * @return l'état de la cellule(true allumer false étteinte).
     */
    public boolean getEtat(){
        return this.etat;
    }
    
    /**
     * Méthode permettant d' adapter l' affichage de la cellule selon son état.
     * @return X si allumer O si éteinte.
     */
    @Override
    public String toString() {
        String chaine_a_retourner;
        if (this.etat == true){
            chaine_a_retourner = "X" ;
        }
        else chaine_a_retourner = "O";
        return chaine_a_retourner ;
    }
    
}

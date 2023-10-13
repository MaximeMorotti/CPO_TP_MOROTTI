/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_morotti;

/**
 *
 * @author 33768
 */
public class Voiture {
    String M;
    String B;
    int C ;
    Personne propriétaire;
    public Voiture(String modele, String marque, int puissance) {
        M= modele;
        B= marque;
        C= puissance ;
        propriétaire = null;
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = B + " " + M + " de " + C + " Chevaux";
        return chaine_a_retourner ;
    }
    

}

    


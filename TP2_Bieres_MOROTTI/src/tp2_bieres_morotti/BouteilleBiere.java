/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_morotti;

/**
 *
 * @author 33768
 */
public class BouteilleBiere {
    String nom;
    String brasserie;
    boolean ouverte;
    double degreAlcool;
    public void lireEtiquette() {
          System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie );
     
     
    }
    public BouteilleBiere (String unNom, double unDegre, String uneBrasserie){
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    public boolean Décapsuler(){
        if (ouverte==false){
            ouverte = true;
        }
        else{
            System.out.println("Erreur : biere déjà ouverte");
        }
    }
}


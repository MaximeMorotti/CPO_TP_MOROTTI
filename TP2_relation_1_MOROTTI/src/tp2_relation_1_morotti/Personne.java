/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_morotti;

/**
 *
 * @author 33768
 */
public class Personne {
        String NF;
        String Prenom;
        Voiture[] liste_voitures;
        int nbVoitures;
        public Personne(String nom_de_famille, String premier_prenom) {
            NF=nom_de_famille ;
            Prenom= premier_prenom;
            liste_voitures = new Voiture [3] ;
            nbVoitures = 0;
            
        }
        public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
            if ( voiture_a_ajouter.propriétaire !=null || nbVoitures >=3){
                return false;
            }
            else{
                liste_voitures[nbVoitures] = voiture_a_ajouter;
                nbVoitures += 1;
                voiture_a_ajouter.propriétaire = this; 
                return true;
            
            }
        }
}

    


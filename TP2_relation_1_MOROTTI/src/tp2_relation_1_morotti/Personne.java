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
        public Personne(String nom_de_famille, String premier_prenom) {
            NF=nom_de_famille ;
            Prenom= premier_prenom;
            liste_voitures = new Voiture [3] ;
            
        }
        

}

    


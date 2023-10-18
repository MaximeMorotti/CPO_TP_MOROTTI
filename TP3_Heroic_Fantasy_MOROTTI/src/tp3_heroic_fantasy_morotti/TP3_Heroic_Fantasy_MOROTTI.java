/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_morotti;

import Personages.Personnage;
import Personages.Magicien;
import Personages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author 33768
 */
public class TP3_Heroic_Fantasy_MOROTTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibur = new Epee("Excalibur",7,5);
        Epee Durandal = new Epee("Durandal",4,7);
        Baton Chêne = new Baton("Chene", 4, 5);
        Baton Charme = new Baton("Charme", 5, 6);
        ArrayList<Arme> stuff = new ArrayList<Arme>();
        stuff.add(Chêne);
        stuff.add(Charme);
        stuff.add(Durandal);
        stuff.add(Excalibur);
        int taille = stuff.size();
        for (int i = 0 ; i< taille; i++){
            Arme arm = stuff.get(i);
            if (i!= 0){
                System.out.println(arm);
            }
            else{
                System.out.println(arm);
            }   

    
        }
        Magicien Gandalf = new Magicien("Gandalf",65,true);
        Magicien Garcimore = new Magicien("Garcimore",44,false);
        Guerrier Conan = new Guerrier("Conan",78,false);
        Guerrier Lannister = new Guerrier("Lannister",45,true);
        ArrayList<Personnage> team = new ArrayList<Personnage>();
        team.add(Gandalf);
        team.add(Garcimore);
        team.add(Conan);
        team.add(Lannister);
        int taill = team.size();
        for (int i = 0 ; i< taill; i++){
            Personnage arm = team.get(i);
            if (i!= 0){
                System.out.println(arm);
            }
            else{
                System.out.println(arm);
            }   

    
        }

        //26. Créer 2 magiciens, avec des paramètres différents : "Gandalf",65,confirmé et "Garcimore",44,novice.
        //27. Créer 2 guerriers avec des paramètres différents : "Conan", 78, à pied et "Lannister", 45, à cheval. 
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personages;

import tp3_heroic_fantasy_morotti.etreVivant;

/**
 *
 * @author 33768
 */
public class Magicien extends Personnage implements etreVivant{
    int nb_mag=0;
    boolean Validée_par_la_street;
    
    public Magicien(String nom, int Pv, boolean diplome) {
        super(nom, Pv);
        nb_mag++;
        Validée_par_la_street =diplome;
    }
    
    public void finalize(){
        nb_mag = nb_mag-1;
    }
    
    public int attaque(){
        return 20;
    }
    
    public void modif_Qalification(){
        
        if (Validée_par_la_street==true){
            Validée_par_la_street=false;
        }
        else Validée_par_la_street=true;
    }
    
    
}

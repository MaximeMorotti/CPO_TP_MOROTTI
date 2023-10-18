/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personages;

/**
 *
 * @author 33768
 */
public class Magicien extends Personnage {
    
    boolean Validée_par_la_street;
    
    public Magicien(String nom, int Pv, boolean diplome) {
        super(nom, Pv);
        Validée_par_la_street =diplome;
        
    }
    public void modif_Qalification(){
        
        if (Validée_par_la_street==true){
            Validée_par_la_street=false;
        }
        else Validée_par_la_street=true;
    }
    
    
}

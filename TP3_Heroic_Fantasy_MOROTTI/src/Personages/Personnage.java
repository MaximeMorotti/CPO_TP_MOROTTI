/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personages;

/**
 *
 * @author 33768
 */
public abstract class Personnage {
    String Name;
    int Hp;
    public Personnage (String nom, int Pv){
        Name = nom;
        Hp = Pv;
    }
    
    public int getHp(){
        return this.Hp;
    }
    public String getName(){
        return this.Name;
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Nom du personnage: " + Name + " Points de vie du personnage: " + Hp ;
        return chaine_a_retourner ;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author 33768
 */
public abstract class Arme {
    private String Name;
    private int DamageLv;
    
    public Arme (String nom, int dégat){
        if (dégat<= 100){
            Name = nom;  
            DamageLv = dégat;

        }
        else{
            System.out.print("Molet Molet sur les dégat c'est pas une arme nucléaire quon fait là pour la peine tu ferra qu' un seul dégat");
            Name = nom;
            DamageLv = 1;
        }
    }
    public int getDamage(){
        return this.DamageLv;
    }
    public String getName(){
        return this.Name;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Nom de l'arme: " + Name + " Degats de l' arme: " + DamageLv ;
        return chaine_a_retourner ;
    }
}

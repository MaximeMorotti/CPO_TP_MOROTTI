/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author 33768
 */
public class Epee extends Arme{
    private int Finesse;
    public Epee (String nom, int fin, int dmg){
        super(nom,dmg);
        if(fin < 100){
            Finesse = fin;
        }
        if (fin>=100){
            Finesse = 99;
        }
        else {
            Finesse = 1;
        }
        
        
    }
}

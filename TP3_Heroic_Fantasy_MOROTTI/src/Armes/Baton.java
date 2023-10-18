/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author 33768
 */
public class Baton extends Arme{
    private int Age;
    public Baton (String nom, int ag, int dmg){
        super(nom,dmg);
        if(ag < 100){
            Age = ag;
        }
        if (ag>=100){
            Age =99;
        }
        else {
            Age=1;
        }
        
        
    }
}

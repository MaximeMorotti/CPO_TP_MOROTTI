/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personages;

/**
 *
 * @author 33768
 */
public class Guerrier extends Personnage{
    boolean En_Y_sur_le_T_MAX;
    public Guerrier(String nom, int Pv, boolean monture) {
        super(nom, Pv);
        En_Y_sur_le_T_MAX = monture;
        
    }
    
    public void modif_destrier(){
        
        if (En_Y_sur_le_T_MAX==true){
            En_Y_sur_le_T_MAX=false;
        }
        else En_Y_sur_le_T_MAX=true;
    }
            
}

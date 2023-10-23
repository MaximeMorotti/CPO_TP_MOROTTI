/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personages;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author 33768
 */
public abstract class Personnage {
    String Name;
    int Hp;
    ArrayList<Arme> sakado = new ArrayList<Arme>();
    Arme Arme_en_Main;
    
    public Personnage (String nom, int Pv){
        Name = nom;
        Hp = Pv;
        Arme_en_Main = null;
    }
    
    public int getHp(){
        return this.Hp;
    }
    public String getName(){
        return this.Name;
    }
    public void getweapon(Arme weap){
        if (sakado.size() >=5){
            System.out.println("Mon sac est fait!!!");
        }
        else{
            sakado.add(weap);
            if (sakado.size() == 1){
                Arme_en_Main = weap;
            }
        }
    }
    
    public void changeArme_en_Main(String nvarme){
        for(int i = 0 ; i >= this.sakado.size() ; i++){
            if (this.sakado.get(i).getName() == nvarme ){
                Arme_en_Main = this.sakado.get(i);
                System.out.println("arme équiper.");
            }
        if (Arme_en_Main != this.sakado.get(i) ){
            System.out.println("arme non posséder");
           
        }
        
            
        }
        
    }

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Nom du personnage: " + Name + " Points de vie du personnage: " + Hp "\nArme de l' inventaire: " + sakado + "\n arme équiper: " + Arme_en_Main;
        return chaine_a_retourner ;
    }
}

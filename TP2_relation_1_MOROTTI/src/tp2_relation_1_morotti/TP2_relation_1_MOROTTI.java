/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_morotti;

/**
 *
 * @author 33768
 */
public class TP2_relation_1_MOROTTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneAutreMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1 ;
        uneClio.propriétaire = bob ;
        System.out.println("la premiere voiture de Bob est une " + bob.liste_voitures[0] ) ;
        bob.liste_voitures[1] = uneClio ;
        bob.nbVoitures = 2 ;
        uneAutreClio.propriétaire = bob ;
        reno.liste_voitures[0] = une2008 ;
        reno.nbVoitures = 1 ;
        une2008.propriétaire = reno ;
        reno.liste_voitures[1] = uneMicra ;
        reno.nbVoitures = 2 ;
        uneMicra.propriétaire = reno ;
        reno.ajouter_voiture(uneAutreMicra);
        System.out.println("Voiture de bob: " + bob.liste_voitures[0] + " ; " + bob.liste_voitures[1] + "\n" + "Voiture de reno: " + reno.liste_voitures[0] + " ; " + reno.liste_voitures[1] + " ; " + reno.liste_voitures[2]) ;
// j' ai tester il print bien nul si la voiture est deja posséder
    }
}
    


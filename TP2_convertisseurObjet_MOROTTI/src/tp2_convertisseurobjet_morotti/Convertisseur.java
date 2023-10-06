/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_morotti;

/**
 * @author 33768
 * Nom:Morotti
 * Group:TDC
 * rôle: TP0
 * Date:06/10/2023
 */
public class Convertisseur {
    int nbConversions = 0 ;
    
    public double CelciusVersKelvin(double tCelcius){
        tCelcius += 273.15;
        nbConversions += 1;
        return( tCelcius);
    }
    
    public double KelvinVersCelcius(double tKelvin){
        tKelvin -= 273.15;
        nbConversions += 1;
        return( tKelvin);
    }
    
    public double FarenheitVersCelcius(double tFarenheit){
        tFarenheit = (tFarenheit - 32) / 1.8;
        nbConversions += 1;
        return( tFarenheit);
    }
    
    public double CelciusVersFarenheit(double tCelcius){
        tCelcius = (tCelcius * 1.8) + 32;
        nbConversions += 1;
        return( tCelcius);
    }
    
    public double FarenheitVersKelvin(double tFarenheit){
        tFarenheit =  this.CelciusVersKelvin(this.FarenheitVersCelcius(tFarenheit));
        nbConversions += 1;
        return( tFarenheit);
    }
    
    public double KelvinVersFarenheit(double tKelvin){
        tKelvin = this.CelciusVersFarenheit(this.KelvinVersCelcius(tKelvin));
        nbConversions += 1;
        return( tKelvin);
    }
    

    @Override
    public String toString () {
        return "nb de conversions"+ nbConversions;
    }
    
}
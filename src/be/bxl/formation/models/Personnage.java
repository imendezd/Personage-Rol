package be.bxl.formation.models;

import java.util.Locale;

public class Personnage {
    public String nom;
    public String prenom;
    public int force;
    public int pdv;
    public int pdvMax;

    private String getNomComplet(){
        return prenom + " "+ nom.toUpperCase();
    }

    //Se presenter
    public void presentation (){
        System.out.println( "Bonjour, je m'appelle "+ getNomComplet() + ". Ma force est de: " + force
                + " unités et je posede " + pdv + "/"+pdvMax+" point de vie.");
    }

    public void realiserTrajet(Lieu lieu){
        //Peut realiser de trajet  (->Destination Ville/village...)
        System.out.println(getNomComplet() + " se dirige vers " + lieu.seDecrire());
    }

    public void frapperPersonnage(Personnage cible){
        System.out.println(getNomComplet()+" a frappé à "+ cible.getNomComplet());
        cible.recevoirCoup(force);
        System.out.println("Les PDV de actuelles de " + cible.getNomComplet() + " sont "
                + cible.pdv+"/"+cible.pdvMax);
    }

    public void recevoirCoup (int puissance){
        int degat = 5 + (puissance/force/2);
        pdv=pdv-degat;
        System.out.println(getNomComplet()+ " perd " + degat + " pdv");
    }

}

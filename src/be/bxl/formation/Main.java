package be.bxl.formation;

import be.bxl.formation.models.Lieu;
import be.bxl.formation.models.Personnage;

public class Main {

    public static void main(String[] args) {

    //Lieux
    Lieu loudpard = new Lieu();
        loudpard.nom = "École de magie et de sorcellerie de loudpard";
        loudpard.typeDuLieu="Château";
        loudpard.nbInhabitants =500;

    Lieu suldecac = new Lieu();
        suldecac.nom = "Sul-de-Cac";
        suldecac.typeDuLieu="Village";
        suldecac.nbInhabitants = 149;

    //Perso
    Personnage reralt = new Personnage();
        reralt.prenom = "Reralt";
        reralt.nom = "de Givia";
        reralt.force = 10;
        reralt.pdv = 20;
        reralt.pdvMax=20;

    Personnage parry = new Personnage();
        parry.prenom = "Parry";
        parry.nom = "Hotter";
        parry.force = 7;
        parry.pdv = 17;
        parry.pdvMax = 17;

    Personnage p3= new Personnage();
        p3.prenom = "Taenerys";
        p3.nom = "Dargaryen";
        p3.force = 14;
        p3.pdv = 14;
        p3.pdvMax = 15;
    //presentations
        reralt.presentation();
        parry.presentation();

    //Parry voyage
        parry.realiserTrajet(loudpard);

    //Reralt frappe Parry
        reralt.frapperPersonnage(parry);
    }
}

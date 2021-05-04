package be.bxl.formation.models;

public class Lieu {
    public String nom;
    public String typeDuLieu;
    public int nbInhabitants;

    public String seDecrire(){
        return nom + ", un/e " + typeDuLieu + " avec " + nbInhabitants+" inhabitants";
    }
}

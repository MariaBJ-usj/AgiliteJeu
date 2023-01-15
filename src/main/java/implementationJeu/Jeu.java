package implementationJeu;

import java.util.ArrayList;

public class Jeu {
    ArrayList<Partie> parties = new ArrayList<>();;
    static int num = 0;

    public ArrayList<Partie> getParties() {
        return parties;
    }

    public void setParties(ArrayList<Partie> parties) {
        this.parties = parties;
    }

    public Jeu() {
    }

    public Partie nouvellePartie(String difficulte, String pseudoJoueur){
        num++;
        this.parties.add(new Partie(difficulte, pseudoJoueur, num));
        return this.parties.get(this.parties.size()-1);
    }

    public String chargerPartie(int partie){

        return this.parties.get(partie).ChargerPartie();
    }
}
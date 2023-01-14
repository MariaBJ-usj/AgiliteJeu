package implementationJeu;

import java.util.ArrayList;

public class Jeu {
    ArrayList<Partie> parties;

    public ArrayList<Partie> getParties() {
        return parties;
    }

    public void setParties(ArrayList<Partie> parties) {
        this.parties = parties;
    }

    public Jeu() {
        parties = new ArrayList<>();
    }

    public Partie nouvellePartie(String difficulte, String pseudoJoueur){
        int numPartie = this.parties.size()+1;
        this.parties.add(new Partie(difficulte, pseudoJoueur, numPartie));
        return this.parties.get(this.parties.size()-1);
    }

    public String chargerPartie(int partie){
        return this.parties.get(partie).ChargerPartie();
    }
}

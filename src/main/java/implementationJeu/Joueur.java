package implementationJeu;

/**
 * @author Katia.Nseir - Maria.Bou-Jawde
 * **/
public class Joueur {
    public String getPseudoJoueur() {
        return pseudoJoueur;
    }
    public void setPseudoJoueur(String pseudoJoueur) {
        this.pseudoJoueur = pseudoJoueur;
    }
    public int getNiveau() {
        return niveau;
    }
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    private String pseudoJoueur;
    private int niveau;

    public Joueur(String pseudoJoueur)
    {
        this.pseudoJoueur = pseudoJoueur;
        this.niveau = 1;
    }

    public String comparerNiveau(int niveauAdversaire) {
        String msg = "";

        if(this.niveau <= niveauAdversaire) {
            msg="implementationJeu.Joueur perd.";
        }
        else {
            this.niveau = this.niveau + 1;
            msg = "implementationJeu.Joueur gagne.";
        }
        return msg + "Niveau: "+this.niveau;
    }
}

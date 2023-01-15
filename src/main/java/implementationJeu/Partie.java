package implementationJeu;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * @author Katia.Nseir - Maria.Bou-Jawde
 * **/
public class Partie {
    private String partie;
    private Joueur joueur;
    private String difficulte;
    private String date_sauvegarde;

    @Override
    public String toString() {
        return partie;
    }

    @Override
    public boolean equals(Object o) {
        if (this.partie.equals((String)o)) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(partie, joueur, difficulte, date_sauvegarde);
    }

    public String getDate_sauvegarde() {
        return date_sauvegarde;
    }

    public void setDate_sauvegarde(Date date_sauv) {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate = DateFor.format(date_sauv);
        this.date_sauvegarde = stringDate;
    }

    public void setDate_sauvegarde(String date_sauv) {
        this.date_sauvegarde = date_sauv;
    }

    public Partie(){}

    public String getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(String difficulte) {
        this.difficulte = difficulte;
    }

    public Partie(String choix, String pseudoJoueur, int numero) {
        this.difficulte = choix;
        this.joueur = new Joueur(pseudoJoueur);
        Date date = new Date();
        this.setDate_sauvegarde(date);
        this.partie = "partie"+numero;
    }

    public void setPartie(String partie) {
        this.partie = partie;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public String ChargerPartie(){
        return "implementationJeu.Partie " + this.difficulte + " de "
                + this.joueur.getPseudoJoueur() + " du "
                + this.date_sauvegarde +" est chargée!";
    }
}

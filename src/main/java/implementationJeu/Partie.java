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

    @Override
    public String toString() {
        return partie;
    }

    @Override
    public boolean equals(Object partieToCompare) {
        if (this.toString() == ((String)partieToCompare)) return true;
        if (this.toString() != ((String)partieToCompare)) return false;
        return this.equals(partieToCompare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partie);
    }

    private String date_sauvegarde;
    public void setDate_sauvegarde(Date date_sauv) {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate = DateFor.format(date_sauv);
        this.date_sauvegarde = stringDate;
    }
    public Partie(String choix, String pseudoJoueur, int numero) {
        this.difficulte = choix;
        this.joueur = new Joueur(pseudoJoueur);
        Date date = new Date();
        this.setDate_sauvegarde(date);
        this.partie = "partie"+numero;
    }

    public String ChargerPartie(){
        return "implementationJeu.Partie " + this.difficulte + " de "
                + this.joueur.getPseudoJoueur() + " du "
                + this.date_sauvegarde +" est chargée!";
    }
}

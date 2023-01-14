package stepDefinition;
import static org.junit.Assert.assertTrue;
import implementationJeu.Jeu;
import implementationJeu.Partie;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_000_Nouvelle_Partie {
    Jeu jeu;
    String nouvellePartieExpected;

    @Given("Le lancement du jeu par le joueur pour creer une nouvelle partie")
    public void lancement_du_jeu() {
        // Write code here that turns the phrase above into concrete actions
        jeu = new Jeu();
    }
    @When("Le joueur saisi la difficulté {string} de la nouvelle partie et son surnom {string}")
    public void joueur_saisie_la_difficulte_et_son_surnom(String difficulte, String pseudoJoueur) {
        // Write code here that turns the phrase above into concrete actions
        nouvellePartieExpected = jeu.nouvellePartie(difficulte, pseudoJoueur).toString();
    }
    @Then("La nouvelle partie {string} est créée")
    public void nouvelle_partie_est_créée(String nouvellePartieExpected) {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(this.jeu.getParties().get(this.jeu.getParties().size()-1).equals(nouvellePartieExpected));
    }
}

package testJUnit;

import implementationJeu.Partie;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PartieTest {
    private static Partie partie;

    @BeforeEach
    public void setUp() {
        PartieTest.partie = new Partie("facile", "TheBest",0);
    }

    @Test
    public void testchargerPartie() {
        PartieTest.partie.setDate_sauvegarde("10/09/2022");

        String actual = PartieTest.partie.ChargerPartie();

        String expected = "Partie facile de TheBest du 10/09/2022 est chargée!";

        assertEquals(actual, expected);



    }
}

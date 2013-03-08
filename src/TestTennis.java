import static org.junit.Assert.*;

import org.junit.Test;

public class TestTennis {

	Partie partie = new Partie();

	@Test
	public void quandNouvellePartieLeScoreDevraitEtreZeroAZero() {
		assertEquals("0-0", partie.calculerScore());
	}

	@Test
	public void quandJoueur1MarqueLeScoreDevraitEtre15A0() {
		partie.joueur1Marque();
		assertEquals("15-0", partie.calculerScore());
	}

	@Test
	public void quandJoueur1Et2MarquentLeScoreDevraitEtre15a() {
		lesJoueurMarquent(1, 1);
		assertEquals("15.a", partie.calculerScore());
	}

	@Test
	public void quandJoueur1MarqueDeuxFoisEt2MarqueUneFoisLeScoreDevraitEtre30A15() {
		lesJoueurMarquent(2, 1);
		assertEquals("30-15", partie.calculerScore());
	}

	@Test
	public void quandJoueur1Et2Marquent2FoisLeScoreDevraitEtre30a() {
		lesJoueurMarquent(2, 2);
		assertEquals("30.a", partie.calculerScore());
	}

	@Test
	public void quandJoueur1MarqueTroiFoisEt2MarqueDeuxFoisLeScoreDevraitEtre40A30() {
		lesJoueurMarquent(3, 2);
		assertEquals("40-30", partie.calculerScore());
	}

	@Test
	public void quandJoueur1MarqueTroiFoisEt2MarqueTroisFoisLeScoreDevraitEtreEgalite() {
		lesJoueurMarquent(3, 3);
		assertEquals("Egalité", partie.calculerScore());
	}

	@Test
	public void quandJoueur1MarqueQuatreFoisEt2MarqueDeuxFoisLeJoueur1AGagne() {
		lesJoueurMarquent(4, 2);
		assertEquals("Joueur1 a gagné", partie.calculerScore());
	}

	@Test
	public void quandJoueur1MarqueDeuxFoisEt2MarqueQuatreFoisLeJoueur2AGagne() {
		lesJoueurMarquent(2, 4);
		assertEquals("Joueur2 a gagné", partie.calculerScore());
	}

	private void lesJoueurMarquent(int nbJoueur1, int nbJoueur2) {
		for (int i = 0; i < nbJoueur1; ++i)
			partie.joueur1Marque();

		for (int i = 0; i < nbJoueur2; ++i)
			partie.joueur2Marque();

	}

}

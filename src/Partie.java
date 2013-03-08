public class Partie {

	private int scoreJoueur1 = 0;
	private int scoreJoueur2 = 0;

	int[] tabScore = { 0, 15, 30, 40 };

	public String calculerScore() {
		if (scoreJoueur1 == 4)
			return "Joueur1 a gagné";
		if (scoreJoueur2 == 4)
			return "Joueur2 a gagné";

		if (estAEgalite())
			if (scoreJoueur1 >= 3)
				return "Egalité";
			else
				return tabScore[scoreJoueur1] + ".a";

		return tabScore[scoreJoueur1] + "-" + tabScore[scoreJoueur2];
	}

	private boolean estAEgalite() {
		return !estDebutPartie() && tabScore[scoreJoueur1] == tabScore[scoreJoueur2];
	}

	private boolean estDebutPartie() {
		return tabScore[scoreJoueur1] == 0 && tabScore[scoreJoueur2] == 0;
	}

	public void joueur1Marque() {
		++scoreJoueur1;
	}

	public void joueur2Marque() {
		++scoreJoueur2;

	}
}

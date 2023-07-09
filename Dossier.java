import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class Dossier extends Composant {
    private List<Composant> enfants;

    public Dossier(String nom) {
        super(nom);
        enfants = new ArrayList<>();
    }

    @Override
    public void afficher() {
        System.out.println("|-- " + nom);
        for (Composant enfant : enfants) {
            if (enfant instanceof Dossier) {
                ((Dossier) enfant).afficher("|   ");
            } else {
                enfant.afficher();
            }
        }
    }

    private void afficher(String prefix) {
        System.out.println(prefix + "|-- " + nom);
        for (Composant enfant : enfants) {
            if (enfant instanceof Dossier) {
                ((Dossier) enfant).afficher(prefix + "|   ");
            } else {
                enfant.afficher();
            }
        }
    }

    @Override
    public void ajouterEnfant(Composant enfant) {
        enfants.add(enfant);
    }

    @Override
    public void supprimerEnfant(Composant enfant) {
        enfants.remove(enfant);
    }
}

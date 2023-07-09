import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class Fichier extends Composant {
    public Fichier(String nom) {
        super(nom);
    }

    @Override
    public void afficher() {
        System.out.println("|-- " + nom);
    }
    

    @Override
    public void ajouterEnfant(Composant enfant) {
        // Ne peut pas ajouter d'enfant car c'est un fichier
    }

    @Override
    public void supprimerEnfant(Composant enfant) {
        // Ne peut pas supprimer d'enfant car c'est un fichier
    }
}

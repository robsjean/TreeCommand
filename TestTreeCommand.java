import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class TestTreeCommand {
    public static void main(String[] args) {
        // Chemin du répertoire à afficher
        String cheminRepertoire = "C:\\Users\\vincent\\Desktop\\DIC1\\Semestre 2\\Design Pattern";

        // Création du dossier racine
        Dossier dossierRacine = new Dossier("Arborescence");

        // Appel de la méthode pour afficher l'arborescence
        afficherArborescence(new File(cheminRepertoire), dossierRacine, 0);

        // Affichage de l'arborescence
        dossierRacine.afficher();
    }

    private static void afficherArborescence(File fichier, Dossier parent, int niveau) {
        if (fichier.isDirectory()) {
            Dossier dossier = new Dossier(fichier.getName());
            parent.ajouterEnfant(dossier);

            File[] fichiers = fichier.listFiles();
            if (fichiers != null) {
                for (File f : fichiers) {
                    afficherArborescence(f, dossier, niveau + 1);
                }
            }
        } else {
            Fichier fichierFeuille = new Fichier(fichier.getName());
            parent.ajouterEnfant(fichierFeuille);
        }
    }
}

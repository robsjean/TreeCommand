import java.io.File;

public class TestTreeCommand {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez spécifier le chemin du dossier dont vous voulez voir l'arborescence.");
            return;
        }

        String cheminRepertoire = args[0];
        File dossier = new File(cheminRepertoire);

        if (!dossier.exists() || !dossier.isDirectory()) {
            System.out.println("Le chemin spécifié n'est pas un dossier valide.");
            return;
        }

        afficherArborescence(dossier, "");
    }

    private static void afficherArborescence(File dossier, String indentation) {
        // Récupération des fichiers et sous-dossiers du dossier courant
        File[] fichiers = dossier.listFiles();
        if (fichiers != null) {
            for (int i = 0; i < fichiers.length; i++) {
                File fichier = fichiers[i];
                if (fichier.isDirectory()) {
                    // Affichage du nom du dossier avec indentation
                    System.out.println(indentation + "|-- " + fichier.getName());
                    // Appel récursif pour afficher l'arborescence des sous-dossiers
                    afficherArborescence(fichier, indentation + "    ");
                } else {
                    // Affichage du nom du fichier décalé vers la droite
                    System.out.println(indentation + "    |-- " + fichier.getName());
                }
            }
        }
    }
}

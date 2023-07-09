public abstract class Composant {
    protected String nom;

    public Composant(String nom) {
        this.nom = nom;
    }

    public abstract void afficher();

    public abstract void ajouterEnfant(Composant enfant);

    public abstract void supprimerEnfant(Composant enfant);
}

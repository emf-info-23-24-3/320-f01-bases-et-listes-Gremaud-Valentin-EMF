package models;

public class Personne {
    // nom, prenom, rue et localite ainsi qu'un npa

    private String nom;
    private String prenom;
    private String rue;
    private int localite;

    public Personne(String nom, String prenom, String rue, int localite) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.localite = localite;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getRue() {
        return rue;
    }

    public int getLocalite() {
        return localite;
    }

}

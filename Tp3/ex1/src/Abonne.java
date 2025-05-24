public class Abonne {
    private String nom;
    private String prenom;
    private int cin;
    public Abonne(String nom, String prenom, int cin) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
    }
    @Override
    public String toString() {
        return "Abonne [nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + "]";
    }
    public String getNom() {
        return nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public int getCin() {
        return cin;
    }
    



}

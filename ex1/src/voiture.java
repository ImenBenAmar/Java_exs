import java.util.ArrayList;
public class voiture {
    private static ArrayList<voiture> voitures = new ArrayList<>();

    private String marque;
    private String modele;

    // Constructeur pour initialiser une voiture
    public voiture(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
        // Ajouter la voiture à la liste des voitures
        voitures.add(this);
    }

    // Méthode statique pour obtenir le nombre total de voitures
    public static int nombreDeVoitures() {
        return voitures.size();
    }

    // Exemple d'utilisation
    public static void main(String[] args) {
        voiture voiture1 = new voiture("Toyota", "Corolla");
        voiture voiture2 = new voiture("Honda", "Civic");
        voiture voiture3 = new voiture("Ford", "Focus");

        System.out.println("Nombre de voitures: " + voiture.nombreDeVoitures());  // Affiche "Nombre de voitures: 3"
    }
}

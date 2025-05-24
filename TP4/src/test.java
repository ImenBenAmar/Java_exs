
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Traitement traitement = new Traitement();

        try {
            // Ajouter un produit
            Produit produitAjoute = new Produit("TestProduct", 100.0);
            traitement.addProduit(produitAjoute);
            System.out.println("Produit ajouté: " + produitAjoute);

            // Rechercher le produit ajouté
            ArrayList<Produit> produits = traitement.search("TestProduct");
            if (!produits.isEmpty()) {
                Produit produitTrouve = produits.get(0);
                System.out.println("Produit trouvé: " + produitTrouve);

                // Modifier le produit
                produitTrouve.setLibelle("UpdatedProduct");
                produitTrouve.setPrix(120.0);
                traitement.updateProduit(produitTrouve);
                System.out.println("Produit mis à jour: " + produitTrouve);

                // Rechercher le produit mis à jour
                ArrayList<Produit> produitsMisAJour = traitement.search("UpdatedProduct");
                if (!produitsMisAJour.isEmpty()) {
                    Produit produitMisAJour = produitsMisAJour.get(0);
                    System.out.println("Produit mis à jour trouvé: " + produitMisAJour);

                    // Supprimer le produit
                    traitement.deleteProduit(produitMisAJour.getId());
                    System.out.println("Produit supprimé: " + produitMisAJour);

                    // Vérifier si le produit a été supprimé
                    ArrayList<Produit> produitsApresSuppression = traitement.search("UpdatedProduct");
                    if (produitsApresSuppression.isEmpty()) {
                        System.out.println("Le produit a été supprimé avec succès.");
                    } else {
                        System.out.println("Erreur: le produit n'a pas été supprimé.");
                    }
                }
            } else {
                System.out.println("Erreur: le produit n'a pas été trouvé.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


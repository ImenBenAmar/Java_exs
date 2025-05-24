import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Traitement {
    Connection con = Connectoptimale.gConnection();

    // Méthode pour rechercher des produits par mot-clé
    public ArrayList<Produit> search(String mc) throws SQLException {
        PreparedStatement ps = con.prepareStatement("SELECT * FROM produits WHERE NOM_PRODUIT LIKE ? ");
        ps.setString(1, "%" + mc + "%");
        ResultSet res = ps.executeQuery();
        ArrayList<Produit> liste = new ArrayList<>();
        while (res.next()) {
            Produit p = new Produit();
            p.setId(res.getInt(1));
            p.setLibelle(res.getString(2));
            p.setPrix(res.getDouble(3));
            liste.add(p);
        }
        return liste;
    }

    // Méthode pour ajouter un produit
    public void addProduit(Produit produit) throws SQLException {
        PreparedStatement ps = con.prepareStatement("INSERT INTO produits (NOM_PRODUIT, PRIX_PRODUIT) VALUES (?, ?)");
        ps.setString(1, produit.getLibelle());
        ps.setDouble(2, produit.getPrix());
        ps.executeUpdate();
    }

    // Méthode pour modifier un produit
    public void updateProduit(Produit produit) throws SQLException {
        PreparedStatement ps = con.prepareStatement("UPDATE produits SET NOM_PRODUIT = ?, PRIX_PRODUIT = ? WHERE ID_PRODUIT = ?");
        ps.setString(1, produit.getLibelle());
        ps.setDouble(2, produit.getPrix());
        ps.setInt(3, produit.getId());
        ps.executeUpdate();
    }

    // Méthode pour supprimer un produit
    public void deleteProduit(int id) throws SQLException {
        PreparedStatement ps = con.prepareStatement("DELETE FROM produits WHERE ID_PRODUIT = ?");
        ps.setInt(1, id);
        ps.executeUpdate();
    }
}

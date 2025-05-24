import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class Traitement {
    Connection con=Connectoptimale.gConnection();
    public ArrayList<Produit> search(String mc) throws SQLException{
        PreparedStatement ps=con.prepareStatement("SELECT * FROM produits WHERE NOM_PRODUIT LIKE ? ");
        ps.setString(1,"%"+mc+"%");
        ResultSet res=ps.executeQuery();
        ArrayList<Produit> liste= new ArrayList<>();
        while(res.next())
        {
            Produit p =new Produit();
            p.setId(res.getInt(1));
            p.setLibelle(res.getString(2));
            p.setPrix(res.getDouble(3));
            liste.add(p);
        }
        return liste;



    }

}

import java.sql.*;

public class Connect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
            String url = "jdbc:mysql://localhost:3306/catalogue";
            String user = "root";
            String pwd = "";
            Connection con = DriverManager.getConnection(url, user, pwd);
            System.out.println("Connected");
            Produit p = new Produit("lib2",300);
            PreparedStatement ps=  con.prepareStatement("INSERT INTO produits (NOM_PRODUIT, PRIX) VALUES (?, ?)");
            ps.setString(1, p.getLibelle());
            ps.setDouble(2, p.getPrix());
            ps.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


import java.util.TreeMap;

public class Abonnements {
    private TreeMap<String,Categorie>mt=new TreeMap<String,Categorie>();
    public Abonnements(){
        mt.put("bronze", new Categorie(10));
        mt.put("Silver", new Categorie(20));
        mt.put("bronze", new Categorie(30));
    }

    void retirer(String c, int cin){
        mt.get(c).retirer(String.valueOf(cin));

    }
    

}

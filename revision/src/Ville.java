public class Ville {
    private final String nom; 
    private int number;
    public Ville(String nom,int number){
        this.nom=nom;
        this.number=number;
    }
    public Ville(String nom){
        this.nom=nom;
    }
    public String toString(){
        return "Ville de nom"+nom+number; 
       
    }
}

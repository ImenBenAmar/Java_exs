public class Capitale extends Ville{ 
    
    private String pays;

    public Capitale(String nom, int number,String pays) {
        super(nom, number);
        this.pays=pays;
    }

    public Capitale(String nom, String pays) {
        super(nom);
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "Capitale [pays=" + pays + ", toString()=" + super.toString() + "]";
    }
    
  

}

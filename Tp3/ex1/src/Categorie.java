import java.util.ArrayList;

public class Categorie {
    private ArrayList<Abonne> liste = new ArrayList<Abonne>();
    private float prixad;

    public void ajouterAbonne(Abonne A) throws RedondanceException {
        for (Abonne a : liste) {
            if (a.getCin() == A.getCin()) {
                throw new RedondanceException();
            }
        }
        liste.add(A);
    }

    public Categorie(float prixad) {
        this.prixad = prixad;
    }
    public void retirer(String cin) throws NumberFormatException{
        int cin_conv;
        try{
            cin_conv=Integer.parseInt(cin);
        }
        catch(NumberFormatException e){
            cin_conv=0;

        }
        for (int i=0;i<liste.size();i++) {
            if(liste.get(i).getCin()==cin_conv){
                liste.remove(i);
            } 
        }
    }
    public int nombre_abonné(){
        int size=liste.size();
        return size;
    }
    public String toString(){
        String c="";
        for (Abonne abonne : liste) {
             c+=abonne.toString(); 
        }
        return c;
    }
    public boolean EstPresent(Abonne A){
        for(int i=0;i<liste.size();i++){
            if (A.getCin()==liste.get(i).getCin()){
                return true;
            }
        }
        return false;
    }

   
}

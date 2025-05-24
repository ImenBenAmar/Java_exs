import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Commande {
    private  Set <Produit> liste;
    private float Prixtot;
    public Commande() {
        liste=new HashSet<Produit>();
        Prixtot=0;

    }
    public void ajoutProduit(Produit P){
        liste.add(P);
        Prixtot+=P.getPrixProd();

    }
    public void retirerProduit(int num){
       for (Produit p : liste) {
        if (p.getNumProd()==num){
            liste.remove(p);
        }
       }
    }
    public int nombreProd(){
        return liste.size();
    }
    @Override
    public String toString() {
        return "Commande [liste=" + liste + ", Prixtot=" + Prixtot + "]";
    }
    public boolean estPresent(Produit P){
        return liste.contains(P);

    }
    

}

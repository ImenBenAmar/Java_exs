import java.util.ArrayList;
public class commandes {
    private ArrayList<Commande> cmde=new ArrayList<Commande>();
    public void ajoutComnd(Commande c){
        cmde.add(c);
    }
    public ArrayList<Commande> recherche (Produit P){
        ArrayList<Commande>listecmd=new ArrayList<Commande>();
        for (Commande commande : cmde) {
            if(commande.estPresent(P)){
                listecmd.add(commande);
            }
        }
        return listecmd;
    }

}

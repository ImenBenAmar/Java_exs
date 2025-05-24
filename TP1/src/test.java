public class test {
    public static void main(String Args[]){
        Produit P1=new Produit("bakouHlib","delice", 2, 1350);
        Produit P2=new Produit("chengum","ballon",3 , 300);
        Produit P3=new Produit("jus","tropico",3 , 300);
        Commande cmd=new Commande();
        cmd.ajoutProduit(P3);
        System.out.println(cmd.toString());
        cmd.ajoutProduit(P3);
        commandes cmdes=new commandes();
        cmdes.ajoutComnd(cmd);
        System.out.println(cmdes.recherche(P3).toString());

    }
}

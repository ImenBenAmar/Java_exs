public class Rectangle extends Forme{
    private int longeur ;
    private int largeur;
    public float perimetre(){
        return (longeur+largeur)*2;
    }
    public float surface(){
        return longeur*largeur;
    }
    public Rectangle(int longeur, int largeur) {
        this.longeur = longeur;
        this.largeur = largeur;
    }

}

import java.math.*;
public class Cercle extends Forme {
    private float rayon;
    public float perimetre(){
        return 2*(float)Math.PI*rayon;
    }
    public Cercle(float rayon) {
        this.rayon = rayon;
    }
    public float surface(){
        return (float)Math.PI *rayon*rayon;
    }
}

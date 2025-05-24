public abstract class Forme {
    public abstract float perimetre();
    public abstract float surface();
    public void contenantCarre(float surf){
        if (surface()>surf ){
            System.out.println("cette forme peut contenir un carre de surface surf ");
        }
        else{
            System.out.println("cette forme ne peutpas contenir un carre de surface surf");
        }


    }


}

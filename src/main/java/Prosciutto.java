public class Prosciutto extends Pizza {
    public Prosciutto(){
        super("Prosciutto" + " Domino");
        Recette.add(new TomatoSauce());
        Recette.add(new Ham());
    }
}

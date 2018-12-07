public class FruttiDiMare extends Pizza {
    public FruttiDiMare(){
        super("Frutti Di Mare" + " Domino");
        Recette.add(new TomatoSauce());
        Recette.add(new SeaFood());
    }
}

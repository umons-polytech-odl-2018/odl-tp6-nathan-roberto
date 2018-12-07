public class Carbonara extends Pizza {
    Carbonara(){
        super("Carbonara" + " Domino");
        Recette.add(new WhiteCream());
        Recette.add(new Ham());
    }
}

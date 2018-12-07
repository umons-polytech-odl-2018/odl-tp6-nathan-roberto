public class Ingrédient implements nourriture{
    protected float price;
    protected String name;
    @Override
    public float getPrice(){return price;}
    @Override
    public String getName(){return name;}
}

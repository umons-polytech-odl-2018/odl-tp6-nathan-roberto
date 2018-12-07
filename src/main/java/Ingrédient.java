public abstract class Ingrédient implements nourriture{
    protected float price;
    protected String name;

    public Ingrédient(String name, float price){
        this.name = name;
        this.price = price;
    }

    @Override
    public float getPrice(){return price;}
    @Override
    public String getName(){return name;}

    public void setPrice(float price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return ("Nom Ingrédient :" + name + "\n Prix:" + price);
    }
}

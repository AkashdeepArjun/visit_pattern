package home;

public class Fruit implements Item {

    String name;
    int weight;
    int price_per_kg;

    public Fruit(String name,int weight,int price_per_kg){
        this.name=name;
        this.weight=weight;
        this.price_per_kg=price_per_kg;
    }

    public String getName(){return this.name;}
    public int getWeight(){
        return this.weight;
    }
    public int getPrice(){return this.price_per_kg;}


    @Override
    public int accept(ShoppingCartVisitor visitor) {
       
        return visitor.visit(this);
    }
}

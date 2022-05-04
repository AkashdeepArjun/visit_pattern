package home;

public class Client{
    public static void main(String[] args){

        Item items[]={new Book("twilight", "poplu", 400),new Fruit("Kela", 20, 60)};
        ShoppingCartVisitorImp visitor  = new ShoppingCartVisitorImp();

        int total_cost=0;

        for(Item item:items){
            total_cost+=item.accept(visitor);
        }

        MyUtils.log("CLIENT TOTAL COST OF ITEMS IS $",String.valueOf(total_cost));

    }
    
}
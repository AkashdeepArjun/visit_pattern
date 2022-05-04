package home;

public class ShoppingCartVisitorImp  implements ShoppingCartVisitor{
    @Override
    public int visit(Book book) {
            int cost=0;
            int book_cost=book.getPrice();
            if(book_cost >50){
                cost=book_cost-5;
            }else{
                cost=book_cost;
            }
            MyUtils.log("BOOK COST ", String.valueOf(cost));
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {

        int cost=fruit.getPrice()*fruit.getWeight();
        MyUtils.log("FRUIT COST ", String.valueOf(cost));
        return cost;
    }
}

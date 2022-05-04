package home;

public class Book implements Item{
    private int price;
    private String author;
    private String name;

    public Book(String name,String author,int price){

        this.name=name;
        this.author=author;
        this.price=price;
    }

    public String getName(){
        return this.name;

    }

    public String getAuthor(){
        return this.author;
    }

    public int getPrice(){
       
       return this.price;}
    


@Override
public int accept(ShoppingCartVisitor visitor) {
   
    return visitor.visit(this);
    
}

}

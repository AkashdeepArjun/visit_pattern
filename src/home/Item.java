package home;

public interface Item {
 
    public int accept(ShoppingCartVisitor visitor);
}

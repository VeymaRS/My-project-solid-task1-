import java.util.*;

public class Basket{
    List<Product> basketList = new ArrayList<>();

    public Basket addProduct(Product product) {
        basketList.add(product);
        return this;
    }

    public void printListIterator() {
        Iterator<Product> it = basketList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}

package ex1.p2;

public class GenericItem {

    int id;
    String name;
    float price;
    GenericItem analog;
    Category category = Category.GENERAL;

    public void printAll(){
        System.out.printf("itemId: %d, name: %s, price: %.2f, category: %s\n",
                id,
                name,
                price,
                category);
    }
}

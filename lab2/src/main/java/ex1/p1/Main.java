package ex1.p1;

public class Main {
    public static void main(String[] args) {
        GenericItem item = new GenericItem();
        item.id = 0;
        item.name = "Bread";
        item.price = 34.56f;

        GenericItem item1 = new GenericItem();
        item1.id = 1;
        item1.name = "Salt";
        item1.price = 28.34f;

        GenericItem item2 = new GenericItem();
        item2.id = 2;
        item2.name = "Pepper";
        item2.price = 27.35f;

        item.printAll();
        item1.printAll();
        item2.printAll();
    }
}

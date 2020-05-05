package ex2.p2;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        GenericItem item = new GenericItem();
        item.id = 0;
        item.name = "Bread";
        item.price = 34.56f;

        GenericItem item2 = new GenericItem();
        item2.id = 0;
        item2.name = "Bread";
        item2.price = 34.56f;

        System.out.println(item.equals(item2));
        System.out.println(item.equals(item.clone()));
    }
}

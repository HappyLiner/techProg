package ex2.p3;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        GenericItem item = new GenericItem();
        item.id = 0;
        item.name = "Bread";
        item.price = 34.56f;

        GenericItem item2 = item.clone();
        System.out.println(item.equals(item.clone()));
    }
}

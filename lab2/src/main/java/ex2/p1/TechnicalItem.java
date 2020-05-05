package ex2.p1;

public class TechnicalItem extends GenericItem{

    short warrantyTime;

    @Override
    public void printAll() {
        System.out.printf("itemId: %d, " +
                        "name: %s, " +
                        "price: %.2f, " +
                        "category: %s, " +
                        "warranty time: %d\n",
                id,
                name,
                price,
                category,
                warrantyTime);
    }
}

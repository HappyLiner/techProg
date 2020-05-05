import java.util.Date;

public class FoodItem extends GenericItem {

    Date dateOfIncome;
    short expires;

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        super(name, price, analog);
        this.dateOfIncome = date;
        this.expires = expires;
        this.category = Category.FOOD;
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, new Date(), expires);
    }

    public FoodItem(String name) {
        this(name, 0, null, new Date(), (short) 100);
    }

    @Override
    public void printAll() {
        System.out.printf("itemId: %d, " +
                        "name: %s, " +
                        "price: %.2f, " +
                        "category: %s, " +
                        "date of income: %tY-%tm-%td %tH:%tM, " +
                        "expires: %d\n",
                id,
                name,
                price,
                category,
                dateOfIncome,
                dateOfIncome,
                dateOfIncome,
                dateOfIncome,
                dateOfIncome,
                expires);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FoodItem foodItem = (FoodItem) o;
        return expires == foodItem.expires &&
                dateOfIncome.equals(foodItem.dateOfIncome);
    }

    @Override
    protected FoodItem clone() {
        FoodItem clone = (FoodItem) super.clone();
        clone.dateOfIncome = dateOfIncome;
        clone.expires = expires;
        return clone;
    }
}

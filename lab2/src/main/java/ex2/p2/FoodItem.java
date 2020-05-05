package ex2.p2;

import java.util.Date;
import java.util.Objects;

public class FoodItem extends GenericItem {

    Date dateOfIncome;
    short expires;

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

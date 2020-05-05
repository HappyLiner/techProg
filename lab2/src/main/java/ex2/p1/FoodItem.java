package ex2.p1;

import java.util.Date;

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
}

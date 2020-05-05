package ex2.p2;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TechnicalItem that = (TechnicalItem) o;
        return warrantyTime == that.warrantyTime;
    }

    @Override
    protected TechnicalItem clone() {
        TechnicalItem clone = (TechnicalItem) super.clone();
        clone.warrantyTime = warrantyTime;
        return clone;
    }
}

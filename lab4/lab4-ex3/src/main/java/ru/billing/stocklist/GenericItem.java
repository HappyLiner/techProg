package ru.billing.stocklist;

public class GenericItem {

    public static final String DATE_FORMAT = "yyyy-MM-dd H:M";

    private static int currentId = 0;

    private int id;
    private String name;
    private float price;
    private GenericItem analog;
    private Category category = Category.GENERAL;

    public GenericItem(String name, float price, Category category) {
        this();
        this.name = name;
        this.price = price;
        this.category = category;
        analog = null;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this(name, price, Category.GENERAL);
        this.analog = analog;
    }

    public GenericItem() {
        id = currentId;
        currentId++;
    }

    public void printAll(){
        System.out.printf("itemId: %d, " +
                        "name: %s, " +
                        "price: %.2f, " +
                        "category: %s\n",
                id,
                name,
                price,
                category);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericItem item = (GenericItem) o;
        boolean analogEquals;
        if(analog == null) analogEquals = item.analog == null;
        else analogEquals = analog.equals(item.analog);
        return id == item.id &&
                Float.compare(item.price, price) == 0 &&
                name.equals(item.name) &&
                analogEquals &&
                category == item.category;
    }

    @Override
    protected GenericItem clone() {
        try{
            return (GenericItem) super.clone();
        } catch (CloneNotSupportedException e){
            GenericItem clone = new GenericItem();
            clone.id = id;
            clone.name = name;
            clone.price = price;
            if(analog != null) clone.analog = analog.clone();
            else clone.analog = null;
            clone.category = category;
            return clone;
        }
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        GenericItem.currentId = currentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public GenericItem getAnalog() {
        return analog;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

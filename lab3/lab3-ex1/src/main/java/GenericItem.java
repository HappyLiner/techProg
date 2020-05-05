import java.util.Objects;

public class GenericItem {

    private static int currentId = 0;

    int id;
    String name;
    float price;
    GenericItem analog;
    Category category = Category.GENERAL;

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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        GenericItem item = (GenericItem) o;
//        boolean analogEquals;
//        if(analog == null) analogEquals = item.analog == null;
//        else analogEquals = analog.equals(item.analog);
//        return id == item.id &&
//                Float.compare(item.price, price) == 0 &&
//                name.equals(item.name) &&
//                analogEquals &&
//                category == item.category;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericItem item = (GenericItem) o;
        return id == item.id &&
                Float.compare(item.price, price) == 0 &&
                name.equals(item.name) &&
                Objects.equals(analog, item.analog) &&
                category == item.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, analog, category);
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
}

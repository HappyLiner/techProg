public class ItemParser {

    public static String[] examples = {
            "coffee;234.45;100",
            "milk;65.4;10",
            "bread;45.45;100",
            "mayo;95.45;100",
            "butter;75.4;30",
            "eggs;65.45;10",
            "coffee;234.45;100",
            "coffee;234.45;100",
            "coffee;234.45;100",
    };

    /**
     * Method create GenericItem from string
     * @param item represent item as "<name>;<price>;<expires>"
     * @return
     */
    public static FoodItem parse(String item){
        String[] tokens = item.split(";");
        return new FoodItem(tokens[0], Float.parseFloat(tokens[1]), Short.parseShort(tokens[2]));
    }
}

public class ItemParser {

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

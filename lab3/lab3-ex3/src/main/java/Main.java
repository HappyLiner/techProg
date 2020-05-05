public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        String[] items = {
                "Bread;45.30;10",
                "Milk;65.20;10"
        };
        for(String s: items){
            ItemParser.parse(s).printAll();
        }
    }
}

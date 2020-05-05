import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        String[] items = {
                "Coffee;234.34;100",
                "Coffee;234.34;100",
                "Coffee;234.34;100",
                "Coffee;234.34;100",
                "Coffee;234.34;100",
                "Coffee;234.34;100",
                "Coffee;234.34;100",
                "Coffee;234.34;100",
                "Coffee;234.34;100",
                "Coffee;234.34;100",
                "Coffee;234.34;100",
                "Coffee;234.34;100",
                "Coffee;234.34;100"
        };
        ItemCatalog catalog = new ItemCatalog();
        for (String str : items) {
            catalog.addItem(ItemParser.parse(str));
        }
        long[] timeFindHashMap = new long[100];
        long[] timeFindArrayList = new long[100];

        for (int i = 0; i < 100; i++) {
            timeFindHashMap[i] = getTimeFindHashMap(catalog, 10);
            timeFindArrayList[i] = getTimeFindArrayList(catalog, 10);
        }

        System.out.println("time in hash map: " + middle(timeFindHashMap));
        System.out.println("time in array list: " + middle(timeFindArrayList));
    }

    private static long getTimeFindArrayList(ItemCatalog catalog, int id) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++)
            catalog.findItemInArrayList(id);
        return System.currentTimeMillis() - start;
    }

    private static long getTimeFindHashMap(ItemCatalog catalog, int id) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++)
            catalog.findItemInHashMap(id);
        return System.currentTimeMillis() - start;
    }

    private static long middle(long[] longs) {
        long sum = 0;
        for (long l : longs) {
            sum += l;
        }
        return sum / longs.length;
    }
}

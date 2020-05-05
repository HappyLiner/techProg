import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {

    private HashMap<Integer, GenericItem> catalogHashMap = new HashMap<>();
    private ArrayList<GenericItem> catalogArrayList = new ArrayList<>();

    public void addItem(GenericItem item) {
        catalogArrayList.add(item);
        catalogHashMap.put(item.id, item);
    }

    public void printItems() {
        for (GenericItem i : catalogArrayList) {
            System.out.println(i);
        }
    }

    public GenericItem findItemInHashMap(int id){
        return catalogHashMap.get(id);
    }

    public GenericItem findItemInArrayList(int id){
        for (GenericItem i : catalogArrayList){
            if(i.id == id) return i;
        }
        return null;
    }
}

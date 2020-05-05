public class CatalogStubLoader implements CatalogLoader {
    @Override
    public void load(ItemCatalog catalog) {
        for(String str : ItemParser.examples){
            catalog.addItem(ItemParser.parse(str));
        }
    }
}

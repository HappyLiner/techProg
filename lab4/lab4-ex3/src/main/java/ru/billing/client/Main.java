package ru.billing.client;

import ru.billing.stocklist.ItemCatalog;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        ItemCatalog catalog = new ItemCatalog();

        CatalogStubLoader stubLoader = new CatalogStubLoader();
        stubLoader.load(catalog);
    }

}

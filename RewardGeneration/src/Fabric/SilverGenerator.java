package Fabric;

import Interface.iGameItem;
import Product.SilverRevard;

public class SilverGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new SilverRevard();
    }    
}

package Fabric;

import Interface.iGameItem;
import Product.BronseReward;


public class BronseGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new BronseReward();
    }        
}

package Fabric;

import Interface.iGameItem;
import Product.TinReward;

public class TinGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new TinReward();
    }       
}
